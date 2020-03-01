package com.proxorov.mvvmtry.presentation.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/proxorov/mvvmtry/presentation/di/module/RestModule;", "", "()V", "provideGson", "Lcom/google/gson/Gson;", "provideNewsApi", "Lcom/proxorov/mvvmtry/data/source/remote/api/NewsApi;", "retrofit", "Lretrofit2/Retrofit;", "provideNewsRetrofit", "gson", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideOkHttp", "app_debug"})
@dagger.Module()
public final class RestModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "News_API")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideNewsRetrofit(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.proxorov.mvvmtry.data.source.remote.api.NewsApi provideNewsApi(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "News_API")
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public RestModule() {
        super();
    }
}