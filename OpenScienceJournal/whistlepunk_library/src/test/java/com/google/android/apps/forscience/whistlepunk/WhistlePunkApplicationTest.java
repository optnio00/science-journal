/*
 *  Copyright 2016 Google Inc. All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.google.android.apps.forscience.whistlepunk;

import org.junit.Test;

public class WhistlePunkApplicationTest {
    @Test
    public void usageTrackerForNullContext() {
        WhistlePunkApplication app = new WhistlePunkApplication() {
            @Override
            protected void onCreateInjector() {
                // do nothing
            }
        };

        // Make sure this doesn't throw.
        app.getUsageTracker(null).trackScreenView("screen");
    }
}