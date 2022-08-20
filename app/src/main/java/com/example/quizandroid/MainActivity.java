package com.example.quizandroid;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ArrayAdapter<questionWithAnswers> pageList;
    TextView text;
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    int i = 0;
    RadioGroup g;
    String answer1="";String answer2="";String answer3=""; String answer4="";String answer5 = "";
    questionWithAnswers[] pages = {new questionWithAnswers("Q1:3*2=", "6", "90", "44", ""),
            new questionWithAnswers("Q2:5*5=", "19", "25", "100", ""),
            new questionWithAnswers("Q3:12*5=", "30", "10", "60", ""),
            new questionWithAnswers("Q4:6*6=", "36", "66", "63", ""),
            new questionWithAnswers("Q5:7*7=", "94", "49", "80", "")

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pageList = new ArrayAdapter<questionWithAnswers>(this, android.R.layout.preference_category, pages);
        text = (TextView) findViewById(R.id.text1);
        r1 = (RadioButton) findViewById(R.id.radio1);
        r2 = (RadioButton) findViewById(R.id.radio2);
        r3 = (RadioButton) findViewById(R.id.radio3);
        g = (RadioGroup) findViewById(R.id.group);
        text.setText(pageList.getItem(0).getQuestions());
        r1.setText(pageList.getItem(0).getOption1());
        r2.setText(pageList.getItem(0).getOption2());
        r3.setText(pageList.getItem(0).getOption3());
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check1 = r1.isChecked();
                if (text.getText().toString() == "Q1:3*2=" && check1) {
                    answer1 = "1";
                    // pageList.getItem(0).setSelected("6");
                    pageList.getItem(0).setSelected(r1.getText().toString());

                } else if (text.getText().toString() == "Q2:5*5=" && check1) {
                    answer2 = "0";
                    // pageList.getItem(1).setSelected("19");
                    pageList.getItem(1).setSelected(r1.getText().toString());
                } else if (text.getText().toString() == "Q3:12*5=" && check1) {
                    answer3 = "0";
                    // pageList.getItem(2).setSelected("30");
                    pageList.getItem(2).setSelected(r1.getText().toString());
                } else if (text.getText().toString() == "Q4:6*6=" && check1) {
                    answer4 = "1";
                    // pageList.getItem(3).setSelected("36");
                    pageList.getItem(3).setSelected(r1.getText().toString());
                } else if (text.getText().toString() == "Q5:7*7=" && check1) {
                    answer5 = "0";
                    // pageList.getItem(4).setSelected("94");
                    pageList.getItem(4).setSelected(r1.getText().toString());
                }
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check1 = r2.isChecked();
                if (text.getText().toString() == "Q1:3*2=" && check1) {
                    answer1 = "0";
                    pageList.getItem(0).setSelected(r2.getText().toString());

                } else if (text.getText().toString() == "Q2:5*5=" && check1) {
                    answer2 = "1";
                    pageList.getItem(1).setSelected(r2.getText().toString());
                } else if (text.getText().toString() == "Q3:12*5=" && check1) {
                    answer3 = "0";
                    pageList.getItem(2).setSelected(r2.getText().toString());
                } else if (text.getText().toString() == "Q4:6*6=" && check1) {
                    answer4 = "0";
                    pageList.getItem(3).setSelected(r2.getText().toString());
                } else if (text.getText().toString() == "Q5:7*7=" && check1) {
                    answer5 = "1";
                    pageList.getItem(4).setSelected(r2.getText().toString());
                }
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check1 = r3.isChecked();
                if (text.getText().toString() == "Q1:3*2=" && check1) {
                    answer1 = "0";
                    pageList.getItem(0).setSelected(r3.getText().toString());

                } else if (text.getText().toString() == "Q2:5*5=" && check1) {
                    answer2 = "0";
                    pageList.getItem(1).setSelected(r3.getText().toString());
                } else if (text.getText().toString() == "Q3:12*5=" && check1) {
                    answer3 = "1";
                    pageList.getItem(2).setSelected(r3.getText().toString());
                } else if (text.getText().toString() == "Q4:6*6=" && check1) {
                    answer4 = "0";
                    pageList.getItem(3).setSelected(r3.getText().toString());
                } else if (text.getText().toString() == "Q5:7*7=" && check1) {
                    answer5 = "0";
                    pageList.getItem(4).setSelected(r3.getText().toString());
                }
            }
        });
    }

    public void next(View view) {

        if (i<=3) {
            ++i;

            text.setText(pageList.getItem(i).getQuestions());
            r1.setText(pageList.getItem(i).getOption1());
            r2.setText(pageList.getItem(i).getOption2());
            r3.setText(pageList.getItem(i).getOption3());
            if (pageList.getItem(i).getSelsected() == "") {

                g.clearCheck();

            } else {

                if (pageList.getItem(i).getSelsected() == pageList.getItem(i).getOption1())
                {

                    r1.setChecked(true);
                }

                else if (pageList.getItem(i).getSelsected() == pageList.getItem(i).getOption2())
                {

                    r2.setChecked(true);
                }

                else if (pageList.getItem(i).getSelsected() == pageList.getItem(i).getOption3())
                {

                    r3.setChecked(true);
                }

            }


        }
        else {

            i = 0;
            text.setText(pageList.getItem(i).getQuestions());
            r1.setText(pageList.getItem(i).getOption1());
            r2.setText(pageList.getItem(i).getOption2());
            r3.setText(pageList.getItem(i).getOption3());
            if(pageList.getItem(i).getSelsected()=="")
            {

                g.clearCheck();
            }
            else if(pageList.getItem(i).getSelsected()!=null)
            {

                if  (pageList.getItem(i).getSelsected() == pageList.getItem(i).getOption1())
                {

                    r1.setChecked(true);
                }

                else if (pageList.getItem(i).getSelsected() == pageList.getItem(i).getOption2())
                {

                    r2.setChecked(true);

                }

                else if(pageList.getItem(i).getSelsected() == pageList.getItem(i).getOption3())
                {

                    r3.setChecked(true);

                }

            }



        }


    }

    public void previous(View view) {

        if (i == 0) {

            i = 4;
            text.setText(pageList.getItem(i).getQuestions());
            r1.setText(pageList.getItem(i).getOption1());
            r2.setText(pageList.getItem(i).getOption2());
            r3.setText(pageList.getItem(i).getOption3());
            if(pageList.getItem(i).getSelsected()=="")
            {

                g.clearCheck();
            }
            else
            {

                if (pageList.getItem(i).getSelsected() == r1.getText().toString())
                {


                    r1.setChecked(true);

                }

                else if (pageList.getItem(i).getSelsected() == r2.getText().toString())
                {

                    r2.setChecked(true);
                }

                else if (pageList.getItem(i).getSelsected() == r3.getText().toString())
                {

                    r3.setChecked(true);
                }

            }


        }
        else if (i <= 4 &&i>0) {

            --i;
            text.setText(pageList.getItem(i).getQuestions());
            r1.setText(pageList.getItem(i).getOption1());
            r2.setText(pageList.getItem(i).getOption2());
            r3.setText(pageList.getItem(i).getOption3());
            if(pageList.getItem(i).getSelsected()=="")
            {

                g.clearCheck();
            }
            else if(pageList.getItem(i).getSelsected()!=null)
            {
                if (pageList.getItem(i).getSelsected() == r1.getText().toString())
                {

                    r1.setChecked(true);
                }

                else if (pageList.getItem(i).getSelsected() == r2.getText().toString())
                {

                    r2.setChecked(true);
                }

                else if (pageList.getItem(i).getSelsected() == r3.getText().toString())
                {

                    r3.setChecked(true);
                }

            }

        }
    }

    public void show(View view) {
        if ((answer1 == "") || (answer2 == "") || (answer3 == "") || (answer4 == "") || (answer5 == ""))
            Toast.makeText(this, "please make sure that you answered all questions", Toast.LENGTH_LONG).show();
        else {
            Intent i = new Intent(this, MainActivity2.class);
            i.putExtra("result1", answer1);
            i.putExtra("result2",answer2);
            i.putExtra("result3",answer3);
            i.putExtra("result4",answer4);
            i.putExtra("result5",answer5);
            startActivity(i);
            for(int j=0;j<=4;j++)
                pageList.getItem(j).setSelected("");
            g.clearCheck();
            answer1 = "";
            answer2 = "";
            answer3 = "";
            answer4 = "";
            answer5 = "";


        }

    }
}
