/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： rollup.config.js
 * 2021-1-1 - create by Tao.
 *
 */

import babel from 'rollup-plugin-babel'

const pkg  = require('../../../../templates/temp/package.json')
const year = new Date().getFullYear()

const globals = {
  jquery: 'jQuery'
}

export default {
  input  : 'build/js/AdminLTE.js',
  output : {
    banner: `/*!
 * AdminLTE v${pkg.version} (${pkg.homepage})
 * Copyright 2014-${year} ${pkg.author}
 * Licensed under MIT (https://github.com/ColorlibHQ/AdminLTE/blob/master/LICENSE)
 */`,
    file  : 'dist/js/adminlte.js',
    format: 'umd',
    globals,
    name  : 'adminlte'
  },
  plugins: [
    babel({
      exclude: 'node_modules/**',
      externalHelpers: true
    })
  ]
}
