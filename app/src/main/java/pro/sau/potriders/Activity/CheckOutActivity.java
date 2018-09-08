package pro.sau.potriders.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import pro.sau.potriders.Fragments.ShippingFragment;
import pro.sau.potriders.R;

public class CheckOutActivity extends AppCompatActivity  {

    LinearLayout layout_shipping,layout_confirm,layout_payment;
    Fragment fragment = null;
    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        layout_confirm = findViewById(R.id.layout_confirm);
        layout_payment = findViewById(R.id.layout_payment);
        layout_shipping = findViewById(R.id.layout_shipping);
        fragment = new ShippingFragment();
        fragmentTransaction.replace(R.id.fragment_container, fragment).commit();

    }

}
