package com.proxorov.mvvmtry.databinding;
import com.proxorov.mvvmtry.R;
import com.proxorov.mvvmtry.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NewsitemRowBindingImpl extends NewsitemRowBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NewsitemRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private NewsitemRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.newsitemImage.setTag(null);
        this.newsitemTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.newsItem == variableId) {
            setNewsItem((com.proxorov.mvvmtry.domain.model.NewsItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNewsItem(@Nullable com.proxorov.mvvmtry.domain.model.NewsItem NewsItem) {
        this.mNewsItem = NewsItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.newsItem);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String newsItemUrlToImage = null;
        com.proxorov.mvvmtry.domain.model.NewsItem newsItem = mNewsItem;
        java.lang.String newsItemName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (newsItem != null) {
                    // read newsItem.urlToImage
                    newsItemUrlToImage = newsItem.getUrlToImage();
                    // read newsItem.name
                    newsItemName = newsItem.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.proxorov.mvvmtry.presentation.utils.databinding.GlideBindingAdapters.setImageWithGlide(this.newsitemImage, newsItemUrlToImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.newsitemTitle, newsItemName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): newsItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}