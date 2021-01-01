/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： inputmask.dependencyLib.jquery.js
 * 2021-1-1 - create by Tao.
 *
 */

(function(factory) {
    if (typeof define === "function" && define.amd) {
        define([ "jquery" ], factory);
    } else if (typeof exports === "object") {
        module.exports = factory(require("jquery"));
    } else {
        window.dependencyLib = factory(jQuery);
    }
})(function($) {
    return $;
});