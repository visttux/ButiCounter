package com.visttux.buticounter;

import android.app.Application;

import com.visttux.buticounter.di.component.ApplicationComponent;
import com.visttux.buticounter.di.component.Dagger_ApplicationComponent;
import com.visttux.buticounter.di.module.ApplicationModule;


public class ButiApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        buildComponent();
    }

    private void buildComponent() {
        this.applicationComponent = Dagger_ApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent component() {
        return applicationComponent;
    }
}
