package pro.sau.potriders.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import pro.sau.potriders.Activity.ListPreview;
import pro.sau.potriders.R;

public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.ViewHolder>  {
    Context context;

    public RestaurantListAdapter(Context context) {

        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.restaurantlistitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    holder.layout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(),ListPreview.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);

        }
    });

    }

    @Override
    public int getItemCount() {
        return 10 ;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
    LinearLayout layout;

        public ViewHolder(View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.layout);

        }
    }
}


