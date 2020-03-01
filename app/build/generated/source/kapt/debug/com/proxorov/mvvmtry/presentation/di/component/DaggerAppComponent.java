// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.proxorov.mvvmtry.presentation.di.component;

import android.content.Context;
import com.google.gson.Gson;
import com.proxorov.mvvmtry.data.repository.NewsRepository;
import com.proxorov.mvvmtry.data.repository.NewsRepository_MembersInjector;
import com.proxorov.mvvmtry.data.source.database.NewsDAO;
import com.proxorov.mvvmtry.data.source.database.NewsDB;
import com.proxorov.mvvmtry.data.source.remote.api.NewsApi;
import com.proxorov.mvvmtry.data.utils.NetworkStatus;
import com.proxorov.mvvmtry.domain.interactors.GetNewsInteractor;
import com.proxorov.mvvmtry.domain.interactors.GetNewsInteractor_MembersInjector;
import com.proxorov.mvvmtry.domain.repository.INewsRepository;
import com.proxorov.mvvmtry.presentation.di.module.AppModule;
import com.proxorov.mvvmtry.presentation.di.module.AppModule_ProvideContextFactory;
import com.proxorov.mvvmtry.presentation.di.module.AppModule_ProvideNetworkStatusFactory;
import com.proxorov.mvvmtry.presentation.di.module.AppModule_ProvideNewsDAOFactory;
import com.proxorov.mvvmtry.presentation.di.module.AppModule_ProvideNewsDBFactory;
import com.proxorov.mvvmtry.presentation.di.module.AppModule_ProvideNewsRepositoryFactory;
import com.proxorov.mvvmtry.presentation.di.module.RestModule;
import com.proxorov.mvvmtry.presentation.di.module.RestModule_ProvideGsonFactory;
import com.proxorov.mvvmtry.presentation.di.module.RestModule_ProvideNewsApiFactory;
import com.proxorov.mvvmtry.presentation.di.module.RestModule_ProvideNewsRetrofitFactory;
import com.proxorov.mvvmtry.presentation.di.module.RestModule_ProvideOkHttpFactory;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class DaggerAppComponent implements AppComponent {
  private Provider<Gson> provideGsonProvider;

  private Provider<OkHttpClient> provideOkHttpProvider;

  private Provider<Retrofit> provideNewsRetrofitProvider;

  private Provider<NewsApi> provideNewsApiProvider;

  private Provider<NewsDB> provideNewsDBProvider;

  private Provider<NewsDAO> provideNewsDAOProvider;

  private Provider<Context> provideContextProvider;

  private Provider<NetworkStatus> provideNetworkStatusProvider;

  private MembersInjector<NewsRepository> newsRepositoryMembersInjector;

  private Provider<INewsRepository> provideNewsRepositoryProvider;

  private MembersInjector<GetNewsInteractor> getNewsInteractorMembersInjector;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideGsonProvider =
        DoubleCheck.provider(RestModule_ProvideGsonFactory.create(builder.restModule));

    this.provideOkHttpProvider =
        DoubleCheck.provider(RestModule_ProvideOkHttpFactory.create(builder.restModule));

    this.provideNewsRetrofitProvider =
        DoubleCheck.provider(
            RestModule_ProvideNewsRetrofitFactory.create(
                builder.restModule, provideGsonProvider, provideOkHttpProvider));

    this.provideNewsApiProvider =
        DoubleCheck.provider(
            RestModule_ProvideNewsApiFactory.create(
                builder.restModule, provideNewsRetrofitProvider));

    this.provideNewsDBProvider =
        DoubleCheck.provider(AppModule_ProvideNewsDBFactory.create(builder.appModule));

    this.provideNewsDAOProvider =
        DoubleCheck.provider(
            AppModule_ProvideNewsDAOFactory.create(builder.appModule, provideNewsDBProvider));

    this.provideContextProvider =
        DoubleCheck.provider(AppModule_ProvideContextFactory.create(builder.appModule));

    this.provideNetworkStatusProvider =
        DoubleCheck.provider(
            AppModule_ProvideNetworkStatusFactory.create(
                builder.appModule, provideContextProvider));

    this.newsRepositoryMembersInjector =
        NewsRepository_MembersInjector.create(
            provideNewsApiProvider, provideNewsDAOProvider, provideNetworkStatusProvider);

    this.provideNewsRepositoryProvider =
        DoubleCheck.provider(AppModule_ProvideNewsRepositoryFactory.create(builder.appModule));

    this.getNewsInteractorMembersInjector =
        GetNewsInteractor_MembersInjector.create(provideNewsRepositoryProvider);
  }

  @Override
  public void inject(NewsRepository newsRepository) {
    newsRepositoryMembersInjector.injectMembers(newsRepository);
  }

  @Override
  public void inject(GetNewsInteractor getNewsInteractor) {
    getNewsInteractorMembersInjector.injectMembers(getNewsInteractor);
  }

  @Override
  public void inject(NetworkStatus networkStatus) {
    MembersInjectors.<NetworkStatus>noOp().injectMembers(networkStatus);
  }

  public static final class Builder {
    private RestModule restModule;

    private AppModule appModule;

    private Builder() {}

    public AppComponent build() {
      if (restModule == null) {
        this.restModule = new RestModule();
      }
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    public Builder restModule(RestModule restModule) {
      this.restModule = Preconditions.checkNotNull(restModule);
      return this;
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }
  }
}