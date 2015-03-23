package com.visttux.buticounter.presentation;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.visttux.buticounter.ButiApplication;
import com.visttux.buticounter.R;
import com.visttux.buticounter.di.component.ActivityComponent;
import com.visttux.buticounter.di.component.Dagger_ActivityComponent;
import com.visttux.buticounter.di.module.ActivityModule;

import butterknife.ButterKnife;

public class MainActivity extends ActionBarActivity {
    private ActivityComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        component().inject(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public ActivityComponent component() {
        if(component == null) {
            component = Dagger_ActivityComponent.builder()
                    .applicationComponent(((ButiApplication) getApplication()).component())
                    .activityModule(new ActivityModule(this))
                    .build();
        }
        return component;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.buti_actions,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
        //TODO call presenter when clicked apropiate action (undo, redo, reset)

    }
}
