package com.example.android.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
private Button mTrueButton;
    private Button mNextButton;
private Button mFalseButton;
private TextView mQuestionTextView;
private int mCurrentIndex = 0;
private Question[] mQuestionBank = new Question[]{
            new Question(R.string.question_Mombasa,true),
            new Question(R.string.question_Nairobi,true),
            new Question(R.string.question_Oceans,false),
            new Question(R.string.question_Uganda,false),
    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        //wiring up the textView
        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);
        int question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);
        //getting reference to widgets
        mTrueButton = (Button) findViewById(R.id.true_button);
        //setting a lister for the true button
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
            }
        });
        mFalseButton = (Button) findViewById(R.id.false_button);
        // setting the lister for the false button
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
