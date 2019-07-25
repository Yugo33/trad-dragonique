package fr.yugo.traducteur;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent home = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(home);
                    return true;
                case R.id.navigation_dashboard:
                    Intent dragon = new Intent(getApplicationContext(), Dragon.class);
                    startActivity(dragon);
                    return true;
                case R.id.navigation_notifications:
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
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_home);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
