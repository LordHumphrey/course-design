/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： makeSameSizeLayoutPosition.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { ContainerLayout, Dimensions } from '../types/interfaces';
declare const _default: (containerWidth: number, itemsDimensions: Dimensions[], gutterPixels: number) => ContainerLayout;
/**
 * Same size layout for items that have the same width/height
 */
export default _default;
