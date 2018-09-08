package pro.sau.potriders.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pro.sau.potriders.R;

public class SplashScreen extends AppCompatActivity {
    Button splash_signup, splash_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        splash_signin = findViewById(R.id.splash_signin);
        splash_signup = findViewById(R.id.splash_signup);
        init();
    }

    private void init() {
        splash_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashScreen.this, SignUp.class);
                startActivity(intent);
            }
        });
        splash_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashScreen.this,LogIn.class);
                startActivity(intent);
            }
        });

    }
}
