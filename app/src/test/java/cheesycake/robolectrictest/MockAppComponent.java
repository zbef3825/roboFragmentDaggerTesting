package cheesycake.robolectrictest;

import android.app.Application;

import javax.inject.Singleton;

import cheesycake.robolectrictest.di.AppComponent;
import cheesycake.robolectrictest.ext.SomeImportantLibraryA;
import cheesycake.robolectrictest.ext.SomeImportantLibraryB;
import dagger.Component;

/**
 * Copyright (C) Cheesy Coders - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jin, 2017-10-04
 */
@Singleton
@Component(modules = {MockModuleA.class, MockModuleB.class})
public interface MockAppComponent extends AppComponent {
    void inject(MockRoboApp mockRoboApp);
    Application getApplication();
    SomeImportantLibraryA getSomeImportantLibraryA();
    SomeImportantLibraryB getSomeImportantLibraryB();
}
