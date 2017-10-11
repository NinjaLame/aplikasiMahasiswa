package com.bayua.aplikasimahasiswa;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by D2A on 10/5/2017.
 */

public class myOwnAdapter extends RecyclerView.Adapter<myOwnAdapter.myOwnHolder> {
    String data1[],data2[];
    int img[];
    Context ctx;
    public myOwnAdapter(Context ct, String s1[],String s2[], int i1[]){
        data1 = s1;
        data2 = s2;
        img = i1;
        ctx=ct;
    }
    @Override
    public myOwnHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myInflater = LayoutInflater.from(ctx);
        View myOwnView = myInflater.inflate(R.layout.my_row,parent,false);
        return new myOwnHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(myOwnHolder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.myImage.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class myOwnHolder extends RecyclerView.ViewHolder{

        TextView t1,t2;
        ImageView myImage;
        public myOwnHolder(View itemView) {
            super(itemView);
            t1 = (TextView)itemView.findViewById(R.id.Nama);
            t2 = (TextView) itemView.findViewById(R.id.IPK);
            myImage = (ImageView)itemView.findViewById(R.id.myImage);
        }
    }
}
