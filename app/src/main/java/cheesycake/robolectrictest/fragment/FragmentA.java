package cheesycake.robolectrictest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import cheesycake.robolectrictest.R;
import cheesycake.robolectrictest.RoboApp;

/**
 * Copyright (C) Cheesy Coders - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jin, 2017-10-04
 */

public class FragmentA extends Fragment implements FragmentContract.View {

    @Inject
    FragmentContract.Presenter presenter;

    @VisibleForTesting
    public FragmentComponent fragmentComponent;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (fragmentComponent == null) {
            fragmentComponent = DaggerFragmentComponent.builder()
                    .appComponent(((RoboApp) getActivity().getApplication()).getAppComponent())
                    .fragmentModule(new FragmentModule(this))
                    .build();
        }
        fragmentComponent.inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_view, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.start();
    }

    @Override
    public void talk() {
        Log.i("Debugger", String.valueOf(hashCode()) + " is talking");
    }
}
