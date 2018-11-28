package com.example.israil.cinmatica;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.swipeRight;
import static android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static android.support.test.espresso.contrib.RecyclerViewActions.scrollToPosition;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest3() {
        ViewInteraction tabView = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.tabs),
                                0),
                        1),
                        isDisplayed()));
        tabView.perform(MyViewActions.click());

        ViewInteraction viewPager = onView(
                allOf(withId(R.id.container),
                        childAtPosition(
                                allOf(withId(R.id.main_content),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                1),
                        isDisplayed()));
        viewPager.perform(swipeLeft());
//swipe left
        ViewInteraction tabView2 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.tabs),
                                0),
                        2),
                        isDisplayed()));
        tabView2.perform(MyViewActions.click());
//tab click
        ViewInteraction viewPager2 = onView(
                allOf(withId(R.id.container),
                        childAtPosition(
                                allOf(withId(R.id.main_content),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                1),
                        isDisplayed()));
        viewPager2.perform(swipeLeft());
//swipe left
        ViewInteraction tabView3 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.tabs),
                                0),
                        1),
                        isDisplayed()));
        tabView3.perform(MyViewActions.click());
//tab click
        ViewInteraction viewPager3 = onView(
                allOf(withId(R.id.container),
                        childAtPosition(
                                allOf(withId(R.id.main_content),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                1),
                        isDisplayed()));
        viewPager3.perform(swipeRight());
//swipe right
        ViewInteraction tabView4 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.tabs),
                                0),
                        0),
                        isDisplayed()));
        tabView4.perform(MyViewActions.click());

        ViewInteraction viewPager4 = onView(
                allOf(withId(R.id.container),
                        childAtPosition(
                                allOf(withId(R.id.main_content),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                1),
                        isDisplayed()));
        viewPager4.perform(swipeRight());
//swipe right
        ViewInteraction tabView5 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.tabs),
                                0),
                        1),
                        isDisplayed()));
        tabView5.perform(MyViewActions.click());

        ViewInteraction viewPager5 = onView(
                allOf(withId(R.id.container),
                        childAtPosition(
                                allOf(withId(R.id.main_content),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                1),
                        isDisplayed()));
        viewPager5.perform(swipeLeft());

        ViewInteraction tabView6 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.tabs),
                                0),
                        2),
                        isDisplayed()));
        tabView6.perform(MyViewActions.click());

        ViewInteraction viewPager6 = onView(
                allOf(withId(R.id.container),
                        childAtPosition(
                                allOf(withId(R.id.main_content),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                1),
                        isDisplayed()));
        viewPager6.perform(swipeLeft());

        ViewInteraction tabView7 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.tabs),
                                0),
                        1),
                        isDisplayed()));
        tabView7.perform(MyViewActions.click());

        ViewInteraction viewPager7 = onView(
                allOf(withId(R.id.container),
                        childAtPosition(
                                allOf(withId(R.id.main_content),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                1),
                        isDisplayed()));
        viewPager7.perform(swipeRight());

        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view2),
                        childAtPosition(
                                withId(R.id.constraintLayout),
                                0)));
        recyclerView.perform(scrollToPosition(0));
        recyclerView.perform(actionOnItemAtPosition(0,click()));
//scroll to position 0 and click
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }


}
