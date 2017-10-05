package cheesycake.robolectrictest;

import android.app.Application;

import org.mockito.Mockito;

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
public class MockModuleA {
    private Application application;
    public MockModuleA(Application application) {
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
        return Mockito.mock(SomeImportantLibraryA.class);
    }
}
