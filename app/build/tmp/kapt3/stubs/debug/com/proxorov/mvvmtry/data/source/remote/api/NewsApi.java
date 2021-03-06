package com.proxorov.mvvmtry.data.source.remote.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/proxorov/mvvmtry/data/source/remote/api/NewsApi;", "", "getArticles", "Landroidx/lifecycle/LiveData;", "Lcom/proxorov/mvvmtry/data/utils/GenericApiResponse;", "Lcom/proxorov/mvvmtry/domain/model/Articles;", "app_debug"})
public abstract interface NewsApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/v2//top-headlines?country=ru&apiKey=d93b0f66d02442ada6e8751df3a0c295")
    public abstract androidx.lifecycle.LiveData<com.proxorov.mvvmtry.data.utils.GenericApiResponse<com.proxorov.mvvmtry.domain.model.Articles>> getArticles();
}