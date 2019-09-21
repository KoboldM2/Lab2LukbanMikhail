package com.lukban.labexerno2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        userInput = findViewById(R.id.editText9);
        this.setTitle("Validate");
    }

    public void previousPage(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void validate(View v) {
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);

        String CourseFirst = sp.getString("courseNo1",null);
        String CourseSecond = sp.getString("courseNo2",null);
        String CourseThird = sp.getString("courseNo3",null);
        String CourseFourth = sp.getString("courseNo4",null);
        String CourseFifth = sp.getString("courseNo5",null);
        String CourseSixth = sp.getString("courseNo6",null);
        String CourseSeventh = sp.getString("courseNo7",null);
        String CourseEighth = sp.getString("courseNo8",null);

        String courseInput = userInput.getText().toString();

        if(courseInput.equals(CourseFirst) || courseInput.equals(CourseSecond) || courseInput.equals(CourseThird) || courseInput.equals(CourseFourth) || courseInput.equals(CourseFifth) || courseInput.equals(CourseSixth) || courseInput.equals(CourseSeventh) || courseInput.equals(CourseEighth)) {
            Toast.makeText(this, "Course is offered in UST", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Course is NOT offered in UST", Toast.LENGTH_LONG).show();
        }
    }
}
