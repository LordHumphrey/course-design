/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： getPackedLayoutPositions.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { Position } from '../FilterItem';
import FilterContainer from '../FilterContainer';
/**
 * Packed layout for items that can have varying width as well as varying height.
 * @param filterContainer instance.
 */
declare const getPackedLayoutPositions: (filterContainer: FilterContainer) => Position[];
export default getPackedLayoutPositions;
