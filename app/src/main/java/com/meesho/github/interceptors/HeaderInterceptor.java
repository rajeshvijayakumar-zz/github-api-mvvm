package com.meesho.github.interceptors;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HeaderInterceptor implements Interceptor {
    private static final String ACCEPT_TYPE = "application/vnd.github.v3+json";

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request().newBuilder().addHeader("Accept", ACCEPT_TYPE).build();
        return chain.proceed(request);
    }
}
