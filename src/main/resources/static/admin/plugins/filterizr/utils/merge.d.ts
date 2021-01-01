/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： merge.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { Dictionary } from '../types/interfaces/Dictionary';
/**
 * Deep merge two objects.
 */
export declare function merge(target: Dictionary, ...sources: Dictionary[]): Dictionary;
