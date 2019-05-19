package com.meesho.github.repository;

import com.meesho.github.interfaces.ApiInterface;
import com.meesho.github.model.PullRequest;
import io.reactivex.Single;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

public class GithubRepository {

    private final ApiInterface apiService;

    @Inject
    public GithubRepository(ApiInterface apiService) {
        this.apiService = apiService;
    }

    public Single<List<PullRequest>> getPullRequests(String owner, String repoName, Map<String, String> options) {
        return apiService.getPullRequests(owner, repoName, options);
    }
}
