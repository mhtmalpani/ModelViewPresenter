package com.mht.mvpwithplugins.app;

import android.app.Application;

/**
 * Created on April 20, 2017
 *
 * @author Mohit Malpani
 */

public class App extends Application {

    private static App app;
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        app = this;

        initAppComponent();
        appComponent.inject(this);
    }

    private void initAppComponent() {

        appComponent = DaggerAppComponent.builder()
                .appModule(getAppModule())
                .build();

    }


    public static App getApp() {
        return app;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public AppModule getAppModule() {
        return new AppModule(app);
    }
}
