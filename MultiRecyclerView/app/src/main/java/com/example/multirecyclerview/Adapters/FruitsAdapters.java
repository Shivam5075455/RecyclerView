package com.example.multirecyclerview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multirecyclerview.Models.FruitsModels;
import com.example.multirecyclerview.R;

import java.util.ArrayList;

public class FruitsAdapters extends RecyclerView.Adapter<FruitsAdapters.viewHolder>{

//    creates variable to store image and text
//    creates Array for image
    ArrayList<FruitsModels> listFruits;
    Context context;
//    creates constructor of above variables
    public FruitsAdapters(ArrayList<FruitsModels> listFruits, Context context){
        this.listFruits = listFruits;
        this.context = context;
    }

//    creates method for get and set layout
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.fruits_layout, parent, false);
        return new viewHolder(view);

    }
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position){
        FruitsModels models = listFruits.get(position);
        holder.imageView1.setImageResource(models.getPicFruits());
        holder.textView1.setText(models.getTextFruits());
    }
    @Override
    public int getItemCount(){
        return listFruits.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView imageView1;
        TextView textView1;
        public viewHolder (@NonNull View itemView){
            super(itemView);

            imageView1 = itemView.findViewById(R.id.imgAnimals);
            textView1 = itemView.findViewById(R.id.tvFruit);
        }
    }

}
