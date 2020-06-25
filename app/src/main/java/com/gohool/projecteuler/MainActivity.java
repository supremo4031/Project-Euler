package com.gohool.projecteuler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import Model.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new Home();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment).commit();

        /************************************************************************************************************************/
        /**                                               BOTTOM NAVIGATION                                                    **/
        /************************************************************************************************************************/
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.bottomNavHomeButton :
                        selectedFragment = new Home();
                        break;
                    case R.id.bottomNavTrendingButton :
                        selectedFragment = new Trending();
                        break;
                    case R.id.bottomNavNotificationButton :
                        selectedFragment = new Notification();
                        break;
                    case R.id.bottomNavProfileButton :
                        selectedFragment = new Profile();
                        break;
                }
                assert selectedFragment != null;
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, selectedFragment).commit();
                return true;
            }
        });

        /************************************************************************************************************************/
        /************************************************************************************************************************/


    }
}