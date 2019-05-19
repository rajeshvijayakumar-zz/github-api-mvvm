package com.meesho.github.viewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meesho.github.model.PullRequest;
import com.meesho.github.repository.GithubRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

public class PullRequestViewModel extends ViewModel {

    private final GithubRepository gitHubRepo;
    private CompositeDisposable disposable;

    private final MutableLiveData<List<PullRequest>> pullrequests = new MutableLiveData<>();
    private final MutableLiveData<Boolean> repoLoadError = new MutableLiveData<>();
    private final MutableLiveData<Boolean> loading = new MutableLiveData<>();

    @Inject
    public PullRequestViewModel(GithubRepository gitHubRepo) {
        this.gitHubRepo = gitHubRepo;
        disposable = new CompositeDisposable();
    }

    LiveData<List<PullRequest>> getPRs() {
        return pullrequests;
    }
    LiveData<Boolean> getError() {
        return repoLoadError;
    }
    LiveData<Boolean> getLoading() {
        return loading;
    }

    private void getPullRequests(String owner, String repoName, Map<String, String> options) {
        loading.setValue(true);
        disposable.add(gitHubRepo.getPullRequests(owner, repoName, options).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<List<PullRequest>>() {
                    @Override
                    public void onSuccess(List<PullRequest> value) {
                        repoLoadError.setValue(false);
                        pullrequests.setValue(value);
                        loading.setValue(false);
                    }

                    @Override
                    public void onError(Throwable e) {
                        repoLoadError.setValue(true);
                        loading.setValue(false);
                    }
                }));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (disposable != null) {
            disposable.clear();
            disposable = null;
        }
    }
}
