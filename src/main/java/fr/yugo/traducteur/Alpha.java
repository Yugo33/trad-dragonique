package fr.yugo.traducteur;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.lang.reflect.Field;

public class Alpha extends AppCompatActivity {
    private GridView gridView;
    private TextView result;
    private String content = "";
    static final String[] numbers = new String[] {
            "a", "b", "c", "d", "e",
            "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z"};


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

    private TextView.OnClickListener resultResetListener = new TextView.OnClickListener() {
        @Override
        public void onClick(View view) {
            ((TextView) view).setText(R.string.result_alpha);
            content = "";
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_alpha);
        BottomNavigationView navView = findViewById(R.id.nav_home);
        navView.setSelectedItemId(R.id.navigation_notifications);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        this.result = findViewById(R.id.result);

        result.setOnClickListener(resultResetListener);

        gridView = (GridView) findViewById(R.id.gridView);


        gridView.setAdapter(new Adapter(this, numbers));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                content = content + numbers[position];

                result.setText(content);

            }
        });


    }

    public static int getResId(String resName, Class<?> c) {

        try {
            Field idField = c.getDeclaredField(resName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

}
