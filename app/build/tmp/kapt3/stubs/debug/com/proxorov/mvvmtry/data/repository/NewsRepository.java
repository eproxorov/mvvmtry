package com.proxorov.mvvmtry.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bH\u0002J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/proxorov/mvvmtry/data/repository/NewsRepository;", "Lcom/proxorov/mvvmtry/domain/repository/INewsRepository;", "()V", "networkStatus", "Lcom/proxorov/mvvmtry/data/utils/NetworkStatus;", "getNetworkStatus", "()Lcom/proxorov/mvvmtry/data/utils/NetworkStatus;", "setNetworkStatus", "(Lcom/proxorov/mvvmtry/data/utils/NetworkStatus;)V", "newsApi", "Lcom/proxorov/mvvmtry/data/source/remote/api/NewsApi;", "getNewsApi", "()Lcom/proxorov/mvvmtry/data/source/remote/api/NewsApi;", "setNewsApi", "(Lcom/proxorov/mvvmtry/data/source/remote/api/NewsApi;)V", "newsDAO", "Lcom/proxorov/mvvmtry/data/source/database/NewsDAO;", "getNewsDAO", "()Lcom/proxorov/mvvmtry/data/source/database/NewsDAO;", "setNewsDAO", "(Lcom/proxorov/mvvmtry/data/source/database/NewsDAO;)V", "repositoryJob", "Lkotlinx/coroutines/Job;", "cancel", "", "cancelActiveJobs", "fetchNews", "Landroidx/lifecycle/LiveData;", "Lcom/proxorov/mvvmtry/data/utils/Resource;", "Lcom/proxorov/mvvmtry/domain/model/Articles;", "getArticles", "app_debug"})
public final class NewsRepository implements com.proxorov.mvvmtry.domain.repository.INewsRepository {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.proxorov.mvvmtry.data.source.remote.api.NewsApi newsApi;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.proxorov.mvvmtry.data.source.database.NewsDAO newsDAO;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.proxorov.mvvmtry.data.utils.NetworkStatus networkStatus;
    private kotlinx.coroutines.Job repositoryJob;
    
    @org.jetbrains.annotations.NotNull()
    public final com.proxorov.mvvmtry.data.source.remote.api.NewsApi getNewsApi() {
        return null;
    }
    
    public final void setNewsApi(@org.jetbrains.annotations.NotNull()
    com.proxorov.mvvmtry.data.source.remote.api.NewsApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.proxorov.mvvmtry.data.source.database.NewsDAO getNewsDAO() {
        return null;
    }
    
    public final void setNewsDAO(@org.jetbrains.annotations.NotNull()
    com.proxorov.mvvmtry.data.source.database.NewsDAO p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.proxorov.mvvmtry.data.utils.NetworkStatus getNetworkStatus() {
        return null;
    }
    
    public final void setNetworkStatus(@org.jetbrains.annotations.NotNull()
    com.proxorov.mvvmtry.data.utils.NetworkStatus p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.proxorov.mvvmtry.data.utils.Resource<com.proxorov.mvvmtry.domain.model.Articles>> getArticles() {
        return null;
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    private final androidx.lifecycle.LiveData<com.proxorov.mvvmtry.data.utils.Resource<com.proxorov.mvvmtry.domain.model.Articles>> fetchNews() {
        return null;
    }
    
    private final void cancelActiveJobs() {
    }
    
    public NewsRepository() {
        super();
    }
}