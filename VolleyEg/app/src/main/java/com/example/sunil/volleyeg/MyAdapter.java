package com.example.sunil.volleyeg;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

/**
 * Created by Sunil on 2/5/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.GitHubViewholder>{


    private Context context;
    private User[] data;

    public MyAdapter(Context context,User[] data){
        this.context=context;
        this.data=data;
    }

    @Override
    public GitHubViewholder onCreateViewHolder(ViewGroup vg, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(vg.getContext());
        View view=inflater.inflate(R.layout.user_item,vg,false);
        return new GitHubViewholder(view);
    }

    @Override
    public void onBindViewHolder(GitHubViewholder holder, int position) {
        final User user=data[position];
        holder.Username.setText(user.getLoginname());
        Glide.with(holder.Userimg.getContext()).load(user.getUserimage()).into(holder.Userimg);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "ID:"+user.getIdnumber()+" "+user.getLoginname()+" was clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class GitHubViewholder extends RecyclerView.ViewHolder {

        ImageView Userimg;
        TextView Username;

        public GitHubViewholder(View itemView) {
            super(itemView);
            Userimg=itemView.findViewById(R.id.image_view);
            Username=itemView.findViewById(R.id.text_user);

        }
    }

}
