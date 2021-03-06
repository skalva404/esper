/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.epl.expression.funcs;

import com.espertech.esper.epl.expression.core.ExprForge;
import com.espertech.esper.epl.expression.core.ExprNodeRenderable;

public abstract class ExprPlugInSingleRowNodeForge implements ExprForge {

    private final ExprPlugInSingleRowNode parent;
    private final boolean isReturnsConstantResult;

    public ExprPlugInSingleRowNodeForge(ExprPlugInSingleRowNode parent, boolean isReturnsConstantResult) {
        this.parent = parent;
        this.isReturnsConstantResult = isReturnsConstantResult;
    }

    public boolean isReturnsConstantResult() {
        return isReturnsConstantResult;
    }

    public ExprNodeRenderable getForgeRenderable() {
        return parent;
    }
}
