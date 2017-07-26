package com.mht.mvpwithplugins.toast.model;

/**
 * Created on April 19, 2017
 *
 * @author Mohit Malpani
 */

public interface IModel {

    void setCallBack(IModelCallBack iModelCallBack);

    void insertNote();
}
