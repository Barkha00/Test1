package com.example.test1.MVP;

public class  MvpPresenter implements MvpInterface.Presenter {
    @Override
    public void getData() {

    }

    @Override
    public void showTheData() {

    }

    MvpModel weatherModel;
    MvpInterface.View view;


    public MvpPresenter(MvpInterface.View view) {
        weatherModel = new MvpModel();
        this.view = view;

    }
}
