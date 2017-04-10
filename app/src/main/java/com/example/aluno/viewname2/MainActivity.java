package com.example.aluno.viewname2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEdit;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        // Main Method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdit = (EditText)findViewById(R.id.editText);
        mButton = (Button)findViewById(R.id.button);

        mButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button:
                Intent intent_show = new Intent(MainActivity.this, ShowName.class);
                String name = mEdit.getText().toString();
                intent_show.putExtra("EXTRA_NAME", name);
                startActivity(intent_show);
                break;
        }

    }
}
