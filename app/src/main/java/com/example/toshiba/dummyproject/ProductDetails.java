package com.example.toshiba.dummyproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetails extends AppCompatActivity {

    ImageView pdimage;
    TextView pdtext;
    TextView pdtext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        pdimage = (ImageView) findViewById(R.id.pdimage);
        pdtext = (TextView) findViewById(R.id.pdtView);
        pdtext1 = (TextView) findViewById(R.id.pdtView1);


        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            pdimage.setImageResource(mBundle.getInt("productImage"));
            String message = mBundle.getString("ProductName");
            String message1 = mBundle.getString("ProductPrice");
            pdtext.setText(message);
            pdtext1.setText(message1);
        }
    }
}