/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： getSameWidthLayoutPositions.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { Position } from '../FilterItem';
import FilterContainer from '../FilterContainer';
/**
 * Same width layout for items that have the same width, but can have varying height
 * @param filterContainer instance.
 */
declare const getSameWidthLayoutPositions: (filterContainer: FilterContainer) => Position[];
export default getSameWidthLayoutPositions;
