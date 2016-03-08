package com.huangzhiwei.volleydemo;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by huangzhiwei on 16/3/7.
 */
public class MyApplication extends Application {


    private static RequestQueue requestQueue;


    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue = Volley.newRequestQueue(getApplicationContext());
    }

    public static RequestQueue getHttpQueue()
    {
        return requestQueue;
    }

}
