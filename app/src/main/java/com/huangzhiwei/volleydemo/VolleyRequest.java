package com.huangzhiwei.volleydemo;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

/**
 * Created by huangzhiwei on 16/3/7.
 */
public class VolleyRequest {

    public static StringRequest stringRequest;
    public static Context context;

    public static void RequestGet(Context context,String url,String tag,VolleyClass listener)
    {
        MyApplication.getHttpQueue().cancelAll(tag);
        stringRequest = new StringRequest(Request.Method.GET,url,listener.loadingListener(),listener.errorListener);
        stringRequest.setTag(tag);
        MyApplication.getHttpQueue().add(stringRequest);
        MyApplication.getHttpQueue().start();
    }

    public static void RequestPost(Context context, String url, String tag, final Map<String,String> params, VolleyClass listener)
    {
        MyApplication.getHttpQueue().cancelAll(tag);
        stringRequest = new StringRequest(Request.Method.POST,url,listener.loadingListener(),listener.errorListener){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return params;
            }
        };
        stringRequest.setTag(tag);
        MyApplication.getHttpQueue().add(stringRequest);
        MyApplication.getHttpQueue().start();
    }


}
