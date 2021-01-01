/*
 * Copyright (c) 2021.
 * module name： course-design
 * fileName： Spinner.d.ts
 * 2021-1-1 - create by Tao.
 *
 */

import { Destructible, Styleable } from '../types/interfaces';
import FilterizrOptions from '../FilterizrOptions';
import FilterContainer from '../FilterContainer';
import StyledSpinner from './StyledSpinner';
export default class Spinner implements Destructible, Styleable {
    private node;
    private styledNode;
    private filterContainer;
    constructor(filterContainer: FilterContainer, options: FilterizrOptions);
    readonly styles: StyledSpinner;
    destroy(): Promise<void>;
    private initialize;
}
