/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： getSameSizeLayoutPosition.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { Position } from '../FilterItem';
import FilterContainer from '../FilterContainer';
/**
 * Same size layout for items that have the same width/height
 * @param filterContainer instance.
 */
declare const getSameSizeLayoutPosition: (filterContainer: FilterContainer) => Position[];
export default getSameSizeLayoutPosition;
