/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： window.js
 * 2021-1-1 - create by Tao.
 *
 */

if (typeof define === "function" && define.amd) define(function() {
    return typeof window !== "undefined" ? window : new (eval("require('jsdom').JSDOM"))("").window;
}); else if (typeof exports === "object") module.exports = typeof window !== "undefined" ? window : new (eval("require('jsdom').JSDOM"))("").window;