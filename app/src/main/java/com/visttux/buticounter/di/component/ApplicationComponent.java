package com.visttux.buticounter.di.component;


import android.app.Application;

import com.visttux.buticounter.ButiApplication;
import com.visttux.buticounter.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(ButiApplication application);

    Application application();
}
