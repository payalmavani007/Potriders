package pro.sau.potriders.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import pro.sau.potriders.R;

public class LikeItemPagerAdapter extends RecyclerView.Adapter<LikeItemPagerAdapter.ViewHolder> {

 Context context;

    public LikeItemPagerAdapter(Context context) {

        this.context = context;
    }
    @Override
    public LikeItemPagerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.likeimageitem, parent, false);
        return new LikeItemPagerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LikeItemPagerAdapter.ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 5 ;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name,price;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.likeditem);
             name = itemView.findViewById(R.id.likeitemname);
             price = itemView.findViewById(R.id.likeitemprice);
        }
    }
}


