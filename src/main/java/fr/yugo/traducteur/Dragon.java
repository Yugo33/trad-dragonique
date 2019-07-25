package fr.yugo.traducteur;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Dragon extends AppCompatActivity {

    private Button btn;
    private GridView gridView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home_dragon:
                    Intent home = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(home);
                    return true;
                case R.id.navigation_dashboard_dragon:
                    Intent dragon = new Intent(getApplicationContext(), Dragon.class);
                    startActivity(dragon);
                    return true;
                case R.id.navigation_notifications_dragon:
                    Intent alpha = new Intent(getApplicationContext(), Alpha.class);
                    startActivity(alpha);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragon);
        BottomNavigationView navView = findViewById(R.id.nav_dragon);
        navView.setSelectedItemId(R.id.navigation_dashboard_dragon);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        this.gridView = findViewById(R.id.gridViewDrag);
        this.btn = findViewById(R.id.trad_dragon);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText content = findViewById(R.id.content_dragon);
                String cont = content.getText().toString();

                setText(cont);
            }
        });
    }

    private void setText(String cont) {

        List<String> array = new ArrayList<>();
        for (int i = 1; i < cont.split("").length; i++) {
            array.add(cont.split("")[i]);
        }



        gridView.setAdapter(new Adapter(this, array.toArray(new String[] {})));
    }
}