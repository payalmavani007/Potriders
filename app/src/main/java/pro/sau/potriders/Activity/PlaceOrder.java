package pro.sau.potriders.Activity;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import pro.sau.potriders.Adapters.LikeItemPagerAdapter;
import pro.sau.potriders.R;

public class PlaceOrder extends AppCompatActivity {

 RecyclerView likeitemrecycler;
 LinearLayout promocode_layout;
 LinearLayout mapLayout;
 Button btn_place_order;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);
        btn_place_order = findViewById(R.id.place_order);
        likeitemrecycler = findViewById(R.id.likeitemrecycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        likeitemrecycler.setLayoutManager(linearLayoutManager);
        LikeItemPagerAdapter likeItemPagerAdapter=new LikeItemPagerAdapter(getApplicationContext());
        likeitemrecycler.setAdapter(likeItemPagerAdapter);
        mapLayout=(LinearLayout)findViewById(R.id.map_layout);
        promocode_layout = findViewById(R.id.promolayout);
        promocode_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceOrder.this,ApplyCode.class);
                startActivity(intent);
            }
        });
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.map_layout, new MapsActivity() );
        transaction.commit();
        init();
    }

    private void init() {
        btn_place_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(PlaceOrder.this,CheckOutActivity.class);
                startActivity(intent);
            }
        });
    }


}
