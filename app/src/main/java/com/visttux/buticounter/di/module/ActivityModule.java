package com.visttux.buticounter.di.module;


import com.visttux.buticounter.presentation.MainActivity;

import dagger.Module;

@Module
public class ActivityModule {
    private final MainActivity mainActivity;


    public ActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


}
