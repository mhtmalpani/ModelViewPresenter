package com.mht.mvpwithplugins.toast.presenter;

import com.mht.mvpwithplugins.toast.model.IModel;
import com.mht.mvpwithplugins.toast.model.IModelCallBack;
import com.mht.mvpwithplugins.toast.view.IView;

import javax.inject.Inject;

/**
 * Created on April 19, 2017
 *
 * @author Mohit Malpani
 */

public class Presenter implements IPresenter, IModelCallBack {

    protected IModel iModel;

    protected IView iView;

    @Inject
    public Presenter(IView iView, IModel iModel) {

        this.iView = iView;
        this.iModel = iModel;

        iModel.setCallBack(this);
    }


    @Override
    public void addNote() {
        iModel.insertNote();
    }

    @Override
    public void onNoteInserted() {
        iView.showSuccess();
    }
}
