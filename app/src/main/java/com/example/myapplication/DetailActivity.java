package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tenkh, tenth,dactinh,maula,congdungg,duoctinhh;
    ImageView anh;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tenkh = findViewById(R.id.textView);
        tenth = findViewById(R.id.textView2);
        dactinh= findViewById(R.id.textView5);
        maula= findViewById(R.id.textView6);
        congdungg=findViewById(R.id.textView7);
        duoctinhh=findViewById(R.id.textView8);
        toolbar = findViewById(R.id.toolbar);
        anh = findViewById(R.id.imageView);
        getToolBar();
        Intent intent =  getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        ThuocNam traicay = (ThuocNam) bundle.getSerializable("goi");
        String name1 = traicay.getTenKhoaHoc();
        String mota1 = traicay.getTenThuong();
        String hinhanh1 = traicay.getHinh();
        anh.setImageBitmap(getBitmap(hinhanh1));
        tenth.setText(mota1);
        tenkh.setText(name1);
        dactinh.setText(traicay.getDacTinh());
        maula.setText(traicay.getMauLa());
        congdungg.setText(traicay.getCongdung());;
        duoctinhh.setText(traicay.getDuoTinh());
    }

    private void getToolBar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Product detail");
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    private Bitmap getBitmap(String encodeImage){
        byte[] bytes = Base64.decode(encodeImage,Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(bytes,0,bytes.length);
    }
}