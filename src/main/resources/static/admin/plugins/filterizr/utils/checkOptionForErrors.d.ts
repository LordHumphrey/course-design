/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： checkOptionForErrors.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

/**
 * Error checking method to restrict a prop to some allowed values
 * @param {String} name of the option key in the options object
 * @param {String|Number|Object|Function|Array|Boolean} value of the option
 * @param {String} type of the property
 * @param {Array} allowed accepted values for option
 * @param {String} furtherHelpLink a link to docs for further help
 */
export declare const checkOptionForErrors: (name: string, value: string | number | boolean | object | Function | any[], type?: string, allowed?: RegExp | any[], furtherHelpLink?: string) => void;
