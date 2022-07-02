package com.example.youtubeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.youtubeapp.fragment.FragmentHome;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView btNavigation;
    MenuItem menuItemHome, menuItemExplore, menuItemSubscription;
    Menu menu;
    FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        startActivity(new Intent(this, StartApp.class));
        mapping();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentHome fragmentHome = new FragmentHome();
        //ADD FRAGMENT
        fragmentTransaction.add(R.id.cl_contains_fragment, fragmentHome);
        fragmentTransaction.commit();

        btNavigation.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                 switch (item.getItemId()){
                     case R.id.it_action_home:
                         item.setChecked(true);
                         Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                         break;
                     case R.id.it_action_explore:
                         item.setChecked(true);
                         Toast.makeText(MainActivity.this, "Explore", Toast.LENGTH_SHORT).show();
                         break;
                     case R.id.it_action_subscription:
                         item.setChecked(true);
                         Toast.makeText(MainActivity.this, "Sub", Toast.LENGTH_SHORT).show();
                        break;
                     case R.id.it_action_notifications:
                         item.setChecked(true);
                         Toast.makeText(MainActivity.this, "Notification", Toast.LENGTH_SHORT).show();
                         break;
                     case R.id.it_action_library:
                         item.setChecked(true);
                         Toast.makeText(MainActivity.this, "Library", Toast.LENGTH_SHORT).show();
                         break;
                 }
                return false;
            }
        });
    }
    public void mapping(){
        btNavigation = findViewById(R.id.bn_end_bar);
    }
}