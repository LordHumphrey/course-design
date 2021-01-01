/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： ActiveFilter.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { Filter } from './types';
/**
 * ActiveFilter represents the currently active filter over
 * the grid.
 *
 * It can be a plain string value or an array of strings.
 */
export default class ActiveFilter {
    private filter;
    constructor(filter: Filter);
    get(): Filter;
    set(targetFilter: Filter): void;
    toggle(targetFilter: string): void;
    private toggleFilter;
}
