package cheesycake.robolectrictest.fragment;

import javax.inject.Inject;

import cheesycake.robolectrictest.ext.SomeImportantLibraryA;
import cheesycake.robolectrictest.ext.SomeImportantLibraryB;

/**
 * Copyright (C) Cheesy Coders - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jin, 2017-10-04
 */

public class FragmentPresenter implements FragmentContract.Presenter {
    private FragmentContract.View view;
    private SomeImportantLibraryA someImportantLibraryA;
    private SomeImportantLibraryB someImportantLibraryB;

    @Inject
    public FragmentPresenter(FragmentContract.View view, SomeImportantLibraryA someImportantLibraryA, SomeImportantLibraryB someImportantLibraryB) {
        this.view = view;
        this.someImportantLibraryA = someImportantLibraryA;
        this.someImportantLibraryB = someImportantLibraryB;
    }

    @Override
    public void start() {
        if (someImportantLibraryA.talk() % 2 == 0) {
            someImportantLibraryA.even();
        } else {
            someImportantLibraryA.odd();
        }
        someImportantLibraryB.talk();
        view.talk();
    }
}
