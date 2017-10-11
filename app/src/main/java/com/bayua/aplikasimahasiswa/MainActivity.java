package com.bayua.aplikasimahasiswa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    String s1[],s2[];
    int imgResources []= {R.drawable.cat,R.drawable.cool_cat,R.drawable.cat,R.drawable.cool_cat,R.drawable.cat,R.drawable.cool_cat};

    myOwnAdapter ad;
    LinearLayoutManager ly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RecyclerView)findViewById(R.id.myRecycler);
        s1 = getResources().getStringArray(R.array.nama_mahasiswa);
        s2 = getResources().getStringArray(R.array.IPK);

        ad = new myOwnAdapter(this,s1,s2,imgResources);

        r1.setAdapter(ad);
        ly= new LinearLayoutManager(this);
        r1.setLayoutManager(ly);

    }

}
