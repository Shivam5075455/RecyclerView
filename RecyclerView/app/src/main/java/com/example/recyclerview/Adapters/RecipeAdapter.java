package com.example.recyclerview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Models.RecipeModel;
import com.example.recyclerview.R;

import java.util.ArrayList;

// to set the functionality of the viewHolder for this class extend base class with its type(Adapter class) and RecyclerView and set
// viewHolder
public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.viewHolder>{

    //    creates Array with user define data type
    ArrayList<RecipeModel> list; // Data Type = RecipeAdapter, Variable Name = list
    //    creates context
    Context context; // variable name = context
    //    creates constructor of above variables
    public RecipeAdapter(ArrayList<RecipeModel> list, Context context){
        this.list = list;
        this.context = context;
    }

    //    function of onCreateViewHolder
    //    isme sirf jo Layout humne bnaya hai usko inflate karwa denge
    //    Inflate the layout which is made by us
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    //        set or inflae the layout using View
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_recipe, parent, false);
        return new viewHolder(view);
    }

    //    Function of onBindViewHOlder
    //    Set the values of data types(image and text). In this Method, we are set the data type
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        RecipeModel model = list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());
    }

    //    It's function is simply to count
    //    So return the size of Array list
    @Override
    public int getItemCount() {
        return list.size();
    }
    //    creates Methods of this class


    // creates view type of class
    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

    //    create constructor of above class
    public viewHolder(@NonNull View itemView){
            super(itemView); // default constructor
    //    find ID using View
        imageView = itemView.findViewById(R.id.imgFood);
        textView = itemView.findViewById(R.id.tvFood);
        }
    }
}
