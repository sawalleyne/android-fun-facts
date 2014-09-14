package com.whitehead.scott.funfacts;

import java.util.Random;

/**
 * Created by scott on 9/12/2014.
 */
public class FactBook {
    public String getFact() {
        String mFact = "";
        // Randomly choose a fact
        String[] mFacts = {
                "This is an example of a fun fact.",
                "Ants stretch when they wake up in the morning.",
                "Ostriches can run faster than horses.",
                "Olympic gold medals are actually made mostly of silver.",
                "You are born with 300 bones; by the time you are an adult you will have 206.",
                "It takes about 8 minutes for light from the Sun to reach Earth.",
                "Some bamboo plants can grow almost a meter in just one day.",
                "The state of Florida is bigger than England.",
                "Some penguins can leap 2-3 meters out of the water.",
                "On average, it takes 66 days to form a new habit.",
                "Mammoths still walked the earth when the Great Pyramid was being built.",
                "Treehouse.com is not really in a tree house.",
                "Love is blind, but marriage is a real eye opener!"};

        Random randomGenerater = new Random();
        int randomNumber = randomGenerater.nextInt(mFacts.length);
        mFact = randomNumber + "";


        mFact = mFacts[randomNumber];

        return mFact;

    }
}
