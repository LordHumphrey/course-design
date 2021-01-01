/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： en-au.js
 * 2021-1-1 - create by Tao.
 *
 */

(function (global, factory) {
    typeof exports === 'object' && typeof module !== 'undefined' ? module.exports = factory() :
    typeof define === 'function' && define.amd ? define(factory) :
    (global = global || self, (global.FullCalendarLocales = global.FullCalendarLocales || {}, global.FullCalendarLocales['en-au'] = factory()));
}(this, function () { 'use strict';

    var enAu = {
        code: "en-au",
        week: {
            dow: 1,
            doy: 4 // The week that contains Jan 4th is the first week of the year.
        }
    };

    return enAu;

}));
