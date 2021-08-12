package com.example.petrotransv1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class Pomoc extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    androidx.appcompat.widget.Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pomoc);
        toolbar=findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);


        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.nav_view);

        ActionBarDrawerToggle Toggle;
        Toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        Toggle.setDrawerIndicatorEnabled(false);

        Toggle.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
        drawerLayout.addDrawerListener(Toggle);
        Toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
/////////////////////////////
        // final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        // ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        //     this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);


        // toggle.setDrawerIndicatorEnabled(false);

        Toggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        Toggle.setHomeAsUpIndicator(R.drawable.menuicon);



        ////Inicjalizacja bottom menu

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.Bottom_strona_glowna);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.Bottom_zglos:
                        startActivity(new Intent(getApplicationContext(),Zglos.class));
                        overridePendingTransition(0,0);
                        return  true;
                }
                switch (item.getItemId()) {
                    case R.id.Bottom_strona_glowna:
                        startActivity(new Intent(getApplicationContext(),MainSite.class));
                        overridePendingTransition(0,0);
                        return  true;
                }
                switch (item.getItemId()) {
                    case R.id.Bottom_profil:
                        startActivity(new Intent(getApplicationContext(),Twoj_Profil.class));
                        overridePendingTransition(0,0);
                        return  true;
                }

                return false;
            }
        });









    }




    //////////////////////////////////
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Context context = getApplicationContext();
        CharSequence text = "Strona Główna";

        int duration = Toast.LENGTH_SHORT;

        int id = item.getItemId();

        if (id == R.id.Strona_Glowna) {
            Intent intent=new Intent(Pomoc.this,MainSite.class);
            startActivity(intent);
            Toast toast = Toast.makeText(context, "Strona Główna", duration);
            toast.show();
        }
        if (id == R.id.Twoj_Profil) {
            Intent intent=new Intent(Pomoc.this,Twoj_Profil.class);
            startActivity(intent);
            Toast toast = Toast.makeText(context, "Twój profil", duration);
            toast.show();
        }
        if (id == R.id.Promocje) {
            Intent intent=new Intent(Pomoc.this,Promocje.class);
            startActivity(intent);
            Toast toast = Toast.makeText(context, "Promocje", duration);
            toast.show();
        }
        if (id == R.id.Nowosci) {
            Intent intent=new Intent(Pomoc.this,Nowosci.class);
            startActivity(intent);
            Toast toast = Toast.makeText(context, "Nowości", duration);
            toast.show();
        }
        if (id == R.id.Regulamin) {
            Intent intent=new Intent(Pomoc.this,Regulamin.class);
            startActivity(intent);
            Toast toast = Toast.makeText(context, "Regulamin", duration);
            toast.show();
        }


        return true;
    }

}