package com.mht.mvpwithplugins.app;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created on April 20, 2017
 *
 * @author Mohit Malpani
 */

@Module
public class AppModule {

    protected App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    Context provideContext() {
        return app;
    }

}
