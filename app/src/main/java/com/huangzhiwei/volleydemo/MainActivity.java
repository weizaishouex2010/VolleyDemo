package com.huangzhiwei.volleydemo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private NetworkImageView networkimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        volley_Get();

        //volley_Post();
        imageView = (ImageView) findViewById(R.id.id_img);
        networkimg = (NetworkImageView) findViewById(R.id.id_networkimageview);
//        volley_Image();
        volley_GsonRequest();

    }

    private void volley_GsonRequest() {
        GsonRequest<People> gsonRequest = new GsonRequest<People>("http://wx.yunzs.com.cn/apiv2/sysUserDoctor/myDoctor.json?openId=oH62xs_B5urvxwuCHPLv_NOBdm0Q",People.class,new Response.Listener<People>() {
            @Override
            public void onResponse(People people) {

                Toast.makeText(MainActivity.this,people.isSuccess()+" "+people.getData().size(),Toast.LENGTH_SHORT).show();
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        Toast.makeText(MainActivity.this,volleyError.toString(),Toast.LENGTH_SHORT).show();
                    }
                } );
        MyApplication.getHttpQueue().add(gsonRequest);
    }

    private void volley_Image() {
        String url = "https://www.baidu.com/img/bdlogo.png";
        ImageRequest request = new ImageRequest(url, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap bitmap) {
                imageView.setImageBitmap(bitmap);

            }
        }, 100, 100, Bitmap.Config.RGB_565, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });
        MyApplication.getHttpQueue().add(request);


        ImageLoader loader = new ImageLoader(MyApplication.getHttpQueue(),new BitmapCache());

        ImageLoader.ImageListener listener = ImageLoader.getImageListener(imageView,R.drawable.ic_launcher,R.drawable.ic_launcher);
        loader.get(url,listener);

        networkimg.setDefaultImageResId(R.drawable.ic_launcher);
        networkimg.setErrorImageResId(R.drawable.ic_launcher);
        networkimg.setImageUrl(url,loader);

    }

    private void volley_Post() {
        String url = "http://wx.yunzs.com.cn/apiv2/sysUserDoctor/myDoctor.json";
        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String>  hashMap = new HashMap<>();
                hashMap.put("openId","oH62xs_B5urvxwuCHPLv_NOBdm0Q");
                return hashMap;
            }
        };
//        MyApplication.getHttpQueue().add(request);
        Map<String,String>  hashMap = new HashMap<>();
        hashMap.put("openId","oH62xs_B5urvxwuCHPLv_NOBdm0Q");
        JSONObject jsonObject = new JSONObject(hashMap);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, jsonObject, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                Toast.makeText(MainActivity.this,jsonObject.toString(),Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(MainActivity.this,volleyError
                        .toString(),Toast.LENGTH_SHORT).show();

            }
        });
        MyApplication.getHttpQueue().add(jsonObjectRequest);

    }

    private void volley_Get() {
        String url = "http://wx.yunzs.com.cn/apiv2/sysUserDoctor/myDoctor.json?openId=oH62xs_B5urvxwuCHPLv_NOBdm0Q";
//        String url = "http://www.weather.com.cn/data/sk/101010100.html";
        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Gson gson =new Gson();
                People p = gson.fromJson(s,People.class);
                Toast.makeText(MainActivity.this,p.toString(),Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });

        request.setTag("abeGet");
        MyApplication.getHttpQueue().add(request);


        JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.GET, url,null,
                new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject jsonObject) {
                        Toast.makeText(MainActivity.this,jsonObject.toString(),Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {

                    }
        });
        jsonRequest.setTag("abdJson");
//        MyApplication.getHttpQueue().add(jsonRequest);




//        VolleyRequest.RequestGet(this, url, "abcGet", new VolleyClass(this,VolleyClass.listener,VolleyClass.errorListener) {
//            @Override
//            public void onMySuccess(Object o) {
//                Toast.makeText(MainActivity.this,o.toString(),Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onMyError(VolleyError error) {
//                Toast.makeText(MainActivity.this,error.toString(),Toast.LENGTH_SHORT).show();
//
//            }
//        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        MyApplication.getHttpQueue().cancelAll("abeGet");
    }
}
