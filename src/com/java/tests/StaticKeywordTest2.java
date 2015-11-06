package com.java.tests;

/**
 * Created by temo on 11/6/15.
 */
class StaticKeywordTest {
    private static StaticKeywordTest staticKeywordTest;

    public static void main(String[] args) {
        StaticKeywordTest.getStaticMeaning(StaticKeywordTest.staticKeywordTest);

        System.out.println(staticKeywordTest);
        System.out.println(StaticKeywordTest.getStaticMeaning(StaticKeywordTest.staticKeywordTest));
    }

    private static StaticKeywordTest getStaticMeaning(StaticKeywordTest staticKeywordTest) {
        return StaticKeywordTest.staticKeywordTest;
    }
}
class classLevelTwo{
    public static void main(String[] args) {
        String strLevelFive = "I am string of class level 5";
    }
    private static class classLevelThree{
        String strLevelFive = "I am string of class level 5";
        private class classLevelFour{
            String strLevelFive = "I am string of class level 5";
            protected class classLevelFive{
                String strLevelFive = "I am string of class level 5";
            }
        }
    }
}

