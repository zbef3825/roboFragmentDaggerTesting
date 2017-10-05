package cheesycake.robolectrictest;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import cheesycake.robolectrictest.di.AppComponent;
import cheesycake.robolectrictest.di.DaggerAppComponent;
import cheesycake.robolectrictest.di.ModuleA;
import cheesycake.robolectrictest.di.ModuleB;

/**
 * Copyright (C) Cheesy Coders - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jin, 2017-10-04
 */

public class RoboApp extends Application {
    protected AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        setAppComponent(DaggerAppComponent.builder()
                .moduleA(new ModuleA(this))
                .moduleB(new ModuleB())
                .build());
        if (!isUnitTest()) {
            if (LeakCanary.isInAnalyzerProcess(this)) {
                // This process is dedicated to LeakCanary for heap analysis.
                // You should not init your app in this process.
                return;
            }
            LeakCanary.install(this);
        }

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public void setAppComponent(AppComponent appComponent) {
        this.appComponent = appComponent;
    }

    protected boolean isUnitTest() {
        return false;
    }
}
