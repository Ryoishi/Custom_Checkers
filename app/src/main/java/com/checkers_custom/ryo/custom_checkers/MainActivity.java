package com.checkers_custom.ryo.custom_checkers;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {
    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerList = (ListView) findViewById(R.id.sidemenu);
        String[] menuArray = {"Single Player", "Multi Player", "About", "Help", "Donate"};
        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, menuArray);
        mDrawerList.setAdapter(mAdapter);
    }


//        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                    Toast.makeText(MainActivity.this, "Coming Soon!", Toast.LENGTH_SHORT).show();
//                }
//        }

    }

