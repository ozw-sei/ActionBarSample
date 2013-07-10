package com.example.ActionBar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button btn = (Button)findViewById(R.id.transition_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transScreen();
            }
        });
    }
    private void transScreen(){
        final Intent intent = new Intent(this,SecondScreen.class);
        startActivity(intent);
    }
}
