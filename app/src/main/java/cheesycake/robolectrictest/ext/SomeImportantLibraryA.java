package cheesycake.robolectrictest.ext;

import android.app.Application;
import android.util.Log;

/**
 * Copyright (C) Cheesy Coders - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jin, 2017-10-04
 */

public class SomeImportantLibraryA {
    public SomeImportantLibraryA(Application application) {
    }

    public int talk() {
        Log.i("Debugger", String.valueOf(hashCode()) + " is talking");
        return hashCode();
    }

    public void even() {

    }

    public void odd() {

    }
}
