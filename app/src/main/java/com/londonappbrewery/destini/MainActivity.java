package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
            TextView QuestionTextView;
            Button Ans1;
            Button Ans2;
            int index;
            int Index;
            int QuestionRef;
        private Question[] questionBank=new Question[]{
            new Question(R.string.T1_Story),
                new Question(R.string.T2_Story),
                new Question(R.string.T3_Story),
                new Question(R.string.T4_End),
                new Question(R.string.T5_End),
                new Question(R.string.T6_End)
        };

        int answer1[]={R.string.T1_Ans1,R.string.T2_Ans1,R.string.T3_Ans1};
        int answer2[]={R.string.T1_Ans2,R.string.T2_Ans2,R.string.T3_Ans2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ans1=(Button) findViewById(R.id.buttonTop);
        Ans1.setText(answer1[Index]);
        Ans2=(Button) findViewById(R.id.buttonBottom);
        Ans2.setText(answer2[Index]);
    QuestionTextView=(TextView) findViewById(R.id.storyTextView);
        QuestionRef=questionBank[index].getMquestionid();
        QuestionTextView.setText(QuestionRef);

    Ans1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d("destini","Ans1 is pressed");

           checkAnswer(Ans1);
        }
    });
    Ans2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d("destini","Ans2 is pressed");

            checkAnswer(Ans2);
        }
    });



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }

    public void checkAnswer(Button ans){
        if(index==0){
            if(ans==Ans1){
                index=2;
                Index=2;
            }else if(ans==Ans2){
                index=1;
                Index=1;
            }
        }else if(index==1){
            if(ans==Ans1){
                index=2;
                Index=2;
            }else if(ans==Ans2){
                index=3;
                Index=4;
            }
        }else if(index==2){
            if(ans==Ans1){
                index=5;
                Index=4;
            }else if(ans==Ans2){
                index=4;
                Index=4;
            }
        }
        QuestionRef=questionBank[index].getMquestionid();
        QuestionTextView.setText(QuestionRef);
        if(index<=2){
            Ans1.setText(answer1[Index]);
            Ans2.setText(answer2[Index]);

        }else{
            Ans1.setText(" ");
            Ans2.setText(" ");
        }
        
    }

}