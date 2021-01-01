/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： getHTMLElement.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

/**
 * Wrapper around document.querySelector, will function as
 * an identity function if an HTML element is passed in
 * @param {HTMLElement|string} nodeOrSelector
 */
export declare const getHTMLElement: (selectorOrNode: string | HTMLElement) => HTMLElement;
