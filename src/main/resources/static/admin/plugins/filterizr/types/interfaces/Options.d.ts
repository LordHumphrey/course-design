/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： Options.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { BaseOptions } from './BaseOptions';
import ActiveFilter from '../../ActiveFilter';
export interface Options extends BaseOptions {
    filter: ActiveFilter;
}
