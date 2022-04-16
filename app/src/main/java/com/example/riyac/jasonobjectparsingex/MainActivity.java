package com.example.riyac.jasonobjectparsingex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView;
        textView=(TextView)findViewById(R.id.textView);
        String str="{\"Student\":{\"name\":\"Riya\", \"id\":\"01\"}}";
        try {
            JSONObject jsonObject=(new JSONObject(str)).getJSONObject("Student");
            String str1=jsonObject.getString("name");
            String str2=jsonObject.getString("id");
            textView.setText(str1+" "+str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
