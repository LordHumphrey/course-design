/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： makeSameHeightLayoutPositions.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { ContainerLayout, Dimensions } from '../types/interfaces';
declare const _default: (containerWidth: number, itemsDimensions: Dimensions[], gutterPixels: number) => ContainerLayout;
/**
 * Same height layout for items that have the same height, but can have varying width
 */
export default _default;
