package com.mht.mvpwithplugins.toast.injection;

import com.mht.mvpwithplugins.toast.model.IModel;
import com.mht.mvpwithplugins.toast.model.Model;
import com.mht.mvpwithplugins.toast.presenter.IPresenter;
import com.mht.mvpwithplugins.toast.presenter.Presenter;
import com.mht.mvpwithplugins.toast.view.IView;

import dagger.Module;
import dagger.Provides;

/**
 * Created on April 20, 2017
 *
 * @author Mohit Malpani
 */

@Module
public class ToastModule {

    protected IView iView;

    public ToastModule(IView iView) {
        this.iView = iView;
    }


    @Provides
    public IView provideView() {
        return iView;
    }

    @Provides
    public IPresenter providePresenter(Presenter presenter) {
        return presenter;
    }

    @Provides
    public IModel provideModel(Model model) {
        return model;
    }
}
