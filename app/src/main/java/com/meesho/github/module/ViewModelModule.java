package com.meesho.github.module;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import com.meesho.github.factory.ViewModelFactory;
import com.meesho.github.viewModel.PullRequestViewModel;
import com.meesho.github.viewModel.ViewModelKey;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

import javax.inject.Singleton;

@Singleton
@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(PullRequestViewModel.class)
    abstract ViewModel bindListViewModel(PullRequestViewModel pullRequestViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}
