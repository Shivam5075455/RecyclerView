package com.example.multirecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.multirecyclerview.Adapters.AnimalsAdapters;
import com.example.multirecyclerview.Adapters.FruitsAdapters;
import com.example.multirecyclerview.Models.AnimalsModels;
import com.example.multirecyclerview.Models.FruitsModels;
import com.example.multirecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GestureDetector gestureDetector;
    private AdapterView.OnItemClickListener clickListener;
    RecyclerView rvAnimals, rvFruits;
    ImageView imgAnimals;
    TextView tvAnimals;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        rvAnimals = findViewById(R.id.rvAnimals);
        rvFruits = findViewById(R.id.rvFruits);

//        imgAnimals = findViewById(R.id.imgAnimals);



        ArrayList<AnimalsModels> list = new ArrayList<>(); // list for Animals
        ArrayList<FruitsModels> listFruit = new ArrayList<>(); // list for Fruits
//        add Animals data into list of Array
        list.add(new AnimalsModels(R.drawable.bear, "Bear"));
        list.add(new AnimalsModels(R.drawable.chameleon, "Chameleon"));
        list.add(new AnimalsModels(R.drawable.cutedog, "CuteDog"));
        list.add(new AnimalsModels(R.drawable.deer, "Deer"));
        list.add(new AnimalsModels(R.drawable.dogandcat, "Dog And Cat"));
        list.add(new AnimalsModels(R.drawable.dogs, "Dogs"));
        list.add(new AnimalsModels(R.drawable.elephant, "Elephant"));
        list.add(new AnimalsModels(R.drawable.lion, "Lion"));
        list.add(new AnimalsModels(R.drawable.peacock, "Peacock"));
        list.add(new AnimalsModels(R.drawable.tiger, "Tiger"));
        list.add(new AnimalsModels(R.drawable.zebrza, "Zebra"));

//        Add Fruits data into list of array
        listFruit.add(new FruitsModels(R.drawable.apple, "Apple"));

//  set Animals data on recycler view
        AnimalsAdapters animalsAdapters = new AnimalsAdapters(list, this);
        rvAnimals.setAdapter(animalsAdapters);

//        Set Fruits data on recycler view
        FruitsAdapters fruitsAdapters = new FruitsAdapters(listFruit, this);
        rvFruits.setAdapter(fruitsAdapters);

// set layout for Animals: 1. Linear Layout Manager 2.Grid Layout Manager   3.Staggered Layout Manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvAnimals.setLayoutManager(linearLayoutManager);

//        set Layout for Fruits
//        LinearLayoutManager linearLayoutManagerFruits = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        rvFruits.setLayoutManager(linearLayoutManager);


// set click listener on each item of a recycler view

        rvAnimals.addOnItemTouchListener(new RecyclerTouchListener(this, rvAnimals, new RecyclerTouchListener.OnItemClickListener() {
            @Override
            public void onClick(View view, int position) {
                // Handle item click here.
                /*
                switch (position){
                    case 0:
                        view.findViewById(R.id.imgAnimals).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "Image 1 clicked", Toast.LENGTH_SHORT).show();

                            }
                        });
                        break;
                        case 1:
                        imgAnimals.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "Image 2 clicked", Toast.LENGTH_SHORT).show();
                            }
                        });
                        break;
                    default:
                        break;
                }

                 */
            }

            @Override
            public void onLongClick(View view, int position) {
                // Handle item long click here.
            }
        }));






        /*
        rvAnimals.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {


                return false;
            }

            @Override
            public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });
*/





//        set status bar color
        Window window = this.getWindow();
        window.setStatusBarColor(getColor(R.color.darkblue));
    }


}