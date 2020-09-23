package com.makza.fisher_hanbook;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ListView list;
    private String[] array;
    private ArrayAdapter<String> adapter;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.listView); //присвоил переменной лист листвью
        array = getResources().getStringArray(R.array.fish_array); //присвоил список массиву
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,new ArrayList<String>(Arrays.asList(array)));
        list.setAdapter(adapter); //присваиваем список спомощью адаптера

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.fish); //присваиваем заголовок с названием рыба


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.id_fish){
            toolbar.setTitle(R.string.fish);
            array = getResources().getStringArray(R.array.fish_array); //присвоил список массиву
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged(); //говорим что данные изменились
        }
        else if (id == R.id.id_na){
            toolbar.setTitle(R.string.na);
            array = getResources().getStringArray(R.array.na_array); //присвоил список массиву
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if (id == R.id.id_sna){
            toolbar.setTitle(R.string.sna);
            array = getResources().getStringArray(R.array.sna_array); //присвоил список массиву
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if (id == R.id.id_pri){
            toolbar.setTitle(R.string.pri);
            array = getResources().getStringArray(R.array.pri_array); //присвоил список массиву
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if (id == R.id.id_history){
            toolbar.setTitle(R.string.history);
            array = getResources().getStringArray(R.array.history_array); //присвоил список массиву
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if (id == R.id.id_advice){
            toolbar.setTitle(R.string.advice);
            array = getResources().getStringArray(R.array.advice_array); //присвоил список массиву
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START); //закрытие шторки
        return true;
    }


}