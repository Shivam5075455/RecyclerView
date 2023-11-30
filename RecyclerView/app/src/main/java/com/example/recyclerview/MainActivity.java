package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.recyclerview.Adapters.RecipeAdapter;
import com.example.recyclerview.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        find recycler view
        recyclerView = findViewById(R.id.recyclerView);
//        creates array using RecipeModel class
        ArrayList<RecipeModel> list = new ArrayList<>();
//        add data(image and text) in the Array list
        list.add(new RecipeModel(R.drawable.chaap, "Chaap"));
        list.add(new RecipeModel(R.drawable.dryfruit, "Dry Fruit"));
        list.add(new RecipeModel(R.drawable.fish, "Fish"));
        list.add(new RecipeModel(R.drawable.frychillipotato,"Fry Chilli Potato"));
        list.add(new RecipeModel(R.drawable.noodles, "Noodles"));
        list.add(new RecipeModel(R.drawable.pizza,"Pizza"));
        list.add(new RecipeModel(R.drawable.snacks,"Snacks"));
        list.add(new RecipeModel(R.drawable.strawberry,"Strawberry"));
        list.add(new RecipeModel(R.drawable.tomatosoup,"Tomato Soup"));
        list.add(new RecipeModel(R.drawable.vegetables, "Vegetable Soup"));
        list.add(new RecipeModel(R.drawable.apple, "Apple"));
        list.add(new RecipeModel(R.drawable.bluefood, "Blue Food"));
        list.add(new RecipeModel(R.drawable.burgertruck, "Burger Truck"));
        list.add(new RecipeModel(R.drawable.chicken, "Chicken"));
        list.add(new RecipeModel(R.drawable.chillie, "Chillie"));
        list.add(new RecipeModel(R.drawable.lemon, "Lemon"));
        list.add(new RecipeModel(R.drawable.pasta, "Pasta"));
        list.add(new RecipeModel(R.drawable.popcorn, "Popcorn"));


//        set these data to recyclerview using RecipeAdapter class
        RecipeAdapter adapter = new RecipeAdapter(list, this);
        recyclerView.setAdapter(adapter);
//        set layout for Recycler View
//        Ther are three types of Layout in RecyclerView:- 1.Linear Layout Manager 2.Grid Layout Manager 3. Staggered Layout Manager
//        Set Linear Layout Manager. Linear Layout Manager contains two parameters: context and scroll type(by default Vertical)
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);

//        set linear layout with Horizontal Scrolling. Reverse Layout -> we can scroll Right to Left if true or Left to Right if false
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        recyclerView.setLayoutManager(linearLayoutManager);

//        Grid Layout Manager
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
//        Set Staggered Layout
//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, GridLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        if(Build.VERSION.SDK_INT >= 9){
        Window window = this.getWindow();
//        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getColor(R.color.status_bar));

        }
    }
}