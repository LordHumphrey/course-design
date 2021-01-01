/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： getVerticalLayoutPositions.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { Position } from '../FilterItem';
import FilterContainer from '../FilterContainer';
/**
 * Vertical layout algorithm that arranges all FilterItems in one column. Their height may vary.
 * @param filterizr instance.
 */
declare const getVerticalLayoutPositions: (filterContainer: FilterContainer) => Position[];
export default getVerticalLayoutPositions;
