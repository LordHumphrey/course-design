/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： getSameHeightLayoutPositions.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { Position } from '../FilterItem';
import FilterContainer from '../FilterContainer';
/**
 * Same height layout for items that have the same height, but can have varying width
 * @param filterContainer instance.
 */
declare const getSameHeightLayoutPositions: (filterContainer: FilterContainer) => Position[];
export default getSameHeightLayoutPositions;
