/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： FilterItems.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import StyledFilterItems from './StyledFilterItems';
import { Filter } from '../types';
import FilterItem from '../FilterItem';
import FilterizrOptions from '../FilterizrOptions/FilterizrOptions';
import { Destructible, Styleable } from '../types/interfaces';
export default class FilterItems implements Destructible, Styleable {
    private filterItems;
    private styledFilterItems;
    private options;
    constructor(filterItems: FilterItem[], options: FilterizrOptions);
    readonly styles: StyledFilterItems;
    readonly length: number;
    getItem(index: number): FilterItem;
    destroy(): void;
    push(filterItem: FilterItem): number;
    remove(node: HTMLElement): void;
    getFiltered(filter: Filter): FilterItem[];
    getFilteredOut(filter: Filter): FilterItem[];
    sort(sortAttr?: string, sortOrder?: 'asc' | 'desc'): void;
    shuffle(): void;
    private search;
    private shouldBeFiltered;
}
