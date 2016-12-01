package look.lookup.com.lookup.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import look.lookup.com.lookup.Model.Model;
import look.lookup.com.lookup.R;

/**
 * Created by emb-ankitom on 12/1/2016.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {
    private final List<Model.DataEntity.BusinessesEntity> data;
    private final Context context;

    public CategoryAdapter(List<Model.DataEntity.BusinessesEntity> businessesEntities, Context context) {
        this.data = businessesEntities;
        this.context = context;
    }

    @Override
    public CategoryAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_cell, parent, false);

        return new CategoryAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CategoryAdapter.MyViewHolder holder, int position) {

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


    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView categoryName;

        public MyViewHolder(View itemView) {
            super(itemView);


            imageView = (ImageView) itemView.findViewById(R.id.img_category);
            categoryName = (TextView) itemView.findViewById(R.id.txt_category_name);

        }
    }
}
