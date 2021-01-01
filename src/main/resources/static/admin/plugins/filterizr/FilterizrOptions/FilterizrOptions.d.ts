/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： FilterizrOptions.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { BaseOptions, RawOptions } from '../types/interfaces';
import ActiveFilter from '../ActiveFilter';
import { Filter } from '../types';
export interface Options extends BaseOptions {
    filter: ActiveFilter;
}
export default class FilterizrOptions {
    private options;
    constructor(userOptions: RawOptions);
    readonly isSpinnerEnabled: boolean;
    readonly areControlsEnabled: boolean;
    readonly controlsSelector: string;
    filter: Filter;
    toggleFilter(filter: string): void;
    searchTerm: string;
    get(): Options;
    getRaw(): RawOptions;
    set(newUserOptions: RawOptions): void;
    private convertToFilterizrOptions;
    private convertToOptions;
    private validate;
}
