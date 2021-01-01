/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： makeHorizontalLayoutPositions.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { ContainerLayout, Dimensions } from '../types/interfaces';
declare const _default: (itemsDimensions: Dimensions[], gutterPixels: number) => ContainerLayout;
/**
 * Horizontal layout algorithm that arranges all FilterItems in one row. Their width may vary.
 */
export default _default;
