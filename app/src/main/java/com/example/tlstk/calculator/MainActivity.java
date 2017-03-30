package com.example.tlstk.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class mainActivity extends AppCompatActivity implements View.OnClickListener
{
    ArrayList arrayList = new ArrayList();

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_dot, btn_e, btn_clr, btn_s, btn_x, btn_m, btn_p;
    TextView bar;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn_dot = (Button) findViewById(R.id.btn_dot);
        btn_clr = (Button) findViewById(R.id.btn_clr);
        btn_e = (Button) findViewById(R.id.btn_e);
        btn_x = (Button) findViewById(R.id.btn_x);
        btn_m = (Button) findViewById(R.id.btn_m);
        btn_s = (Button) findViewById(R.id.btn_s);
        btn_p = (Button) findViewById(R.id.btn_p);
        bar = (TextView) findViewById(R.id.bar);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_clr.setOnClickListener(this);
        btn_e.setOnClickListener(this);
        btn_x.setOnClickListener(this);
        btn_m.setOnClickListener(this);
        btn_s.setOnClickListener(this);
        btn_p.setOnClickListener(this);
        bar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_clr:
                arrayList.clear();
                bar.setText("");
                break;
            case R.id.btn0:
                bar.setText(bar.getText().toString()+"0");
                break;
            case R.id.btn1:
                bar.setText(bar.getText().toString()+"1");
                break;
            case R.id.btn2:
                bar.setText(bar.getText().toString()+"2");
                break;
            case R.id.btn3:
                bar.setText(bar.getText().toString()+"3");
                break;
            case R.id.btn4:
                bar.setText(bar.getText().toString()+"4");
                break;
            case R.id.btn5:
                bar.setText(bar.getText().toString()+"5");
                break;
            case R.id.btn6:
                bar.setText(bar.getText().toString()+"6");
                break;
            case R.id.btn7:
                bar.setText(bar.getText().toString()+"7");
                break;
            case R.id.btn8:
                bar.setText(bar.getText().toString()+"8");
                break;
            case R.id.btn9:
                bar.setText(bar.getText().toString()+"9");
                break;
            case R.id.btn_p:
                arrayList.add(bar.getText().toString());
                bar.setText("");
                count = 1;
                break;
            case R.id.btn_m:
                arrayList.add(bar.getText().toString());
                bar.setText("");
                count = 2;
                break;
            case R.id.btn_x:
                arrayList.add(bar.getText().toString());
                bar.setText("");
                count = 3;
                break;
            case R.id.btn_s:
                arrayList.add(bar.getText().toString());
                bar.setText("");
                count = 4;
                break;
            case R.id.btn_e:
                int sum1 = 0, sum2=0, sum3,count2 =0;
                double fsum1=0, fsum2=0, fsum3=0;

                if(arrayList.isEmpty())
                {
                    bar.setText("");
                }

                else
                    {
                    Object obj = arrayList.get(0);
                    String num1 = (String)obj;
                    String num2 = bar.getText().toString();

                    if (num1.contains(".")) (num2.contains("."))
                        {
                            count2 = 1;
                            fsum1 = Float.parseFloat(num1);
                            fsum2 = Float.parseFloat(num2);
                        }

                }
        }
    }
}
