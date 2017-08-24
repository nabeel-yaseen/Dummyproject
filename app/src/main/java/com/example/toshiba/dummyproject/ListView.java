package com.example.toshiba.dummyproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import static android.R.id.list;

public class ListView extends AppCompatActivity {


    android.widget.ListView list;
    String[] pname = {"Allied Bank Limited", "Habib Bank Limited", "Bank Alfalah Limited", "Faisal Bank Limited", "Meezan Bank Limited", "Muslim comercial Bank","United Bank Limited","Standard Chartered Bank","Soneri Bank Limited","The Bank of Punjab", };
    String[] pprice = {"Mc Donald's 10%,Burger King 15%,SubWay 20%", "Cliclx 10%,careem 10%,", "Chugtai lab 15%,shokat khanam 20%", "PC 5%,Avari 20%,cinipax 20%", "sozo 10%,joyLand 20%", "Uber 10%,pizzaHut 15%,KFC 20%","Uber 10%,pizzaHut 15%,KFC 20%","Uber 10%,pizzaHut 15%,KFC 20%","Uber 10%,pizzaHut 15%,KFC 20%","Uber 10%,pizzaHut 15%,KFC 20%",};
    int[] pimage = {R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        list = (android.widget.ListView) findViewById(R.id.productlist);

        MyAdapter myAdapter = new MyAdapter(this, pname/*, pprice*/, pimage);
        list.setAdapter(myAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Intent mIntent = new Intent(ListView.this, ProductDetails.class);
                mIntent.putExtra("ProductImage", pimage[i]);
                mIntent.putExtra("ProductName", pname[i]);
                mIntent.putExtra("ProductPrice", pprice[i]);
                // i is our postition
                startActivity(mIntent);
            }
        });
    }


}