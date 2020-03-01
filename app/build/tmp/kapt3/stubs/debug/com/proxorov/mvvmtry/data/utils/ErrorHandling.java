package com.proxorov.mvvmtry.data.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/proxorov/mvvmtry/data/utils/ErrorHandling;", "", "()V", "Companion", "app_debug"})
public final class ErrorHandling {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNABLE_TO_RESOLVE_HOST = "Unable to resolve host";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNABLE_TODO_OPERATION_WO_INTERNET = "Can\'t do that operation without an internet connection";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_CHECK_NETWORK_CONNECTION = "Check network connection.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_UNKNOWN = "Unknown error";
    public static final com.proxorov.mvvmtry.data.utils.ErrorHandling.Companion Companion = null;
    
    public ErrorHandling() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/proxorov/mvvmtry/data/utils/ErrorHandling$Companion;", "", "()V", "ERROR_CHECK_NETWORK_CONNECTION", "", "ERROR_UNKNOWN", "UNABLE_TODO_OPERATION_WO_INTERNET", "UNABLE_TO_RESOLVE_HOST", "isNetworkError", "", "msg", "app_debug"})
    public static final class Companion {
        
        public final boolean isNetworkError(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}