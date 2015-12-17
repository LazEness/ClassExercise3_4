package com.example.ashes.d20charactersheet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class DiceRoller extends Fragment {

    public static DiceRoller newInstance() {
        DiceRoller fragment = new DiceRoller();
        return fragment;
    }
    public DiceRoller() {
}
    Button ClickMe;
    TextView tv;
    TextView crit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_dice_roller, container, false);


    ClickMe = (Button) rootView.findViewById(R.id.roller_button);
    tv = (TextView) rootView.findViewById(R.id.D20result_textView);
        crit =(TextView) rootView.findViewById(R.id.crit);
    ClickMe.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            crit.setVisibility(View.GONE);
            Random r = new Random();
            int Low = 1;
            int High = 21;
            int Result = r.nextInt(High-Low) + Low;
            tv.setText("You rolled a " + (Integer.toString(Result)));
            if (Result == 20){
                crit.setVisibility(View.VISIBLE);
            }
        }
    });
    return rootView;
}
}