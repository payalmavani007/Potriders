package pro.sau.potriders.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import pro.sau.potriders.Activity.PlaceOrder;
import pro.sau.potriders.R;

/**
 * A simple {@link Fragment} subclass.
 */

public class DescriptionFragment extends Fragment {
Button btn_addtocart;
Spinner weed;
ArrayAdapter<CharSequence> adapter;

    public DescriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_description, container, false);
        weed = view.findViewById(R.id.weed_weight);
        adapter = ArrayAdapter.createFromResource(getActivity(),R.array.Weed,R.layout.spinner_textview);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weed.setAdapter(adapter);
        weed.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btn_addtocart = view.findViewById(R.id.addtocart);
        btn_addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), PlaceOrder.class);
                startActivity(i);
            }
        });
        return  view;
    }

}
