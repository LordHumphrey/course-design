/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： bg.js
 * 2021-1-1 - create by Tao.
 *
 */

(function (global, factory) {
    typeof exports === 'object' && typeof module !== 'undefined' ? module.exports = factory() :
    typeof define === 'function' && define.amd ? define(factory) :
    (global = global || self, (global.FullCalendarLocales = global.FullCalendarLocales || {}, global.FullCalendarLocales.bg = factory()));
}(this, function () { 'use strict';

    var bg = {
        code: "bg",
        week: {
            dow: 1,
            doy: 7 // The week that contains Jan 1st is the first week of the year.
        },
        buttonText: {
            prev: "назад",
            next: "напред",
            today: "днес",
            month: "Месец",
            week: "Седмица",
            day: "Ден",
            list: "График"
        },
        allDayText: "Цял ден",
        eventLimitText: function (n) {
            return "+още " + n;
        },
        noEventsMessage: "Няма събития за показване"
    };

    return bg;

}));
