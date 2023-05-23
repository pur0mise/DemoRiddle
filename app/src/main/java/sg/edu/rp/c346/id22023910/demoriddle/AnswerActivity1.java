package sg.edu.rp.c346.id22023910.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        Log.d("AnswerActivity1", "onCreate1() called.");

        tvAnswer = findViewById(R.id.textView);
        // tvAnswer.setText("In Second Activity");
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        tvAnswer.setText(questionsSelected + " answer is: Queue");
    }

    @Override
    protected void onStart() {
        Log.d("AnswerActivity1", "onStart1() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("AnswerActivity1", "onResume1() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("AnswerActivity1", "onPause1() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("AnswerActivity1", "onStop1() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity1", "onDestroy1() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("AnswerActivity1", "onRestart1() called.");
        super.onRestart();
    }

}