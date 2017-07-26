package com.mht.mvpwithplugins.toast.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mht.mvpwithplugins.R;
import com.mht.mvpwithplugins.app.App;
import com.mht.mvpwithplugins.toast.injection.ToastModule;
import com.mht.mvpwithplugins.toast.presenter.IPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ToastActivity extends AppCompatActivity implements IView, View.OnClickListener {

    @Inject
    protected IPresenter iPresenter;

    @BindView(R.id.button)
    protected Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getApp()
                .getAppComponent()
                .plus(new ToastModule(this))
                .inject(this);

        ButterKnife.bind(this);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        iPresenter.addNote();
    }

    @Override
    public void showSuccess() {
        Toast.makeText(this, "Success! Note Inserted", Toast.LENGTH_SHORT).show();
    }

}
