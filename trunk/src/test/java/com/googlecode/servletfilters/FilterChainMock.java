/*
 *  Copyright 2011 Sebastian Prehn <sebastian.prehn@planetswebdesign.de>.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 *
 *  Versioning:
 *  $LastChangedDate$
 *  $LastChangedRevision$
 */

package com.googlecode.servletfilters;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Mock implementation of {@link FilterChain}.
 * @author Sebastian Prehn <sebastian.prehn@planetswebdesign.de>
 */
public class FilterChainMock implements FilterChain {

    private boolean run = false;

    public void doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException {
        this.run = true;
    }

    public boolean hasRun() {
        return run;
    }
}