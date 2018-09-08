package pro.sau.potriders.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import pro.sau.potriders.R;


public class PaymentFragment extends Fragment {
Button btn_next_to_confirm;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_payment, container, false);
            btn_next_to_confirm = view.findViewById(R.id.next_to_confirm);
            btn_next_to_confirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Fragment fragment= new ConfirmFragment();
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragment_container, fragment); // fragment container id in first parameter is the  container(Main layout id) of Activity
                    transaction.commit();
                }
            });
        return  view;
    }

}
