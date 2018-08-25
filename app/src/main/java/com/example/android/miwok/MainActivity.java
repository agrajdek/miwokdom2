/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = findViewById(R.id.numbers);
        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView phrases = findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        TextView family = findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView colors = findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        ArrayList <Word> englishNumbers = new ArrayList<Word>();

//        Word w1 = new Word("lutti", "one");
//        englishNumbers.add(w1); - szybciejsza poniższa wersja

        englishNumbers.add(new Word("lutti", "one"));
        englishNumbers.add(new Word("otiiko", "two"));
        englishNumbers.add(new Word("tolookosu", "three"));
        englishNumbers.add(new Word("oyyisa", "four"));
        englishNumbers.add(new Word("massokka", "five"));
        englishNumbers.add(new Word("temmokka", "six"));
        englishNumbers.add(new Word("kenekaku", "seven"));
        englishNumbers.add(new Word("kawinta", "eight"));
        englishNumbers.add(new Word("wo'e", "nine"));
        englishNumbers.add(new Word("na'aacha", "ten"));

//        LinearLayout numbersView = (LinearLayout) findViewById(R.id.numbers);

        for (int index = 0; index < englishNumbers.size(); index++) {
            TextView wordView = new TextView(this);         // numbersView.addView(wordView);
            wordView.setText(englishNumbers.get(index).getDefaultTranslation());
        }

        WordAdapter itemsAdapter = new WordAdapter(this, englishNumbers);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }





//        int index = 0;
//
//        while (index < 10) {
//            Log.v("Index: " + index + " Value: " + englishNumbers.get(index));
//
//            index++;
//        }
//    }

//    public void openNumbers(View view) {
//        Intent intent = new Intent(this, NumbersActivity.class);
////        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
////        }
//    }
//
//    public void openFamilyMembers(View view) {
//        Intent intent = new Intent(this, FamilyActivity.class);
//        startActivity(intent);
//    }
//
//    public void openColors(View view) {
//        Intent intent = new Intent(this, ColorsA  ctivity.class);
//        startActivity(intent);
//    }
//
//    public void openPhrases(View view) {
//        Intent intent = new Intent(this, PhrasesActivity.class);
//        startActivity(intent);
//    }
}
