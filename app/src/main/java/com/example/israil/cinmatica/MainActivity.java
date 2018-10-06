package com.example.israil.cinmatica;

import android.support.design.widget.TabLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.israil.cinmatica.Adapters.SectionsPageAdapter;
import com.example.israil.cinmatica.Tabs.Tab1;
import com.example.israil.cinmatica.Tabs.Tab2;
import com.example.israil.cinmatica.Tabs.Tab3;

public class MainActivity extends AppCompatActivity {


    private SectionsPageAdapter sectionsPageAdapter;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.container);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }


    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1(),"Cегодня в кино");
        adapter.addFragment(new Tab2(),"Скоро в кино");
        adapter.addFragment(new Tab3(),"Где посмотреть?");
        viewPager.setAdapter(adapter);
    }

}
