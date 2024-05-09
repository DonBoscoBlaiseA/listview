package com.example.imagelistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    ListView simpleList;
    String countryList[] = {"India", "Japan", "Germany", "Russia", "America", "France"};
    int flags[] = { R.drawable.india, R.drawable.japan, R.drawable.germany, R.drawable.russia, R.drawable.america, R.drawable.france };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
    }
}