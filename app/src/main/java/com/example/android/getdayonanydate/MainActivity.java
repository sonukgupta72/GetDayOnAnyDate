package com.example.android.getdayonanydate;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void getDay(View view)    {
        int c,i=0,dayCounter=0;

        EditText e1=(EditText)findViewById(R.id.editText1);
        EditText e2=(EditText)findViewById(R.id.editText2);
        EditText e3=(EditText)findViewById(R.id.editText3);
        int d=Integer.parseInt(e1.getText().toString());
        int m=Integer.parseInt(e2.getText().toString());
        int y=Integer.parseInt(e3.getText().toString());

        c=y*365+y/4-y/100+y/400;
        if((y%4==0 && y%100!=0) || y%400==0) {
            i = 1;
        }

        if(m==1)
        {
            if(d>31)
                dayCounter=7;
            else
                dayCounter=(c+d-i-1)%7;
        }

        if(m==2)
        {
            if(i==0)
            {
                if(d>28) {
                    dayCounter = 7;
                }
            }
            else
            {
                if(d<=29) {
                    dayCounter = (c + 31 + d - i-1) % 7;
                }
                else {
                    dayCounter = 7;
                }
            }
        }
        if(m==3)
        {
            if(d>31) {
                dayCounter = 7;
            }
            else {
                dayCounter = (c + 31 + 28 + d-1) % 7;
            }
        }
        if(m==4)
        {
            if(d>30) {
                dayCounter = 7;
            }
            else {
                dayCounter = (c + 31 + 28 + 31 + d - 1) % 7;
            }
        }
        if(m==5)
        {
            if(d>31) {
                dayCounter = 7;
            }
            else {
                dayCounter = (c + 31 + 28 + 31 + 30 + d-1) % 7;
            }
        }
        if(m==6)
        {
            if(d>30) {
                dayCounter = 7;
            }
            else {
                dayCounter = (c + 31 + 28 + 31 + 30 + 31 + d-1) % 7;
            }
        }
        if(m==7)
        {
            if(d>31) {
                dayCounter = 7;
            }
            else {
                dayCounter = (c + 31 + 28 + 31 + 30 + 31 + 30 + d-1) % 7;
            }
        }
        if(m==8)
        {
            if(d>31) {
                dayCounter = 7;
            }
            else {
                dayCounter = (c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + d-1) % 7;
            }
        }
        if(m==9)
        {
            if(d>30) {
                dayCounter = 7;
            }
            else {
                dayCounter = (c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d-1) % 7;
            }
        }
        if(m==10)
        {
            if(d>31) {
                dayCounter = 7;
            }
            else {
                dayCounter = (c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d-1) % 7;
            }
        }
        if(m==11)
        {
            if(d>30) {
                dayCounter = 7;
            }
            else {
                dayCounter = (c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d-1) % 7;
            }
        }
        if(m==12)
        {
            if(d>31) {
                dayCounter = 7;
            }
            else {
                dayCounter = (c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d-1) % 7;
            }
        }
        if(m<0 || m>12) {
            dayCounter = 7;
        }


        if(dayCounter==0) {
            displayDay("Sunday");
        }
        if(dayCounter==1) {
            displayDay("Monday");
        }
        if(dayCounter==2) {
            displayDay("Tuesday");
        }
        if(dayCounter==3) {
            displayDay("Wednesday");
        }
        if(dayCounter==4) {
            displayDay("Thursday");
        }
        if(dayCounter==5) {
            displayDay("Friday");
        }
        if(dayCounter==6) {
            displayDay("Saturday");
        }
        if(dayCounter==7) {
            displayDay("Invalid date");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void displayDay(String day){
        TextView dayTextView=(TextView)findViewById(R.id.text_view1);
        dayTextView.setText(""+day);
    }
}
