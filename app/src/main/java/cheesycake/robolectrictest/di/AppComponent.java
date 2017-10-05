package cheesycake.robolectrictest.di;

import android.app.Application;

import javax.inject.Singleton;

import cheesycake.robolectrictest.RoboApp;
import cheesycake.robolectrictest.ext.SomeImportantLibraryA;
import cheesycake.robolectrictest.ext.SomeImportantLibraryB;
import dagger.Component;

/**
 * Copyright (C) Cheesy Coders - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jin, 2017-10-04
 */
@Component(modules = {ModuleA.class, ModuleB.class})
@Singleton
public interface AppComponent {
    void inject(RoboApp roboApp);
    Application getApplication();
    SomeImportantLibraryA getSomeImportantLibraryA();
    SomeImportantLibraryB getSomeImportantLibraryB();
}
