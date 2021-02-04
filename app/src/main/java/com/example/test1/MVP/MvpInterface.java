package com.example.test1.MVP;

import com.example.test1.API.ApiModel;

public interface MvpInterface {




    interface Presenter {

        void getData();

        void showTheData();

}


    interface View {

        void onSuccess(ApiModel apiModel);

        void onFail(String errormessage);
    }
}



