// Generated by Dagger (https://dagger.dev).
package com.stefandn.pruebacolkie.domain;

import com.stefandn.pruebacolkie.data.CakeRepositori;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetAllCakes_Factory implements Factory<GetAllCakes> {
  private final Provider<CakeRepositori> cakeRepositoriProvider;

  public GetAllCakes_Factory(Provider<CakeRepositori> cakeRepositoriProvider) {
    this.cakeRepositoriProvider = cakeRepositoriProvider;
  }

  @Override
  public GetAllCakes get() {
    return newInstance(cakeRepositoriProvider.get());
  }

  public static GetAllCakes_Factory create(Provider<CakeRepositori> cakeRepositoriProvider) {
    return new GetAllCakes_Factory(cakeRepositoriProvider);
  }

  public static GetAllCakes newInstance(CakeRepositori cakeRepositori) {
    return new GetAllCakes(cakeRepositori);
  }
}