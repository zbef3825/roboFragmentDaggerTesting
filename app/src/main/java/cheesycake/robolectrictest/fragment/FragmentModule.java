package cheesycake.robolectrictest.fragment;

import cheesycake.robolectrictest.ext.SomeImportantLibraryA;
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
@FragmentScope
public class FragmentModule {
    private FragmentContract.View view;

    public FragmentModule(FragmentContract.View view) {
        this.view = view;
    }

    @Provides
    public FragmentContract.Presenter providesPresenter(FragmentContract.View view, SomeImportantLibraryA someImportantLibraryA, SomeImportantLibraryB someImportantLibraryB) {
        return new FragmentPresenter(view, someImportantLibraryA, someImportantLibraryB);
    }

    @Provides
    public FragmentContract.View providesView() {
        return view;
    }
}
