package com.example.android2.collections;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by android2 on 19.09.2016.
 */
public class AdapterRecyclerView extends RecyclerView.Adapter<Item_View_Holder>
{

    private Context mContext;
    private ArrayList listperson;

    @Override
    public Item_View_Holder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new Item_View_Holder(view);
    }

    public AdapterRecyclerView(ArrayList listperson, Context mContext)
    {
        this.listperson = listperson;
        this.mContext = mContext;
    }

    @Override
    public void onBindViewHolder(Item_View_Holder holder, int position)
    {
        Person person=(Person)listperson.get(position);

        ImageView imageview=holder.getPhoto();
        Picasso .with(mContext)
                .load(person.getImagelink())
                .into(imageview);

        holder.getfName() .setText(person.getFname());
        holder.getlName().setText(person.getLname());
     }

    @Override
    public int getItemCount()
    {
        return listperson.size();
    }
}
