/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： SecurityConfig.java
 * 2021-1-5 - create by Tao.
 *
 */

package tao.courseDesign.common.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/static/**", "/home/**").permitAll()
                .antMatchers("/admin/**").authenticated()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/login").defaultSuccessUrl("/admin/list-news")
                .failureForwardUrl("/error")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .invalidateHttpSession(true)
                .logoutSuccessUrl("/index")
                .permitAll()
                .and()
                .csrf()
                .disable();

    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        // 忽略URL
//        web.ignoring().antMatchers("/static/**");
//    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password(new BCryptPasswordEncoder().encode("admin")).roles("admin");
    }
}
