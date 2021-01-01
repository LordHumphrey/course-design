/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： ContainerLayout.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { Position } from './Position';
export interface ContainerLayout {
    containerHeight: number;
    itemsPositions: Position[];
}
