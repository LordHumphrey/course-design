/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： StyledFilterItems.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import StyledFilterizrElements from '../StyledFilterizrElements';
import FilterItem from '../FilterItem/FilterItem';
export default class StyledFilterItems extends StyledFilterizrElements {
    private _filterItems;
    constructor(elements: FilterItem[]);
    removeWidth(): void;
    updateWidth(): void;
    updateTransitionStyle(): void;
    disableTransitions(): void;
    enableTransitions(): Promise<void>;
    updateWidthWithTransitionsDisabled(): void;
}
