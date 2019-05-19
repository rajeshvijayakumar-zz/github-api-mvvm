package com.meesho.github.interfaces;

import com.meesho.github.model.PullRequest;
import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface ApiInterface {

        @GET("/repos/{user}/{repo}/pulls")
        Single<List<PullRequest>> getPullRequests(@Path("user") String user, @Path("repo") String repo, @QueryMap(encoded = true) Map<String, String> options);

}
