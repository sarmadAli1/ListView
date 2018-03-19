package com.example.sarmad.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lst;
    String[] fruitname={"Mango","Apple","Peach","Kiwi","Bannana"};
    String[] desc ={"This is Mango", "This is Apple", "This is Peach"," This is Kiwi" ," This is Bannana"};
Integer[] imgid={R.drawable.mango, R.drawable.apple, R.drawable.peach, R.drawable.kiwi, R.drawable.bannana };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         lst = (ListView) findViewById(R.id.listView);
         Customlistview customlistview = new Customlistview(this,fruitname,desc,imgid);
         lst.setAdapter(customlistview);




    }
}
