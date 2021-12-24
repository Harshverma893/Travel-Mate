package com.example.travelmate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.travelmate.databinding.ActivitySecond2Binding;
import com.iammert.library.readablebottombar.ReadableBottomBar;

public class SecondActivity extends AppCompatActivity {

    ActivitySecond2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);



        binding = ActivitySecond2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.content, new Home());
        transaction.commit();

        binding.readableBottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (i){
                    case 0:
                        transaction.replace(R.id.content, new Home());
                        break;
                    case 1:
                        transaction.replace(R.id.content, new SecondFragment());
                        break;

                    case 2:
                        transaction.replace(R.id.content, new ThirdFragment());
                        break;

                    case 3:
                        transaction.replace(R.id.content, new FourthFragment());
                        break;

                    case 4:
                        transaction.replace(R.id.content, new FifthFragment());
                        break;

            }
                transaction.commit();
            }
        });


    }
}