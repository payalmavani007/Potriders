package pro.sau.potriders.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import pro.sau.potriders.R;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.ViewHolder>  {

    Context context;

    public CurrencyAdapter(Context context) {

        this.context = context;
    }
    @Override
    public CurrencyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.currencytype, parent, false);
        return new CurrencyAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CurrencyAdapter.ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 5 ;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);


        }
    }
}
