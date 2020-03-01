package com.proxorov.mvvmtry.data.repository;

import java.lang.System;

/**
 * BASED ON
 * A generic class that can provide a resource backed by both the sqlite database and the network.
 *
 *
 * You can read more about it in the [Architecture
 * * Guide](https://developer.android.com/arch).
 * @param <ResponseObject>
 * @param <RequestType>
 * </RequestType></ResponseObject>
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u0011J\u0011\u0010\u0012\u001a\u00020\u0013H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u0011H$J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u001f\u0010\u0019\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H$J\u0014\u0010\"\u001a\u00020\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0010\u0010$\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010&J\u0010\u0010\'\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020 H$J\u0016\u0010(\u001a\u00020\u00132\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0003J\u001b\u0010*\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00018\u0001H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006-"}, d2 = {"Lcom/proxorov/mvvmtry/data/repository/NetworkBoundResource;", "ResponseObject", "CasheObject", "", "isNetworkAvailable", "", "(Z)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "job", "Lkotlinx/coroutines/CompletableJob;", "result", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/proxorov/mvvmtry/data/utils/Resource;", "getResult", "()Landroidx/lifecycle/MediatorLiveData;", "asLiveData", "Landroidx/lifecycle/LiveData;", "createCacheRequestAndReturn", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCall", "Lcom/proxorov/mvvmtry/data/utils/GenericApiResponse;", "doCacheRequest", "doNetworkRequest", "handleApiSuccessResponse", "response", "Lcom/proxorov/mvvmtry/data/utils/GenericApiResponse$ApiSuccessResponse;", "(Lcom/proxorov/mvvmtry/data/utils/GenericApiResponse$ApiSuccessResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleNetworkCall", "(Lcom/proxorov/mvvmtry/data/utils/GenericApiResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initNewJob", "Lkotlinx/coroutines/Job;", "loadFromCache", "onCompleteJob", "state", "onErrorReturn", "errorMessage", "", "setJob", "setValue", "newValue", "updateLocalDb", "cacheObject", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class NetworkBoundResource<ResponseObject extends java.lang.Object, CasheObject extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.proxorov.mvvmtry.data.utils.Resource<ResponseObject>> result = null;
    private kotlinx.coroutines.CompletableJob job;
    private kotlinx.coroutines.CoroutineScope coroutineScope;
    private final boolean isNetworkAvailable = false;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.proxorov.mvvmtry.data.utils.Resource<ResponseObject>> getResult() {
        return null;
    }
    
    public final void onCompleteJob(@org.jetbrains.annotations.NotNull()
    com.proxorov.mvvmtry.data.utils.Resource<? extends ResponseObject> state) {
    }
    
    public final void onErrorReturn(@org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage) {
    }
    
    @kotlin.UseExperimental(markerClass = {kotlinx.coroutines.InternalCoroutinesApi.class})
    private final kotlinx.coroutines.Job initNewJob() {
        return null;
    }
    
    private final void doCacheRequest() {
    }
    
    private final void doNetworkRequest() {
    }
    
    @androidx.annotation.MainThread()
    private final void setValue(com.proxorov.mvvmtry.data.utils.Resource<? extends ResponseObject> newValue) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.proxorov.mvvmtry.data.utils.Resource<ResponseObject>> asLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object createCacheRequestAndReturn(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object handleApiSuccessResponse(@org.jetbrains.annotations.NotNull()
    com.proxorov.mvvmtry.data.utils.GenericApiResponse.ApiSuccessResponse<ResponseObject> response, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.lifecycle.LiveData<com.proxorov.mvvmtry.data.utils.GenericApiResponse<ResponseObject>> createCall();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.lifecycle.LiveData<CasheObject> loadFromCache();
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object updateLocalDb(@org.jetbrains.annotations.Nullable()
    CasheObject cacheObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    protected abstract void setJob(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job job);
    
    public NetworkBoundResource(boolean isNetworkAvailable) {
        super();
    }
}