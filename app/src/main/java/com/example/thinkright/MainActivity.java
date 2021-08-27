package com.example.thinkright;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnv;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentscreens();
        setSupportActionBar(toolbar);


    }

    private void fragmentscreens() {
        getSupportFragmentManager().beginTransaction().replace(R.id.mainframe, new HomeFragment()).commit();
        initview();
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment temp = null;
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        temp = new HomeFragment();
                        break;
                    case R.id.menu_master:
                        temp = new MasterFragment();
                        break;
                    case R.id.menu_more:
                        temp = new MoreFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.mainframe, temp).commit();
                return true;
            }
        });

    }


    private void initview() {
        bnv = findViewById(R.id.bottomNavigation);
        toolbar = findViewById(R.id.homeToolBar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return true;
    }



}
