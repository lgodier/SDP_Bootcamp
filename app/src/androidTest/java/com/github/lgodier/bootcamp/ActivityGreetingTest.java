package com.github.lgodier.bootcamp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ActivityGreetingTest {

    @Test
    public void test(){
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), activity_greeting.class);
        intent.putExtra("mainName", "Luna");

        try{
            ActivityScenario<Activity> act = ActivityScenario.launch(intent);
            ViewInteraction hello_luna = onView(ViewMatchers.withId(R.id.textView)).check(
                    matches(withText("Hello Luna")));

        } catch (Exception e){
            Log.e("GreetingActivityTest", "Error lauching activity: ${e.message}");
        }

    }
}
