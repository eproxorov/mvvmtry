// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.proxorov.mvvmtry.domain.interactors;

import com.proxorov.mvvmtry.domain.repository.INewsRepository;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class GetNewsInteractor_MembersInjector implements MembersInjector<GetNewsInteractor> {
  private final Provider<INewsRepository> newsRepositoryProvider;

  public GetNewsInteractor_MembersInjector(Provider<INewsRepository> newsRepositoryProvider) {
    assert newsRepositoryProvider != null;
    this.newsRepositoryProvider = newsRepositoryProvider;
  }

  public static MembersInjector<GetNewsInteractor> create(
      Provider<INewsRepository> newsRepositoryProvider) {
    return new GetNewsInteractor_MembersInjector(newsRepositoryProvider);
  }

  @Override
  public void injectMembers(GetNewsInteractor instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.newsRepository = newsRepositoryProvider.get();
  }
}
