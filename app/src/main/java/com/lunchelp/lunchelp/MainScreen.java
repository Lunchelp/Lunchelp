package com.lunchelp.lunchelp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;


public class MainScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        ListView home_list = (ListView) findViewById(R.id.home_list);
        ArrayList<String> test_array = new ArrayList<>();
        test_array.add("HELLO");
        test_array.add("GOODBYE");
        for(int i=0;i<20;i++){
            test_array.add(""+i);
        }
        ArrayAdapter<String> test_adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,test_array);
        home_list.setAdapter(test_adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void add_group(View view){
        Intent intent = new Intent(this,AddGroupActivity.class);
        startActivity(intent);
    }
}
