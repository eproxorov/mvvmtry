package com.proxorov.mvvmtry.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/proxorov/mvvmtry/domain/repository/INewsRepository;", "", "cancel", "", "getArticles", "Landroidx/lifecycle/LiveData;", "Lcom/proxorov/mvvmtry/data/utils/Resource;", "Lcom/proxorov/mvvmtry/domain/model/Articles;", "app_debug"})
public abstract interface INewsRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.proxorov.mvvmtry.data.utils.Resource<com.proxorov.mvvmtry.domain.model.Articles>> getArticles();
    
    public abstract void cancel();
}