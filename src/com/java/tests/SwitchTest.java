package com.java.tests;

public class SwitchTest {
    private static int XXX_FINAL;

    public static void main(String[] args) {
        SwitchTest switchTest = new SwitchTest();
        SwitchTest switchTest1 = new SwitchTest();
        switchTest.getSortOrder("Emilia", "Stone");
        System.out.println(XXX_FINAL);
        switchTest.getSortOrder2(15,123);
        switchTest1.getSortOrder2(112,56);
    }

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;

            //    case middleName: // DOES NOT COMPILE
            //        id = 5;
            //        break;
            case suffix:
                id = 0;
                break;
            /*    case lastName: // DOES NOT COMPILE
                id = 8;
                break;
            case 5: // DOES NOT COMPILE
                id = 7;
                break;
            case 'J': // DOES NOT COMPILE
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
                id=15;
                break;           */
            default:
                System.out.println(firstName + " " + lastName);
        }
        return id;
    }
    private int getSortOrder2(int firstNum, final int secNum) {
        final byte b = 15;
        short sh = 155; // Wrong: sh must be final constant like byte b
        switch (firstNum){
            case b:
                System.out.println(firstNum + secNum); break;

            // case sh: System.out.println(firstNum - secNum); break;
            // Wrong: sh must be final constant like byte b

            case 123: System.out.println(firstNum * secNum); break;
            default: System.out.println(firstNum / secNum); break;
        }
        return 0;
    }
}

