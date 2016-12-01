package look.lookup.com.lookup.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import look.lookup.com.lookup.Model.Model;
import look.lookup.com.lookup.R;

/**
 * Created by emb-ankitom on 12/1/2016.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private final List<Model.DataEntity.BusinessesEntity> data;
    private final Context context;

    public RecyclerViewAdapter(List<Model.DataEntity.BusinessesEntity> businessesEntities, Context context) {
        this.data = businessesEntities;
        this.context = context;
    }

    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.nearby_cell, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.MyViewHolder holder, int position) {

        Model.DataEntity.BusinessesEntity businessesEntity = data.get(position);

        String profileImage = businessesEntity.getProfileImage();
        if (profileImage != null) {
            Picasso.with(context)
                    .load(profileImage)
                    .fit().centerCrop()
                    .into(holder.imageView);
        }
        if (businessesEntity.getName() != null)
            holder.categoryName.setText(businessesEntity.getName());
        if (businessesEntity.getDescription() != null)
            holder.categoryLocation.setText(businessesEntity.getDescription());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView categoryName, categoryLocation;

        public MyViewHolder(View itemView) {
            super(itemView);


            imageView = (ImageView) itemView.findViewById(R.id.img_category);
            categoryName = (TextView) itemView.findViewById(R.id.txt_category_name);
            categoryLocation = (TextView) itemView.findViewById(R.id.txt_category_location);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Model.DataEntity.BusinessesEntity businessesEntity = data.get(getAdapterPosition());
                    Toast.makeText(context, "Name is : " + businessesEntity.getName(), Toast.LENGTH_LONG).show();

                }
            });


        }
    }
}
