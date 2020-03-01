package com.proxorov.mvvmtry.presentation.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/proxorov/mvvmtry/presentation/di/component/AppComponent;", "", "inject", "", "newsRepository", "Lcom/proxorov/mvvmtry/data/repository/NewsRepository;", "networkStatus", "Lcom/proxorov/mvvmtry/data/utils/NetworkStatus;", "getNewsInteractor", "Lcom/proxorov/mvvmtry/domain/interactors/GetNewsInteractor;", "app_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {com.proxorov.mvvmtry.presentation.di.module.RestModule.class, com.proxorov.mvvmtry.presentation.di.module.AppModule.class})
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.proxorov.mvvmtry.data.repository.NewsRepository newsRepository);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.proxorov.mvvmtry.domain.interactors.GetNewsInteractor getNewsInteractor);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.proxorov.mvvmtry.data.utils.NetworkStatus networkStatus);
}