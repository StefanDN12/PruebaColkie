package com.stefandn.pruebacolkie.ui.viewModels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/stefandn/pruebacolkie/ui/viewModels/CakeViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllCakes", "Lcom/stefandn/pruebacolkie/domain/GetAllCakes;", "appContext", "Landroid/content/Context;", "(Lcom/stefandn/pruebacolkie/domain/GetAllCakes;Landroid/content/Context;)V", "cakes", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/stefandn/pruebacolkie/data/CakeModel;", "getCakes", "()Landroidx/lifecycle/MutableLiveData;", "isError", "", "isLoading", "onCreate", "", "sortedAndDuplicatedCakes", "result", "app_debug"})
public final class CakeViewModel extends androidx.lifecycle.ViewModel {
    private final com.stefandn.pruebacolkie.domain.GetAllCakes getAllCakes = null;
    private final android.content.Context appContext = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.stefandn.pruebacolkie.data.CakeModel>> cakes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isError = null;
    
    @javax.inject.Inject()
    public CakeViewModel(@org.jetbrains.annotations.NotNull()
    com.stefandn.pruebacolkie.domain.GetAllCakes getAllCakes, @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.stefandn.pruebacolkie.data.CakeModel>> getCakes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isError() {
        return null;
    }
    
    public final void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stefandn.pruebacolkie.data.CakeModel> sortedAndDuplicatedCakes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stefandn.pruebacolkie.data.CakeModel> result) {
        return null;
    }
}