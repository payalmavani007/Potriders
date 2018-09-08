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
import pro.sau.potriders.Adapters.PaymentTypeAdapter;
import pro.sau.potriders.R;

/**
 * A simple {@link Fragment} subclass.
 */

public class ConfirmFragment extends Fragment {
Button btn_next_to_thankyou;
RecyclerView recycler_payment_type;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_confirm, container, false);
        recycler_payment_type = view.findViewById(R.id.recycler_payment_type);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recycler_payment_type.setLayoutManager(linearLayoutManager);
        PaymentTypeAdapter paymentTypeAdapter = new PaymentTypeAdapter(getContext());
        recycler_payment_type.setAdapter(paymentTypeAdapter);


        btn_next_to_thankyou = view.findViewById(R.id.next_to_thankyou);
        btn_next_to_thankyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment= new ThankYouFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragment); // fragment container id in first parameter is the  container(Main layout id) of Activity
                transaction.commit();
            }
        });
        return  view;
    }

}
