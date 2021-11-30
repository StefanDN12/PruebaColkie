// Generated by Dagger (https://dagger.dev).
package com.stefandn.pruebacolkie.ui.viewModels;

import android.content.Context;
import com.stefandn.pruebacolkie.domain.GetAllCakes;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CakeViewModel_Factory implements Factory<CakeViewModel> {
  private final Provider<GetAllCakes> getAllCakesProvider;

  private final Provider<Context> appContextProvider;

  public CakeViewModel_Factory(Provider<GetAllCakes> getAllCakesProvider,
      Provider<Context> appContextProvider) {
    this.getAllCakesProvider = getAllCakesProvider;
    this.appContextProvider = appContextProvider;
  }

  @Override
  public CakeViewModel get() {
    return newInstance(getAllCakesProvider.get(), appContextProvider.get());
  }

  public static CakeViewModel_Factory create(Provider<GetAllCakes> getAllCakesProvider,
      Provider<Context> appContextProvider) {
    return new CakeViewModel_Factory(getAllCakesProvider, appContextProvider);
  }

  public static CakeViewModel newInstance(GetAllCakes getAllCakes, Context appContext) {
    return new CakeViewModel(getAllCakes, appContext);
  }
}