/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： methods_fi.js
 * 2021-1-1 - create by Tao.
 *
 */

(function( factory ) {
	if ( typeof define === "function" && define.amd ) {
		define( ["jquery", "../jquery.validate"], factory );
	} else if (typeof module === "object" && module.exports) {
		module.exports = factory( require( "jquery" ) );
	} else {
		factory( jQuery );
	}
}(function( $ ) {

/*
 * Localized default methods for the jQuery validation plugin.
 * Locale: FI
 */
$.extend( $.validator.methods, {
	date: function( value, element ) {
		return this.optional( element ) || /^\d{1,2}\.\d{1,2}\.\d{4}$/.test( value );
	},
	number: function( value, element ) {
		return this.optional( element ) || /^-?(?:\d+)(?:,\d+)?$/.test( value );
	}
} );
return $;
}));