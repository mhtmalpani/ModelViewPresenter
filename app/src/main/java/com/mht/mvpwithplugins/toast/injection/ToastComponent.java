package com.mht.mvpwithplugins.toast.injection;

import com.mht.mvpwithplugins.toast.view.ToastActivity;

import dagger.Subcomponent;

/**
 * Created on April 20, 2017
 *
 * @author Mohit Malpani
 */

@Subcomponent(
        modules = {
                ToastModule.class
        }
)
public interface ToastComponent {

    void inject(ToastActivity toastActivity);
}
