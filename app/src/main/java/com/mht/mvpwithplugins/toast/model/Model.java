package com.mht.mvpwithplugins.toast.model;

import javax.inject.Inject;

/**
 * Created on April 19, 2017
 *
 * @author Mohit Malpani
 */

public class Model implements IModel {

    private IModelCallBack iModelCallBack;

    @Inject
    public Model() {
    }

    @Override
    public void setCallBack(IModelCallBack iModelCallBack) {
        this.iModelCallBack = iModelCallBack;
    }

    @Override
    public void insertNote() {

        // Do some operations


        // Notify done
        if (null != iModelCallBack) {
            iModelCallBack.onNoteInserted();
        }
    }
}
