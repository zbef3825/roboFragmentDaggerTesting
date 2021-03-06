package cheesycake.robolectrictest.di;

import javax.inject.Singleton;

import cheesycake.robolectrictest.ext.SomeImportantLibraryB;
import dagger.Module;
import dagger.Provides;

/**
 * Copyright (C) Cheesy Coders - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jin, 2017-10-04
 */
@Module
public class ModuleB {
    @Provides
    @Singleton
    public SomeImportantLibraryB providesSomeIMportantLibraryB() {
        return new SomeImportantLibraryB();
    }
}
