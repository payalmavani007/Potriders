package pro.sau.potriders.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import pro.sau.potriders.R;

public class ApplyCode extends AppCompatActivity {
Button btn_apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_code);
        btn_apply = findViewById(R.id.apply);
        btn_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApplyCode.this,PlaceOrder.class);
                startActivity(intent);
            }
        });
    }
}
