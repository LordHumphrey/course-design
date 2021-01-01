/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： ru.js
 * 2021-1-1 - create by Tao.
 *
 */

(function (global, factory) {
    typeof exports === 'object' && typeof module !== 'undefined' ? module.exports = factory() :
    typeof define === 'function' && define.amd ? define(factory) :
    (global = global || self, (global.FullCalendarLocales = global.FullCalendarLocales || {}, global.FullCalendarLocales.ru = factory()));
}(this, function () { 'use strict';

    var ru = {
        code: "ru",
        week: {
            dow: 1,
            doy: 4 // The week that contains Jan 4th is the first week of the year.
        },
        buttonText: {
            prev: "Пред",
            next: "След",
            today: "Сегодня",
            month: "Месяц",
            week: "Неделя",
            day: "День",
            list: "Повестка дня"
        },
        weekLabel: "Нед",
        allDayText: "Весь день",
        eventLimitText: function (n) {
            return "+ ещё " + n;
        },
        noEventsMessage: "Нет событий для отображения"
    };

    return ru;

}));
