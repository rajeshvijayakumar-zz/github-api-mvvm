package com.meesho.github.component;

import android.app.Application;
import com.meesho.github.interfaces.ApiInterface;
import com.meesho.github.module.ActivityBindingModule;
import com.meesho.github.module.ContextModule;
import com.meesho.github.module.NetworkModule;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, ContextModule.class, NetworkModule.class, ActivityBindingModule.class})
public interface ApplicationComponent extends AndroidInjector<DaggerApplication> {


        ApiInterface getApiService();

        void inject(Application application);

        @Component.Builder
        interface Builder {
                        Builder networkModule(NetworkModule networkModule);
                        @BindsInstance Builder application(Application application);
//                        Builder appModule(AppModule appModule);
//                        Builder contextModule(ContextModule contextModule);

                ApplicationComponent build();
        }
}
