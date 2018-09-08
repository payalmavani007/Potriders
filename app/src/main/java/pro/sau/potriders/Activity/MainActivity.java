package pro.sau.potriders.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import pro.sau.potriders.Adapters.RestaurantListAdapter;
import pro.sau.potriders.R;

public class MainActivity extends AppCompatActivity {
    RecyclerView restaurent_list_recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restaurent_list_recyclerview = findViewById(R.id.restaurent_list_recyclerview);
        restaurent_list_recyclerview.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        RestaurantListAdapter restaurantListAdapter=new RestaurantListAdapter(getApplicationContext());
        restaurent_list_recyclerview.setAdapter(restaurantListAdapter);

    }
}
