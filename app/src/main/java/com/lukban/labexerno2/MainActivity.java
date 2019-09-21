package com.lukban.labexerno2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Course1, Course2, Course3, Course4, Course5, Course6, Course7, Course8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Course1 = findViewById(R.id.editText);
        Course2 = findViewById(R.id.editText2);
        Course3 = findViewById(R.id.editText3);
        Course4 = findViewById(R.id.editText4);
        Course5 = findViewById(R.id.editText5);
        Course6 = findViewById(R.id.editText6);
        Course7 = findViewById(R.id.editText7);
        Course8 = findViewById(R.id.editText8);

    }

    public void saveData(View v) {
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        String firstCourse = Course1.getText().toString();
        String secondCourse = Course2.getText().toString();
        String thirdCourse = Course3.getText().toString();
        String fourthCourse = Course4.getText().toString();
        String fifthCourse = Course5.getText().toString();
        String sixthCourse = Course6.getText().toString();
        String seventhCourse = Course7.getText().toString();
        String eighthCourse = Course8.getText().toString();

        editor.putString("courseNo1",firstCourse);
        editor.putString("courseNo2",secondCourse);
        editor.putString("courseNo3",thirdCourse);
        editor.putString("courseNo4",fourthCourse);
        editor.putString("courseNo5",fifthCourse);
        editor.putString("courseNo6",sixthCourse);
        editor.putString("courseNo7",seventhCourse);
        editor.putString("courseNo8",eighthCourse);

        editor.commit();

        Toast.makeText(this, "data was saved...",Toast.LENGTH_LONG).show();
    }

    public void nextPage(View v) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }

}
