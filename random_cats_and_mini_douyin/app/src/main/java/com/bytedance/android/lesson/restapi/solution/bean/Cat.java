package com.bytedance.android.lesson.restapi.solution.bean;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import retrofit2.http.Url;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the response json
        Array list;
        Array categories;
        String id;
        String url;
        int width;
        int height;

    public String geturl(){
        return url;
    }

}
