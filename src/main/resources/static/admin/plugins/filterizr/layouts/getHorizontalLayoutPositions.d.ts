/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： getHorizontalLayoutPositions.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { Position } from '../FilterItem';
import FilterContainer from '../FilterContainer';
/**
 * Horizontal layout algorithm that arranges all FilterItems in one row. Their width may vary.
 * @param filterContainer instance.
 */
declare const getHorizontalLayoutPositions: (filterContainer: FilterContainer) => Position[];
export default getHorizontalLayoutPositions;
