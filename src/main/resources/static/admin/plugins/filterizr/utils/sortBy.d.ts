/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： sortBy.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

/**
 * Simple non-mutating sorting function for arrays of objects by a property
 * @param {Array} array to sort
 * @param {Function} propFn fetches the property by which to sort
 * @return {Array} a new sorted array
 */
export declare const sortBy: (array: any[], propFn: Function) => any[];
