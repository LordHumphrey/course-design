/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： animate.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

declare class Animator {
    static animate(node: HTMLElement, targetStyles: object): Promise<void>;
    private static process;
}
declare const _default: typeof Animator.animate;
export default _default;
