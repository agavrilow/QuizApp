package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox cbQ1singapore, cbQ1tokyo, cbQ1hongkong, cbQ1moscow, cbQ1newyork, cbQ1london;
    EditText etQ2minPopulationAnswer;
    RadioButton rbQ3moscow, rbQ3newyork, rbQ3singapore, rbQ4singapore, rbQ4tokyo, rbQ4london;
    RadioButton rbQ5hongkong, rbQ5newyork, rbQ5moscow, rbQ6singapore, rbQ6london, rbQ6tokyo;
    RadioButton rbQ7moscow, rbQ7hongkong, rbQ7london, rbQ8tokyo, rbQ8newyork, rbQ8singapore;
    Button btSubmitAllAnswers;
    String Q2userAnswer;
    boolean isMoscowChecked, isTokyochecked, isSingaporeChecked, isLondonChecked, isHongkongChecked, isNewyorkChecked;
    private int correctAnswersQTY = 0;
    private int questionsAnsweredQTY = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbQ1singapore = findViewById(R.id.cb_question1_singapore);
        cbQ1tokyo = findViewById(R.id.cb_question1_tokyo);
        cbQ1hongkong = findViewById(R.id.cb_question1_hongkong);
        cbQ1moscow = findViewById(R.id.cb_question1_moscow);
        cbQ1newyork = findViewById(R.id.cb_question1_newyork);
        cbQ1london = findViewById(R.id.cb_question1_london);
        etQ2minPopulationAnswer = findViewById(R.id.et_question2_min_population_answer);
        rbQ3moscow = findViewById(R.id.rb_question3_moscow);
        rbQ3newyork = findViewById(R.id.rb_question3_newyork);
        rbQ3singapore = findViewById(R.id.rb_question3_singapore);
        rbQ4singapore = findViewById(R.id.rb_question4_singapore);
        rbQ4tokyo = findViewById(R.id.rb_question4_tokyo);
        rbQ4london = findViewById(R.id.rb_question4_london);
        rbQ5hongkong = findViewById(R.id.rb_question5_hongkong);
        rbQ5newyork = findViewById(R.id.rb_question5_newyork);
        rbQ5moscow = findViewById(R.id.rb_question5_moscow);
        rbQ6singapore = findViewById(R.id.rb_question6_singapore);
        rbQ6london = findViewById(R.id.rb_question6_london);
        rbQ6tokyo = findViewById(R.id.rb_question6_tokyo);
        rbQ7moscow = findViewById(R.id.rb_question7_moscow);
        rbQ7hongkong = findViewById(R.id.rb_question7_hongkong);
        rbQ7london = findViewById(R.id.rb_question7_london);
        rbQ8tokyo = findViewById(R.id.rb_question8_tokyo);
        rbQ8newyork = findViewById(R.id.rb_question8_newyork);
        rbQ8singapore = findViewById(R.id.rb_question8_singapore);
        btSubmitAllAnswers = findViewById(R.id.bt_submit_answers);

        rbQ3moscow.setOnClickListener(this);
        rbQ3newyork.setOnClickListener(this);
        rbQ3singapore.setOnClickListener(this);
        rbQ4singapore.setOnClickListener(this);
        rbQ4tokyo.setOnClickListener(this);
        rbQ4london.setOnClickListener(this);
        rbQ5hongkong.setOnClickListener(this);
        rbQ5newyork.setOnClickListener(this);
        rbQ5moscow.setOnClickListener(this);
        rbQ6singapore.setOnClickListener(this);
        rbQ6london.setOnClickListener(this);
        rbQ6tokyo.setOnClickListener(this);
        rbQ7moscow.setOnClickListener(this);
        rbQ7hongkong.setOnClickListener(this);
        rbQ7london.setOnClickListener(this);
        rbQ8tokyo.setOnClickListener(this);
        rbQ8newyork.setOnClickListener(this);
        rbQ8singapore.setOnClickListener(this);
        btSubmitAllAnswers.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rb_question3_moscow:
                questionsAnsweredQTY += 1;
                rbQ3moscow.setVisibility(View.INVISIBLE);
                rbQ3newyork.setVisibility(View.INVISIBLE);
                rbQ3singapore.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question3_newyork:
                questionsAnsweredQTY += 1;
                correctAnswersQTY += 1;
                rbQ3moscow.setVisibility(View.INVISIBLE);
                rbQ3newyork.setVisibility(View.INVISIBLE);
                rbQ3singapore.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question3_singapore:
                questionsAnsweredQTY += 1;
                rbQ3moscow.setVisibility(View.INVISIBLE);
                rbQ3newyork.setVisibility(View.INVISIBLE);
                rbQ3singapore.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question4_singapore:
                questionsAnsweredQTY += 1;
                correctAnswersQTY += 1;
                rbQ4singapore.setVisibility(View.INVISIBLE);
                rbQ4tokyo.setVisibility(View.INVISIBLE);
                rbQ4london.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question4_tokyo:
                questionsAnsweredQTY += 1;
                rbQ4singapore.setVisibility(View.INVISIBLE);
                rbQ4tokyo.setVisibility(View.INVISIBLE);
                rbQ4london.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question4_london:
                questionsAnsweredQTY += 1;
                rbQ4singapore.setVisibility(View.INVISIBLE);
                rbQ4tokyo.setVisibility(View.INVISIBLE);
                rbQ4london.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question5_hongkong:
                questionsAnsweredQTY += 1;
                rbQ5hongkong.setVisibility(View.INVISIBLE);
                rbQ5newyork.setVisibility(View.INVISIBLE);
                rbQ5moscow.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question5_newyork:
                questionsAnsweredQTY += 1;
                rbQ5hongkong.setVisibility(View.INVISIBLE);
                rbQ5newyork.setVisibility(View.INVISIBLE);
                rbQ5moscow.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question5_moscow:
                questionsAnsweredQTY += 1;
                correctAnswersQTY += 1;
                rbQ5hongkong.setVisibility(View.INVISIBLE);
                rbQ5newyork.setVisibility(View.INVISIBLE);
                rbQ5moscow.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question6_singapore:
                questionsAnsweredQTY += 1;
                rbQ6singapore.setVisibility(View.INVISIBLE);
                rbQ6london.setVisibility(View.INVISIBLE);
                rbQ6tokyo.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question6_london:
                questionsAnsweredQTY += 1;
                correctAnswersQTY += 1;
                rbQ6singapore.setVisibility(View.INVISIBLE);
                rbQ6london.setVisibility(View.INVISIBLE);
                rbQ6tokyo.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question6_tokyo:
                questionsAnsweredQTY += 1;
                rbQ6singapore.setVisibility(View.INVISIBLE);
                rbQ6london.setVisibility(View.INVISIBLE);
                rbQ6tokyo.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question7_moscow:
                questionsAnsweredQTY += 1;
                rbQ7moscow.setVisibility(View.INVISIBLE);
                rbQ7hongkong.setVisibility(View.INVISIBLE);
                rbQ7london.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question7_hongkong:
                questionsAnsweredQTY += 1;
                correctAnswersQTY += 1;
                rbQ7moscow.setVisibility(View.INVISIBLE);
                rbQ7hongkong.setVisibility(View.INVISIBLE);
                rbQ7london.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question7_london:
                questionsAnsweredQTY += 1;
                rbQ7moscow.setVisibility(View.INVISIBLE);
                rbQ7hongkong.setVisibility(View.INVISIBLE);
                rbQ7london.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question8_tokyo:
                questionsAnsweredQTY += 1;
                correctAnswersQTY += 1;
                rbQ8tokyo.setVisibility(View.INVISIBLE);
                rbQ8newyork.setVisibility(View.INVISIBLE);
                rbQ8singapore.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question8_newyork:
                questionsAnsweredQTY += 1;
                rbQ8tokyo.setVisibility(View.INVISIBLE);
                rbQ8newyork.setVisibility(View.INVISIBLE);
                rbQ8singapore.setVisibility(View.INVISIBLE);
                break;
            case R.id.rb_question8_singapore:
                questionsAnsweredQTY += 1;
                rbQ8tokyo.setVisibility(View.INVISIBLE);
                rbQ8newyork.setVisibility(View.INVISIBLE);
                rbQ8singapore.setVisibility(View.INVISIBLE);
                break;
            case R.id.bt_submit_answers:
                checkAnswer();
                displayAnswer();
        }
    }

    public void checkAnswer() {

        isSingaporeChecked = cbQ1singapore.isChecked();
        isTokyochecked = cbQ1tokyo.isChecked();
        isHongkongChecked = cbQ1hongkong.isChecked();
        isMoscowChecked = cbQ1moscow.isChecked();
        isNewyorkChecked = cbQ1newyork.isChecked();
        isLondonChecked = cbQ1london.isChecked();

        Q2userAnswer = (String.valueOf(etQ2minPopulationAnswer.getText())).toLowerCase();

        if (Q2userAnswer.equals("singapore")) {
            questionsAnsweredQTY += 1;
            correctAnswersQTY += 1;
        } else questionsAnsweredQTY += 1;

        if (isTokyochecked && isMoscowChecked) {
            questionsAnsweredQTY += 1;
            correctAnswersQTY += 1;
        } else if (isSingaporeChecked || isHongkongChecked || isNewyorkChecked || isLondonChecked || isTokyochecked || isMoscowChecked)
            questionsAnsweredQTY += 1;
    }

    public void displayAnswer() {
        if (questionsAnsweredQTY < 8) Toast.makeText(this, R.string.notAllToast, Toast.LENGTH_SHORT).show();
        else if (correctAnswersQTY < 8 && questionsAnsweredQTY == 8) {
            Toast.makeText(this, getString(R.string.yourScore) + " " + correctAnswersQTY + " " + getString(R.string.tryAgain), Toast.LENGTH_SHORT).show();
            rbQ3moscow.setVisibility(View.VISIBLE);
            rbQ3newyork.setVisibility(View.VISIBLE);
            rbQ3singapore.setVisibility(View.VISIBLE);
            rbQ4singapore.setVisibility(View.VISIBLE);
            rbQ4tokyo.setVisibility(View.VISIBLE);
            rbQ4london.setVisibility(View.VISIBLE);
            rbQ5hongkong.setVisibility(View.VISIBLE);
            rbQ5newyork.setVisibility(View.VISIBLE);
            rbQ5moscow.setVisibility(View.VISIBLE);
            rbQ6singapore.setVisibility(View.VISIBLE);
            rbQ6london.setVisibility(View.VISIBLE);
            rbQ6tokyo.setVisibility(View.VISIBLE);
            rbQ7moscow.setVisibility(View.VISIBLE);
            rbQ7hongkong.setVisibility(View.VISIBLE);
            rbQ7london.setVisibility(View.VISIBLE);
            rbQ8tokyo.setVisibility(View.VISIBLE);
            rbQ8newyork.setVisibility(View.VISIBLE);
            rbQ8singapore.setVisibility(View.VISIBLE);
            rbQ3moscow.setChecked(false);
            rbQ3newyork.setChecked(false);
            rbQ3singapore.setChecked(false);
            rbQ4singapore.setChecked(false);
            rbQ4tokyo.setChecked(false);
            rbQ4london.setChecked(false);
            rbQ5hongkong.setChecked(false);
            rbQ5newyork.setChecked(false);
            rbQ5moscow.setChecked(false);
            rbQ6singapore.setChecked(false);
            rbQ6london.setChecked(false);
            rbQ6tokyo.setChecked(false);
            rbQ7moscow.setChecked(false);
            rbQ7hongkong.setChecked(false);
            rbQ7london.setChecked(false);
            rbQ8tokyo.setChecked(false);
            rbQ8newyork.setChecked(false);
            rbQ8singapore.setChecked(false);
            correctAnswersQTY = 0;
            questionsAnsweredQTY = 0;
        } else if (correctAnswersQTY == 8 && questionsAnsweredQTY == 8) Toast.makeText(this, R.string.correctToast, Toast.LENGTH_SHORT).show();
    }
}
