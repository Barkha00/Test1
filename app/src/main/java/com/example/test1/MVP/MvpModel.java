package com.example.test1.MVP;

import com.example.test1.API.APIClient;
import com.example.test1.API.APIInterface;
import com.example.test1.API.ApiModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MvpModel {

    private APIInterface apiInterface;
    public MvpInterface mvpInterface;







    public void showData(onDataListener callBack){
        callBack.onSuccess("successfully");

        apiInterface = APIClient.getClient().create(APIInterface.class);

        Call<ApiModel> call = apiInterface.getData();
        call.enqueue(new Callback<ApiModel>() {

            @Override
            public void onResponse(Call<ApiModel> call, Response<MvpModel> response) {
               if(response.isSuccessful())
               callBack.onSuccess(response.body());

            }

            private void showTheData() {

            }

            private void onSuccess(ApiModel body) {

            }


            @Override
            public void onFailure(Call<ApiModel> call, Throwable t) {

            }

        });

            }

    private interface onDataListener {
        public void onSuccess(String successfully);


    }
}


