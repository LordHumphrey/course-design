/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： makePackedLayoutPositions.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { ContainerLayout, Dimensions } from '../types/interfaces';
declare const _default: (containerWidth: number, itemsDimensions: Dimensions[], gutterPixels: number) => ContainerLayout;
/**
 * Packed layout for items that can have varying width as well as varying height.
 */
export default _default;
