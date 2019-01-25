package android.pc.com.androidproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityAdd extends AppCompatActivity {

    private TextView mTextView;
    private Button mCancelBtn;
    private Button mDoneBtn;
    private Button mOutcomeBtn;
    private Button mIncomeBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        onCancelBtn();
        onDoneBtn();
        onIncomeBtn();
        onOutcomeBtn();




    }








    public void onIncomeBtn () {
        mTextView = (TextView) findViewById(R.id.text_title);
        mIncomeBtn = (Button) findViewById(R.id.income_button);
        mIncomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorAccent = getResources().getColor(R.color.colorAccent);
                int colorPrimaryDark = getResources().getColor(R.color.colorPrimaryDark);
                mIncomeBtn.setBackgroundColor(colorAccent);
                mOutcomeBtn.setBackgroundColor(colorPrimaryDark);
                mTextView.setText("Income");


                //add income to database
            }
        });
    }




    public void onOutcomeBtn () {
        mTextView = (TextView) findViewById(R.id.text_title);
        mOutcomeBtn = (Button) findViewById(R.id.outcome_button);
        mOutcomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorAccent = getResources().getColor(R.color.colorAccent);
                int colorPrimaryDark = getResources().getColor(R.color.colorPrimaryDark);
                mOutcomeBtn.setBackgroundColor(colorAccent);
                mIncomeBtn.setBackgroundColor(colorPrimaryDark);
                mTextView.setText("Outcome");


                //add outcome to database
            }
        });
    }





    public void onDoneBtn () {
        mDoneBtn = (Button) findViewById(R.id.done_button);
        mDoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //open questions and save in list

                Toast toast = Toast.makeText(getApplicationContext(),
                        "Added",
                        Toast.LENGTH_SHORT);

                toast.show();

                returnActivityMain();
            }
        });
    }







    public void onCancelBtn () {
        mCancelBtn = (Button) findViewById(R.id.cancel_button);
        mCancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnActivityMain();
            }
        });
    }







    public void returnActivityMain() {
        final Intent intent = new Intent(this, MainActivity.class);
        setResult(ActivityAdd.RESULT_OK, intent);
        finish();
    }




}
