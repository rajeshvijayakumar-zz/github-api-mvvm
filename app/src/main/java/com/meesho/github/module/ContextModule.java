package com.meesho.github.module;

import android.content.Context;
import com.meesho.github.context.ApplicationContext;
import com.meesho.github.scope.ApplicationScope;
import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private Context context;

    public ContextModule(Context context){
        this.context = context;
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context providesContext(){
        return context;
    }
}
