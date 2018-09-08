package pro.sau.potriders.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import pro.sau.potriders.R;

public class PaymentTypeAdapter extends RecyclerView.Adapter<PaymentTypeAdapter.ViewHolder> {
    
    Context context;
    int selectedPosition=-1;

    public PaymentTypeAdapter(Context context) {

        this.context = context;
    }
    @Override
    public PaymentTypeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.paymenttype, parent, false);
        return new PaymentTypeAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PaymentTypeAdapter.ViewHolder holder, final int position) {
        if(selectedPosition==position){
            holder.itemView.setBackgroundColor(Color.parseColor("#379F00"));
        holder.payment_text.setTextColor(Color.parseColor("#ffffff"));}
        else {

            holder.itemView.setBackgroundColor(Color.parseColor("#EDEDED"));
            holder.payment_text.setTextColor(Color.parseColor("#000000"));
        }
        holder.layout_payment_type.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        selectedPosition=position;
        notifyDataSetChanged();

    }
});

    }

    @Override
    public int getItemCount() {
        return 5 ;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout layout_payment_type;
        TextView payment_text;

        public ViewHolder(View itemView) {
            super(itemView);
            layout_payment_type = itemView.findViewById(R.id.layout_payment_type);
            payment_text = itemView.findViewById(R.id.payment_text);

        }
    }
}
