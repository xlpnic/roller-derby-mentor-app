package com.example.rollerderbymentormagic;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,
                R.id.nav_skills_skating_posture,
                R.id.nav_skills_stride,
                R.id.nav_skills_crossovers,
                R.id.nav_skills_speed_endurance,
                R.id.nav_skills_stops,
                R.id.nav_skills_other_skills,
                R.id.nav_skills_knee_taps,
                R.id.nav_skills_knee_slides,
                R.id.nav_skills_standing_stepping,
                R.id.nav_skills_hopping,
                R.id.nav_skills_focus,
                R.id.nav_skills_weaving,
                R.id.nav_skills_transitions,
                R.id.nav_skills_whips,
                R.id.nav_skills_pushes,
                R.id.nav_skills_pacing,
                R.id.nav_skills_moving_obstacles,
                R.id.nav_skills_unexpected_obstacles,
                R.id.nav_skills_taking_hits,
                R.id.nav_skills_positional_blocking,
                R.id.nav_skills_checks,
                R.id.nav_glossary,
                R.id.nav_about)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        ActionBar x = getSupportActionBar();
        if(x != null){
            x.setDisplayShowTitleEnabled(false);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
