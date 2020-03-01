// Generated by data binding compiler. Do not edit!
package com.proxorov.mvvmtry.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.proxorov.mvvmtry.R;
import com.proxorov.mvvmtry.domain.model.NewsItem;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class NewsitemRowBinding extends ViewDataBinding {
  @NonNull
  public final ImageView newsitemImage;

  @NonNull
  public final TextView newsitemTitle;

  @Bindable
  protected NewsItem mNewsItem;

  protected NewsitemRowBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView newsitemImage, TextView newsitemTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.newsitemImage = newsitemImage;
    this.newsitemTitle = newsitemTitle;
  }

  public abstract void setNewsItem(@Nullable NewsItem newsItem);

  @Nullable
  public NewsItem getNewsItem() {
    return mNewsItem;
  }

  @NonNull
  public static NewsitemRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.newsitem_row, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NewsitemRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NewsitemRowBinding>inflateInternal(inflater, R.layout.newsitem_row, root, attachToRoot, component);
  }

  @NonNull
  public static NewsitemRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.newsitem_row, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NewsitemRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NewsitemRowBinding>inflateInternal(inflater, R.layout.newsitem_row, null, false, component);
  }

  public static NewsitemRowBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static NewsitemRowBinding bind(@NonNull View view, @Nullable Object component) {
    return (NewsitemRowBinding)bind(component, view, R.layout.newsitem_row);
  }
}
