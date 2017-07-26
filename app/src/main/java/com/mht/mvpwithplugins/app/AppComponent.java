package com.mht.mvpwithplugins.app;

import com.mht.mvpwithplugins.toast.injection.ToastComponent;
import com.mht.mvpwithplugins.toast.injection.ToastModule;

import dagger.Component;

/**
 * Created on April 20, 2017
 *
 * @author Mohit Malpani
 */

@Component(
        modules = {
                AppModule.class
        }
)
public interface AppComponent {

    void inject(App app);

    ToastComponent plus(ToastModule toastModule);
}
