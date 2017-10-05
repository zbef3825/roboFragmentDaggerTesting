package cheesycake.robolectrictest;

import cheesycake.robolectrictest.di.AppComponent;

/**
 * Copyright (C) Cheesy Coders - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jin, 2017-10-04
 */

public class MockRoboApp extends RoboApp {

    @Override
    public AppComponent getAppComponent() {
        return DaggerMockAppComponent.builder()
                .mockModuleA(new MockModuleA(this))
                .mockModuleB(new MockModuleB()).build();
    }

    @Override
    protected boolean isUnitTest() {
        return true;
    }
}
