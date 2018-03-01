package com.example.android.android_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    // Start score
    int correctAnswers = 0;

    public void CheckAnswers(View view) {

        RadioButton firstQuestion = (RadioButton) findViewById( R.id.answer1_A );
        Boolean firstRightAnswer = firstQuestion.isChecked();

        if (firstRightAnswer) {
            correctAnswers += 1;
        }

        RadioButton secondQuestion = (RadioButton) findViewById( R.id.answer2_B );
        Boolean secondRightAnswer = secondQuestion.isChecked();

        if (secondRightAnswer) {
            correctAnswers += 1;
        }

        RadioButton thirdQuestion = (RadioButton) findViewById( R.id.answer3_D);
        Boolean thirdRightAnswer = thirdQuestion.isChecked();

        if (thirdRightAnswer) {
            correctAnswers += 1;
        }

        RadioButton fourthQuestion = (RadioButton) findViewById( R.id.answer4_A );
        Boolean fourthRightAnswer = fourthQuestion.isChecked();

        if (fourthRightAnswer) {
            correctAnswers += 1;
        }

        RadioButton fifthQuestion = (RadioButton) findViewById( R.id.answer5_C );
        Boolean fifthRightAnswer = fifthQuestion.isChecked();

        if (fifthRightAnswer) {
            correctAnswers += 1;
        }

        CheckBox sixthQuestionWrong = (CheckBox) findViewById( R.id.false_6_a );
        Boolean sixthWrongAnswer = sixthQuestionWrong.isChecked();

        CheckBox sixthQuestion1 = (CheckBox) findViewById( R.id.true_6_b );
        Boolean sixthRightAnswer1 = sixthQuestion1.isChecked();

        CheckBox sixthQuestion2 = (CheckBox) findViewById( R.id.true_6_C );
        Boolean sixthRightAnswer2 = sixthQuestion2.isChecked();

        if ((!sixthWrongAnswer) || (sixthRightAnswer1) || (sixthRightAnswer2)) {
            correctAnswers += 1;
        }
        RadioButton seventhQuestion = (RadioButton) findViewById( R.id.answer7_B );
        Boolean seventhRightAnswer = seventhQuestion.isChecked();

        if (seventhRightAnswer) {
            correctAnswers += 1;
        }
        RadioButton eightQuestion = (RadioButton) findViewById( R.id.answer8_C);
        Boolean eightRightAnswer = eightQuestion.isChecked();

        if (eightRightAnswer) {
            correctAnswers += 1;
        }

        CheckBox ninthQuestionWrong = (CheckBox) findViewById( R.id.true_9_a );
        Boolean ninthRightAnswer = ninthQuestionWrong.isChecked();

        CheckBox ninthQuestion1 = (CheckBox) findViewById( R.id.true_9_b );
        Boolean ninthRightAnswer1 = ninthQuestion1.isChecked();

        CheckBox ninthQuestion2 = (CheckBox) findViewById( R.id.false_9_c );
        Boolean ninthWrongAnswer2 = ninthQuestion2.isChecked();

        if ((!ninthWrongAnswer2) || (ninthRightAnswer) || (ninthRightAnswer1)) {
            correctAnswers += 1;
        }

        EditText name = findViewById(R.id.name_field);

        String Username = name.getText().toString();

        Toast.makeText( getApplicationContext(), Username + ", you have answered " + correctAnswers + "/9 Correct answers", Toast.LENGTH_LONG ).show();

        correctAnswers = 0;

    }

}