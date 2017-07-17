package com.example.dong.circlemenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {
    CircleMenu circleMenu;
    String arrayName[]={"Camera","Gallery","Call","Manage","MyLocation"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleMenu= (CircleMenu) findViewById(R.id.circleMenu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.ic_add,R.drawable.ic_remove)
                .addSubMenu(Color.parseColor("#258CFF"),android.R.drawable.ic_menu_camera)
                .addSubMenu(Color.parseColor("#6d4c41"),android.R.drawable.ic_menu_gallery)
                .addSubMenu(Color.parseColor("#ff0000"),android.R.drawable.ic_menu_call)
                .addSubMenu(Color.parseColor("#03a9f4"),android.R.drawable.ic_menu_manage)
                .addSubMenu(Color.parseColor("#1a237e"),android.R.drawable.ic_menu_mylocation)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int i) {
                        Toast.makeText(MainActivity.this,"you selected: "+ arrayName[i],Toast.LENGTH_SHORT).show();

                    }
                });
    }
}
