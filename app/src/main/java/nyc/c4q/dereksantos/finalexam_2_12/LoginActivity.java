package nyc.c4q.dereksantos.finalexam_2_12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTitle("Login");

        username = (EditText) findViewById(R.id.username_edittext);
        password = (EditText) findViewById(R.id.password_edittext);
        submitButton = (Button) findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredUsername = getUsernameText();
                String enteredPassword = getPasswordText();

                handleLogin(enteredUsername, enteredPassword);
            }
        });
    }

    private void handleLogin(String enteredUsername, String enteredPassword) {
        if (enteredUsername.isEmpty()) {
            Toast.makeText(this, "Enter a username", Toast.LENGTH_SHORT).show();
        } else if (enteredPassword.isEmpty()) {
            Toast.makeText(this, "Enter a password", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
            startActivity(intent);
        }
    }

    private String getUsernameText() {
        return username.getText().toString();
    }

    private String getPasswordText() {
        return password.getText().toString();
    }


}
