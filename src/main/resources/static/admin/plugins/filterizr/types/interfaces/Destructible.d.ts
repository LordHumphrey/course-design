/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： Destructible.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

export interface Destructible {
    destroy(): void | Promise<void>;
}
