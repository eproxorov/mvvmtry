package com.proxorov.mvvmtry.presentation.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/proxorov/mvvmtry/presentation/di/module/AppModule;", "", "application", "Landroid/content/Context;", "(Landroid/content/Context;)V", "provideContext", "provideNetworkStatus", "Lcom/proxorov/mvvmtry/data/utils/NetworkStatus;", "provideNewsDAO", "Lcom/proxorov/mvvmtry/data/source/database/NewsDAO;", "db", "Lcom/proxorov/mvvmtry/data/source/database/NewsDB;", "provideNewsDB", "provideNewsRepository", "Lcom/proxorov/mvvmtry/domain/repository/INewsRepository;", "app_debug"})
@dagger.Module()
public final class AppModule {
    private final android.content.Context application = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.proxorov.mvvmtry.domain.repository.INewsRepository provideNewsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.proxorov.mvvmtry.data.utils.NetworkStatus provideNetworkStatus(@org.jetbrains.annotations.NotNull()
    android.content.Context application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.proxorov.mvvmtry.data.source.database.NewsDB provideNewsDB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.proxorov.mvvmtry.data.source.database.NewsDAO provideNewsDAO(@org.jetbrains.annotations.NotNull()
    com.proxorov.mvvmtry.data.source.database.NewsDB db) {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    android.content.Context application) {
        super();
    }
}