/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： makeVerticalLayoutPositions.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { ContainerLayout, Dimensions } from '../types/interfaces';
declare const _default: (itemsDimensions: Dimensions[], gutterPixels: number) => ContainerLayout;
/**
 * Vertical layout algorithm that arranges all FilterItems in one column. Their height may vary.
 */
export default _default;
