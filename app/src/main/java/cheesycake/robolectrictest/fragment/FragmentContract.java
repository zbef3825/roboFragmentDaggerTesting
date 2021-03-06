package cheesycake.robolectrictest.fragment;

/**
 * Copyright (C) Cheesy Coders - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jin, 2017-10-04
 */

public interface FragmentContract {
    interface View {
        void talk();
    }

    interface Presenter {
        void start();
    }
}
