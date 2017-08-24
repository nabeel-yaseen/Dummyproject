package com.example.toshiba.dummyproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Toshiba on 11-Aug-17.
 */

public class MyAdapter extends ArrayAdapter<String> {
    String [] names;
  //  String [] price;
    int [] image;
    Context mcontext;
    public MyAdapter(@NonNull Context context, String [] name/*, String [] price*/, int [] images) {
        super(context, R.layout.activity_list_view);
        this.names=name;
   //     this.price=price;
        this.image=images;
        this.mcontext=context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mviewholder ;
        View view = convertView;
        TextView textname;
        ImageView mimage;
        if (convertView == null) {

             view = LayoutInflater.from(getContext()).inflate(R.layout.product_list, null);
             mimage = (ImageView) view.findViewById(R.id.pimage);
             textname = (TextView) view.findViewById(R.id.pname);
           // mviewholder. textprice = (TextView) convertView.findViewById(R.id.pprice);
            mviewholder = new ViewHolder(mimage,textname);
            view.setTag(mviewholder);
        }

            mviewholder = (ViewHolder)view.getTag();
        mviewholder.mimage.setImageResource(image[position]);
        mviewholder.textname.setText(names[position]);
      //  mviewholder.textprice.setText(price[position]);

        return view;
    }
    static class ViewHolder{
        ImageView mimage;
        TextView textname;

        public ViewHolder(ImageView mimage, TextView textname) {
            this.mimage = mimage;
            this.textname = textname;
        }
        //  TextView textprice;
    }

}
