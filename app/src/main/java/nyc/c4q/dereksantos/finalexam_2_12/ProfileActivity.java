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
    private ImageButton heart_button;
    private ImageButton message_button;
    private ImageButton settings_button;
    private ImageButton logout_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_drawer);

        setTitle("Profile");

        initRecyclerView();

        findButtons();

        setButtonOnClicks();

        addItemsToList();

        NavDrawerAdapter adapter = (NavDrawerAdapter) recyclerView.getAdapter();
        adapter.setData(itemList);

    }

    private void addItemsToList() {
        itemList.add(new NavDrawerItem(heart_button.getId(), R.drawable.ic_favorite_black_24dp, "Button 1"));
        itemList.add(new NavDrawerItem(message_button.getId(), R.drawable.ic_email_black_24dp, "Button 2"));
        itemList.add(new NavDrawerItem(settings_button.getId(), R.drawable.ic_settings_black_24dp, "Button 3"));
        itemList.add(new NavDrawerItem(logout_button.getId(), R.drawable.ic_close_black_24dp, "Logout"));
    }

    private void setButtonOnClicks() {
        heart_button.setOnClickListener(this);
        message_button.setOnClickListener(this);
        settings_button.setOnClickListener(this);
        logout_button.setOnClickListener(this);
    }

    private void findButtons() {
        heart_button = (ImageButton) findViewById(R.id.heart_button);
        message_button = (ImageButton) findViewById(R.id.message_button);
        settings_button = (ImageButton) findViewById(R.id.settings_button);
        logout_button = (ImageButton) findViewById(R.id.logout_button);
    }

    private void initRecyclerView() {
        recyclerView = (RecyclerView) findViewById(R.id.nav_drawer_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new NavDrawerAdapter());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.heart_button:
                Toast.makeText(this, "Selected Heart Activity", Toast.LENGTH_SHORT).show();
                break;
            case R.id.message_button:
                Toast.makeText(this, "Selected Message Activity", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings_button:
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.logout_button:
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
