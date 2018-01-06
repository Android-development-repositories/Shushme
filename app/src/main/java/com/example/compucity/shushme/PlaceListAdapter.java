package com.example.compucity.shushme;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by CompuCity on 1/7/2018.
 */

public class PlaceListAdapter extends RecyclerView.Adapter<PlaceListAdapter.PlaceViewHolder>{
    private Context mContext;
    PlaceListAdapter(Context context){
        mContext=context;
    }
    @Override
    public PlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item_place_card, parent);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlaceViewHolder holder, int position) {
        
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class PlaceViewHolder extends RecyclerView.ViewHolder{
        TextView nameTextView;
        TextView addressTextView;
        public PlaceViewHolder(View itemView) {
            super(itemView);
            nameTextView=(TextView)itemView.findViewById(R.id.name_text_view);
            addressTextView=(TextView)itemView.findViewById(R.id.address_text_view);
        }
    }
}
