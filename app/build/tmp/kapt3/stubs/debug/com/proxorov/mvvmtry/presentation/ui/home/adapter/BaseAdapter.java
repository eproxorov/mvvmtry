package com.proxorov.mvvmtry.presentation.ui.home.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u001d\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016\u00a2\u0006\u0002\u0010\u0018R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/proxorov/mvvmtry/presentation/ui/home/adapter/BaseAdapter;", "VH", "Lcom/proxorov/mvvmtry/presentation/ui/home/adapter/BaseAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "items", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "add", "", "newItem", "newItems", "", "getItem", "position", "", "getItemCount", "onBindViewHolder", "holder", "(Lcom/proxorov/mvvmtry/presentation/ui/home/adapter/BaseAdapter$BaseViewHolder;I)V", "BaseViewHolder", "app_debug"})
public abstract class BaseAdapter<VH extends com.proxorov.mvvmtry.presentation.ui.home.adapter.BaseAdapter.BaseViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Object> items;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Object> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Object> p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    VH holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getItem(int position) {
        return null;
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    java.lang.Object newItem) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> newItems) {
    }
    
    public BaseAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/proxorov/mvvmtry/presentation/ui/home/adapter/BaseAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", "item", "", "app_debug"})
    public static abstract class BaseViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        public abstract void bind(@org.jetbrains.annotations.NotNull()
        java.lang.Object item);
        
        @org.jetbrains.annotations.NotNull()
        protected final android.view.View getView() {
            return null;
        }
        
        public BaseViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}