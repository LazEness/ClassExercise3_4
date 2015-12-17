package com.example.ashes.d20charactersheet;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    final Context context = this;

    public static final String Save = "CharacterSheet";
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    //EditText strField = (EditText) findViewById(R.id.strField);
    //EditText conField = (EditText) findViewById(R.id.conField);
    //EditText dexField = (EditText) findViewById(R.id.dexField);
    //EditText intField = (EditText) findViewById(R.id.intField);
    //EditText wisField = (EditText) findViewById(R.id.wisField);
    //EditText chaField = (EditText) findViewById(R.id.chaField);
    Button ClickMe;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

/*
        EditText strField = (EditText) findViewById(R.id.strField);
        EditText conField = (EditText) findViewById(R.id.conField);
        EditText dexField = (EditText) findViewById(R.id.dexField);
        EditText intField = (EditText) findViewById(R.id.intField);
        EditText wisField = (EditText) findViewById(R.id.wisField);
        EditText chaField = (EditText) findViewById(R.id.chaField);

        athletics.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(strField.getText().toString()))));
        // Integer.parseInt(conField.getText().toString());
        acrobatics.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(dexField.getText().toString()))));
        stealth.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(dexField.getText().toString()))));
        sleightOfHand.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(dexField.getText().toString()))));
        arcana.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
        nature.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
        history.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
        religion.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
        investigation.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
        animalHandling.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
        perception.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
        insight.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
        survival.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
        medicine.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
        deception.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(chaField.getText().toString()))));
        performance.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(chaField.getText().toString()))));
        intimidation.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(chaField.getText().toString()))));
        persuasion.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(chaField.getText().toString()))));

*/
        //  SharedPreferences sp = this.getPreferences( Context.MODE_PRIVATE );
        //SharedPreferences.Editor editor = sp.edit();

       // Random rand = new Random();

        //int randomNum = rand.nextInt( 1000 );

       // editor.putString( "EQUATION_KEY_" + String.valueOf( randomNum ), );
       // editor.commit();

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
            //@Override
           // public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        //.setAction("Action", null).show();
           // }
       // });

    }


 /*  @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
       EditText strField = (EditText) findViewById(R.id.strField);
       EditText conField = (EditText) findViewById(R.id.conField);
       EditText dexField = (EditText) findViewById(R.id.dexField);
       EditText intField = (EditText) findViewById(R.id.intField);
       EditText wisField = (EditText) findViewById(R.id.wisField);
       EditText chaField = (EditText) findViewById(R.id.chaField);
        savedInstanceState.putInt("str", Integer.parseInt(strField.getText().toString()));
        savedInstanceState.putInt("con", Integer.parseInt(conField.getText().toString()));
        savedInstanceState.putInt("dex", Integer.parseInt(dexField.getText().toString()));
        savedInstanceState.putInt("int", Integer.parseInt(intField.getText().toString()));
        savedInstanceState.putInt("wis", Integer.parseInt(wisField.getText().toString()));
        savedInstanceState.putInt("cha", Integer.parseInt(chaField.getText().toString()));

        // you can also save serializable objects
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int str = savedInstanceState.getInt("str");
        int con = savedInstanceState.getInt("con");
        int dex = savedInstanceState.getInt("dex");
        int inte = savedInstanceState.getInt("int");
        int wis = savedInstanceState.getInt("wis");
        int cha = savedInstanceState.getInt("cha");
    }
*/
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
        EditText name = (EditText) findViewById(R.id.name);
        EditText strField = (EditText) findViewById(R.id.strField);
        EditText conField = (EditText) findViewById(R.id.conField);
        EditText dexField = (EditText) findViewById(R.id.dexField);
        EditText intField = (EditText) findViewById(R.id.intField);
        EditText wisField = (EditText) findViewById(R.id.wisField);
        EditText chaField = (EditText) findViewById(R.id.chaField);
        EditText athletics = (EditText) findViewById(R.id.athletics);
        EditText acrobatics = (EditText) findViewById(R.id.acrobatics);
        EditText stealth = (EditText) findViewById(R.id.stealth);
        EditText sleightOfHand = (EditText) findViewById(R.id.sleightOfHand);
        EditText arcana = (EditText) findViewById(R.id.arcana);
        EditText nature = (EditText) findViewById(R.id.nature);
        EditText history = (EditText) findViewById(R.id.history);
        EditText religion = (EditText) findViewById(R.id.religion);
        EditText investigation = (EditText) findViewById(R.id.investigation);
        EditText animalHandling = (EditText) findViewById(R.id.animalHandling);
        EditText perception = (EditText) findViewById(R.id.perception);
        EditText insight = (EditText) findViewById(R.id.insight);
        EditText survival = (EditText) findViewById(R.id.survival);
        EditText medicine = (EditText) findViewById(R.id.medicine);
        EditText deception = (EditText) findViewById(R.id.deception);
        EditText performance = (EditText) findViewById(R.id.performance);
        EditText intimidation = (EditText) findViewById(R.id.intimidation);
        EditText persuasion = (EditText) findViewById(R.id.persuasion);


        //noinspection SimplifiableIfStatement
        switch(id){
            case R.id.menu_load:
                SharedPreferences loadGame = getSharedPreferences(Save, MODE_PRIVATE);
                String characterName = loadGame.getString("name", "Character name");
                int str = loadGame.getInt("str", 10);
                int con = loadGame.getInt("con", 10);
                int dex = loadGame.getInt("dex", 10);
                int inte = loadGame.getInt("int", 10);
                int wis = loadGame.getInt("wis", 10);
                int cha = loadGame.getInt("cha", 10);
                name.setText(characterName);
                strField.setText(Integer.toString(str));
                conField.setText(Integer.toString(con));
                dexField.setText(Integer.toString(dex));
                intField.setText(Integer.toString(inte));
                wisField.setText(Integer.toString(wis));
                chaField.setText(Integer.toString(cha));


                athletics.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(strField.getText().toString()))));
                // Integer.parseInt(conField.getText().toString());
                acrobatics.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(dexField.getText().toString()))));
                stealth.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(dexField.getText().toString()))));
                sleightOfHand.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(dexField.getText().toString()))));
                arcana.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
                nature.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
                history.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
                religion.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
                investigation.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
                animalHandling.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
                perception.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
                insight.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
                survival.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
                medicine.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
                deception.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(chaField.getText().toString()))));
                performance.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(chaField.getText().toString()))));
                intimidation.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(chaField.getText().toString()))));
                persuasion.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(chaField.getText().toString()))));
                Toast.makeText(getApplicationContext(),
                "Character sheet loaded!",
                Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_save:

                SharedPreferences savedGame = getSharedPreferences(Save, MODE_PRIVATE);
                SharedPreferences.Editor editor = savedGame.edit();
                editor.putString("name", name.getText().toString());
                editor.putInt("str", Integer.parseInt(strField.getText().toString()));
                editor.putInt("con", Integer.parseInt(conField.getText().toString()));
                editor.putInt("dex", Integer.parseInt(dexField.getText().toString()));
                editor.putInt("int", Integer.parseInt(intField.getText().toString()));
                editor.putInt("wis", Integer.parseInt(wisField.getText().toString()));
                editor.putInt("cha", Integer.parseInt(chaField.getText().toString()));
                editor.apply();
                Toast.makeText(getApplicationContext(),
                "Character sheet saved!",
                Toast.LENGTH_SHORT).show();
            case R.id.calculate:



                athletics.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(strField.getText().toString()))));
                // Integer.parseInt(conField.getText().toString());
                acrobatics.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(dexField.getText().toString()))));
                stealth.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(dexField.getText().toString()))));
                sleightOfHand.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(dexField.getText().toString()))));
                arcana.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
                nature.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
                history.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
                religion.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
                investigation.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(intField.getText().toString()))));
                animalHandling.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
                perception.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
                insight.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
                survival.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
                medicine.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(wisField.getText().toString()))));
                deception.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(chaField.getText().toString()))));
                performance.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(chaField.getText().toString()))));
                intimidation.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(chaField.getText().toString()))));
                persuasion.setText(Integer.toString(Player.calculateAbilityModifier(Integer.parseInt(chaField.getText().toString()))));

        }
        if (id == R.id.menu_save) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText("");
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch(position) {
                case 0:
                    return PlaceholderFragment.newInstance(position + 1);
                case 1:
                    return DiceRoller.newInstance();
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.title_section1).toUpperCase(l);
                case 1:
                    return getString(R.string.title_section2).toUpperCase(l);
            }
            return null;
        }
    }




}

