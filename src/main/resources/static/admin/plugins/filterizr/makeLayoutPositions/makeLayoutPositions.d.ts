/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： makeLayoutPositions.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { ContainerLayout, Dimensions, Options } from '../types/interfaces';
declare const _default: (containerWidth: number, itemsDimensions: Dimensions[], { gutterPixels, layout }: Options) => ContainerLayout;
/**
 * Creates the specifications of the dimensions of the
 * container and items for the next render of Filterizr.
 */
export default _default;
