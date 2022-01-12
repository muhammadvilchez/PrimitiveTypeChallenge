package com.company;

public class Main {

    public static void main(String[] args) {
        /** Challenge */
        byte myByteChallengeValue = 65;
        short myShortChallengeValue = 1245;
        int myIntChallengeValue = 124576;
        long myLongChallengeValue = 50000 + (10 * (myByteChallengeValue + myShortChallengeValue + myIntChallengeValue));

        System.out.print(myLongChallengeValue);
        /** End of Challenge */
    }
}
