package com.meesho.github;

import com.meesho.github.component.ApplicationComponent;
import com.meesho.github.component.DaggerApplicationComponent;
import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class MGApplication extends DaggerApplication {

    private static MGApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static synchronized MGApplication getInstance() {
        return instance;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        ApplicationComponent component = DaggerApplicationComponent.builder().application(this).build();
        component.inject(this);

        return component;
    }
}
