package pro.sau.potriders.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import pro.sau.potriders.Adapters.CurrencyAdapter;
import pro.sau.potriders.Adapters.LikeItemPagerAdapter;
import pro.sau.potriders.R;

public class ShippingFragment extends Fragment {
RecyclerView recycler_currency_type;
Button btn_next_to_shipping;
   /* Fragment fragment = null;
    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_shipping, container, false);
        recycler_currency_type = view.findViewById(R.id.currency_type);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recycler_currency_type.setLayoutManager(linearLayoutManager);
        CurrencyAdapter currencyAdapter = new CurrencyAdapter(getContext());
        recycler_currency_type.setAdapter(currencyAdapter);
        btn_next_to_shipping= view.findViewById(R.id.next_to_shipping);
        btn_next_to_shipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment= new ConfirmFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragment); // fragment container id in first parameter is the  container(Main layout id) of Activity
                transaction.commit();
               /* fragment = new PaymentFragment();
                fragmentTransaction.replace(R.id.fragment_container, fragment).commit();*/
            }
        });
        return  view;
    }

}
