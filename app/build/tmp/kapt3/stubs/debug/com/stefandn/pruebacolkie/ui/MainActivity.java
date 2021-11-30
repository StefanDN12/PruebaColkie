package com.stefandn.pruebacolkie.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0013R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R)\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/stefandn/pruebacolkie/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "CakeViewModel", "Lcom/stefandn/pruebacolkie/ui/viewModels/CakeViewModel;", "getCakeViewModel", "()Lcom/stefandn/pruebacolkie/ui/viewModels/CakeViewModel;", "CakeViewModel$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/stefandn/pruebacolkie/ui/adapters/CakeAdapter;", "binding", "Lcom/stefandn/pruebacolkie/databinding/ActivityMainBinding;", "listener", "Lkotlin/Function1;", "Lcom/stefandn/pruebacolkie/data/CakeModel;", "Lkotlin/ParameterName;", "name", "cakes", "", "obtenerDatos", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "recargarDatos", "swipetoRefresh", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.stefandn.pruebacolkie.databinding.ActivityMainBinding binding;
    private final kotlin.Lazy CakeViewModel$delegate = null;
    private com.stefandn.pruebacolkie.ui.adapters.CakeAdapter adapter;
    private final kotlin.jvm.functions.Function1<com.stefandn.pruebacolkie.data.CakeModel, kotlin.Unit> listener = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.stefandn.pruebacolkie.ui.viewModels.CakeViewModel getCakeViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void obtenerDatos() {
    }
    
    public final void swipetoRefresh() {
    }
    
    public final void recargarDatos() {
    }
}