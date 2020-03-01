package com.proxorov.mvvmtry.presentation.ui.home.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012:\b\u0002\u0010\u0004\u001a4\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u0012:\b\u0002\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0002R@\u0010\u0004\u001a4\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R@\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/proxorov/mvvmtry/presentation/ui/home/adapter/RecyclerItemClickListener;", "Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;", "mRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "clickListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "position", "Landroid/view/View;", "view", "", "longClickListener", "(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "onChildViewAttachedToWindow", "onChildViewDetachedFromWindow", "setOnChildAttachedToWindow", "v", "app_debug"})
public final class RecyclerItemClickListener implements androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener {
    private final androidx.recyclerview.widget.RecyclerView mRecycler = null;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, android.view.View, kotlin.Unit> clickListener = null;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, android.view.View, kotlin.Unit> longClickListener = null;
    
    @java.lang.Override()
    public void onChildViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onChildViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void setOnChildAttachedToWindow(android.view.View v) {
    }
    
    public RecyclerItemClickListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView mRecycler, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.view.View, kotlin.Unit> clickListener, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.view.View, kotlin.Unit> longClickListener) {
        super();
    }
}