package com.huangzhiwei.volleydemo;

import android.content.Context;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/**
 * Created by huangzhiwei on 16/3/7.
 */
public abstract class VolleyClass {
    public Context context;

    public static Response.Listener listener;

    public static Response.ErrorListener errorListener;

    public VolleyClass(Context context, Response.Listener listener, Response.ErrorListener errorListener) {
        this.context = context;
        this.listener = listener;
        this.errorListener = errorListener;
    }

    public abstract void onMySuccess(Object o);
    public abstract void onMyError(VolleyError error);

    public Response.Listener<String> loadingListener()
    {
        listener = new Response.Listener() {
            @Override
            public void onResponse(Object o) {
                onMySuccess(o);
            }
        };
                return listener;
    }

    public Response.ErrorListener failListener()
    {
        errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                onMyError(volleyError);
            }
        };
        return errorListener;
    }
}
