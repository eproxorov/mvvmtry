package com.proxorov.mvvmtry.presentation.ui.detail;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/proxorov/mvvmtry/presentation/ui/detail/DetailedFragment;", "Landroidx/fragment/app/Fragment;", "()V", "mBinding", "Lcom/proxorov/mvvmtry/databinding/FragmentDetailedBinding;", "getMBinding", "()Lcom/proxorov/mvvmtry/databinding/FragmentDetailedBinding;", "setMBinding", "(Lcom/proxorov/mvvmtry/databinding/FragmentDetailedBinding;)V", "newsItem", "Lcom/proxorov/mvvmtry/domain/model/NewsItem;", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_debug"})
public final class DetailedFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public com.proxorov.mvvmtry.databinding.FragmentDetailedBinding mBinding;
    private com.proxorov.mvvmtry.domain.model.NewsItem newsItem;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String arg1 = "arg1";
    public static final com.proxorov.mvvmtry.presentation.ui.detail.DetailedFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.proxorov.mvvmtry.databinding.FragmentDetailedBinding getMBinding() {
        return null;
    }
    
    public final void setMBinding(@org.jetbrains.annotations.NotNull()
    com.proxorov.mvvmtry.databinding.FragmentDetailedBinding p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public DetailedFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.proxorov.mvvmtry.presentation.ui.detail.DetailedFragment newInstance(@org.jetbrains.annotations.NotNull()
    com.proxorov.mvvmtry.domain.model.NewsItem newsItem) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/proxorov/mvvmtry/presentation/ui/detail/DetailedFragment$Companion;", "", "()V", "arg1", "", "newInstance", "Lcom/proxorov/mvvmtry/presentation/ui/detail/DetailedFragment;", "newsItem", "Lcom/proxorov/mvvmtry/domain/model/NewsItem;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.proxorov.mvvmtry.presentation.ui.detail.DetailedFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.proxorov.mvvmtry.domain.model.NewsItem newsItem) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}