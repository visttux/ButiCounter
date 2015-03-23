package com.visttux.buticounter.di.component;

import com.visttux.buticounter.presentation.MainActivity;
import com.visttux.buticounter.di.PerActivity;
import com.visttux.buticounter.di.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies =  ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}
