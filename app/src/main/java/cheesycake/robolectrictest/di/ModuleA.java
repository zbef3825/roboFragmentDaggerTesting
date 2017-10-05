package cheesycake.robolectrictest.di;

import android.app.Application;

import javax.inject.Singleton;

import cheesycake.robolectrictest.ext.SomeImportantLibraryA;
import dagger.Module;
import dagger.Provides;

/**
 * Copyright (C) Cheesy Coders - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jin, 2017-10-04
 */
@Module
public class ModuleA {
    private Application application;
    public ModuleA(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Application providesApplication() {
        return application;
    }

    @Provides
    @Singleton
    public SomeImportantLibraryA providesSomeImportantLibraryA(Application application) {
        return new SomeImportantLibraryA(application);
    }
}
