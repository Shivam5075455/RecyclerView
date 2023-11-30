package com.example.multirecyclerview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multirecyclerview.MainActivity;
import com.example.multirecyclerview.Models.AnimalsModels;
import com.example.multirecyclerview.R;

import java.util.ArrayList;

public class AnimalsAdapters extends RecyclerView.Adapter<AnimalsAdapters.viewHolder>{

    //  creates array with user define data type
    ArrayList<AnimalsModels> list;
    Context context;
//    creates constructor of aboce two variables: list and context
    public AnimalsAdapters(ArrayList<AnimalsModels> list, Context context){
        this.list = list;
        this.context = context;
    }


// creates three methods: 1.onCreateViewHolder  2. onBindViewHolder 3. getItemCount

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.animals_layout, parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int position){
        AnimalsModels model = list.get(position);
        viewHolder.imageView.setImageResource(model.getPic());
        viewHolder.textView.setText(model.getText());
/*
        switch (position){

            case 0:    
                viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Toast.makeText(context, "Image 1", Toast.LENGTH_SHORT).show();
                }
            });


                viewHolder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Textview 1", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            default:
                break;

        }

 */
    }
    @Override
    public int getItemCount(){
        return list.size();
    }

// creates view type of class. Kesa view chaye uske liye viewHolder class ko create karenge
    public class viewHolder extends RecyclerView.ViewHolder{

//        Creates variable for pic and text
    ImageView imageView;
    TextView textView;
        public viewHolder(@NonNull View itemView){
            super(itemView);

            imageView = itemView.findViewById(R.id.imgAnimals);
            textView = itemView.findViewById(R.id.tvAnimals);
        }
    }
}
