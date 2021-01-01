/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： RawOptions.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { BaseOptions } from './BaseOptions';
export interface RawOptions extends BaseOptions {
    filter?: string | string[];
}
