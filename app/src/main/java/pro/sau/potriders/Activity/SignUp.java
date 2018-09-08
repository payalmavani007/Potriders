package pro.sau.potriders.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pro.sau.potriders.R;

public class SignUp extends AppCompatActivity {

    EditText edt_fname,edt_lname,edt_email,edt_mobile,edt_password;
    Button btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        edt_email = findViewById(R.id.edt_email);
        edt_fname = findViewById(R.id.edt_fname);
        edt_lname = findViewById(R.id.edt_lname);
        edt_mobile = findViewById(R.id.edt_mobile);
        edt_password = findViewById(R.id.edt_password);
        btn_signup = findViewById(R.id.signup);
        init();
    }

    private void init() {
    btn_signup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(SignUp.this, LogIn.class);
            startActivity(intent);
           /* if (edt_fname.getText().toString().equals("")){
                edt_fname.setError("Enter First Name.");
            }
            else if (edt_lname.getText().toString().equals("")){
                edt_lname.setError("Enter Last Name.");
            }

            else if (edt_email.getText().toString().equals("")){
                edt_email.setError("Enter Email.");
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(edt_email.getText().toString()).matches()) {
                edt_email.setError("Invalid Pattern");
            }

            else if (edt_mobile.getText().toString().equals("")){
                edt_mobile.setError("Enter Mobile.");
            }

            else if (edt_password.getText().toString().equals("")){
                edt_password.setError("Enter Password.");
            }
            else {

            }*/
        }
    });
    }
}
