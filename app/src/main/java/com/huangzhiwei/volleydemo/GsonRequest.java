package com.huangzhiwei.volleydemo;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.Response.ErrorListener;

import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;

/**
 * Created by huangzhiwei on 16/3/9.
 */
public class GsonRequest<T> extends Request<T> {
//
//    private final Response.Listener<T> mListener;
//
//    private Gson mGson;
//    private Class<T> mClass;
//
//    public GsonRequest(int method, Class<T> mClass,String url, Response.Listener<T> listener1, Response.ErrorListener listener) {
//        super(method, url, listener);
//        this.mListener = listener1;
//        mGson =new Gson();
//        this.mClass = mClass;
//    }
//
//    @Override
//    protected Response<T> parseNetworkResponse(NetworkResponse networkResponse) {
//        try {
//            String jsonString = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
//            return Response.success(mGson.fromJson(jsonString,mClass),HttpHeaderParser.parseCacheHeaders(networkResponse));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//            return Response.error(new ParseError(e));
//        }
//
//
//    }
//
//    @Override
//    protected void deliverResponse(T t) {
//        mListener.onResponse(t);
//    }

    private final Response.Listener<T> mListener;

    private Gson mGson;

    private Class<T> mClass;

    public GsonRequest(int method, String url, Class<T> clazz, Listener<T> listener,
                       ErrorListener errorListener) {
        super(method, url, errorListener);
        mGson = new Gson();
        mClass = clazz;
        mListener = listener;
    }

    public GsonRequest(String url, Class<T> clazz, Listener<T> listener,
                       ErrorListener errorListener) {
        this(Method.GET, url, clazz, listener, errorListener);
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        try {
            String jsonString = new String(response.data,
                    HttpHeaderParser.parseCharset(response.headers));
            return Response.success(mGson.fromJson(jsonString, mClass),
                    HttpHeaderParser.parseCacheHeaders(response));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        }
    }

    @Override
    protected void deliverResponse(T response) {
        mListener.onResponse(response);
    }
}
