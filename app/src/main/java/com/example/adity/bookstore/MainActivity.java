package com.example.adity.bookstore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("INDIAN POLITY","Categorie Book","Description book",R.drawable.aa));
        lstBook.add(new Book("Just Friends","Categorie Book","Description book",R.drawable.bb));
        lstBook.add(new Book("Top Publications","Categorie Book","Description book",R.drawable.cc));
        lstBook.add(new Book("1100 Words","Categorie Book","Description book",R.drawable.dd));
        lstBook.add(new Book("India","Categorie Book","Description book",R.drawable.ee));
        lstBook.add(new Book("The Five Dollar Smile","Categorie Book","Description book",R.drawable.ff));
        lstBook.add(new Book("The Great Indian Novel","Categorie Book","Description book",R.drawable.gg));
        lstBook.add(new Book("History","Categorie Book","Description book",R.drawable.hh));
        lstBook.add(new Book("Ashoka","Categorie Book","Description book",R.drawable.ii));
        lstBook.add(new Book("Guide To India","Categorie Book","Description book",R.drawable.jj));
        lstBook.add(new Book("The Times Of My Life","Categorie Book","Description book",R.drawable.kk));
        lstBook.add(new Book("Brihat Parasara Hora Sastra","Categorie Book","Description book",R.drawable.ll));
        lstBook.add(new Book("Raavan","Categorie Book","Description book",R.drawable.mm));
        lstBook.add(new Book("Think India","Categorie Book","Description book",R.drawable.nn));
        lstBook.add(new Book("Top Indian Children Picture Books","Categorie Book","Description book",R.drawable.oo));
        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this, 3));
        myrv.setAdapter(myAdapter);


    }
}
