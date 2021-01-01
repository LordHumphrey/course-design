/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： RawOptionsCallbacks.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

export interface RawOptionsCallbacks {
    onInit?: EventListener;
    onFilteringStart?: EventListener;
    onFilteringEnd?: EventListener;
    onShufflingStart?: EventListener;
    onShufflingEnd?: EventListener;
    onSortingStart?: EventListener;
    onSortingEnd?: EventListener;
    onTransitionEnd?: EventListener;
}
