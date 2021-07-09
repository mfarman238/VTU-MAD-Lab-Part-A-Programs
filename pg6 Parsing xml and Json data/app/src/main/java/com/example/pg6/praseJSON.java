package com.example.pg6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class praseJSON extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prase_json);

        tv=(TextView)findViewById(R.id.tv1);
        String jsonString, cityname, latitude,longitude,temp, humidity;

        try {
            InputStream is = getAssets().open("data.json");

            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            jsonString = new String(buffer, "UTF-8");
            JSONObject obj = new JSONObject(jsonString);

            JSONObject city = obj.getJSONObject("city");

            cityname = city.getString("cityname");
            latitude = city.getString("latitude");
            longitude = city.getString("longitude");
            temp = city.getString("temperature");
            humidity = city.getString("humidity");

            String data = "City Name: " + cityname + "\n latitude" + latitude + "\ntemperature" + temp + "\nhumidity" + humidity;
            tv.setText(data);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }
}