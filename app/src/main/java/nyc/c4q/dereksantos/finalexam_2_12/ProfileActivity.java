package nyc.c4q.dereksantos.finalexam_2_12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SACC on 2/12/17.
 */
public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private List<NavDrawerItem> itemList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_drawer);

        setTitle("Profile");

        recyclerView = (RecyclerView) findViewById(R.id.nav_drawer_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new NavDrawerAdapter());

        button1 = (ImageButton) findViewById(R.id.button1);
        button2 = (ImageButton) findViewById(R.id.button2);
        button3 = (ImageButton) findViewById(R.id.button3);
        button4 = (ImageButton) findViewById(R.id.button4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

        itemList.add(new NavDrawerItem(button1.getId(), R.drawable.ic_favorite_black_24dp, "Button 1"));
        itemList.add(new NavDrawerItem(button2.getId(), R.drawable.ic_email_black_24dp, "Button 2"));
        itemList.add(new NavDrawerItem(button3.getId(), R.drawable.ic_settings_black_24dp, "Button 3"));
        itemList.add(new NavDrawerItem(button4.getId(), R.drawable.ic_close_black_24dp, "Logout"));

        NavDrawerAdapter adapter = (NavDrawerAdapter) recyclerView.getAdapter();
        adapter.setData(itemList);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Toast.makeText(this, "Selected Heart Activity", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "Selected Message Activity", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.button4:
                Toast.makeText(this, "Selected Logout Activity", Toast.LENGTH_SHORT).show();
                finishAffinity();
                break;
        }
    }

    public void doThis(View view) {
        switch (view.getId()) {
            case R.drawable.ic_favorite_black_24dp:
                Toast.makeText(this, "Selected Heart Activity", Toast.LENGTH_SHORT).show();
                break;
            case R.drawable.ic_email_black_24dp:
                Toast.makeText(this, "Selected Message Activity", Toast.LENGTH_SHORT).show();
                break;
            case R.drawable.ic_settings_black_24dp:
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
                break;
            case R.drawable.ic_close_black_24dp:
                Toast.makeText(this, "Selected Logout Activity", Toast.LENGTH_SHORT).show();
                finishAffinity();
                break;
        }
    }
}
