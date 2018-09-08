package pro.sau.potriders.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import pro.sau.potriders.R;

public class ForgotPassword extends AppCompatActivity {
    EditText edt_email;
    Button btn_send;
    TextView txt_forgor_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        edt_email = findViewById(R.id.edt_forgot_email);
        btn_send = findViewById(R.id.send);
        txt_forgor_signup = findViewById(R.id.txt_forgor_signup);
        init();
    }

    private void init() {
    btn_send.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(ForgotPassword.this, ForgotEmailLink.class);
            startActivity(intent);
           /* if (edt_email.getText().toString().equals("")){
                edt_email.setError("Invalid Email.");
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(edt_email.getText().toString()).matches()) {
                edt_email.setError("Invalid Pattern");
            }
            else {

            }*/
        }
    });
        txt_forgor_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForgotPassword.this,SignUp.class);
                startActivity(intent);
            }
        });
    }
}
