package cheesycake.robolectrictest.fragment;

import cheesycake.robolectrictest.di.AppComponent;
import dagger.Component;

/**
 * Copyright (C) Cheesy Coders - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jin, 2017-10-04
 */
@FragmentScope
@Component(modules = FragmentModule.class, dependencies = AppComponent.class)
public interface FragmentComponent {
    void inject(FragmentA fragmentA);
}
