// Homework-3
// P3.26 (page 130)[10 pts.], P3.28 (page 130)[10pts.], P3.38 (page 133)[10 pts.].
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner myKeyboard = new Scanner(System.in);

       int exercise;
       System.out.print("Please input 1 for P3.26, 2 for P3.28 or 3 for P3.38: ");
       exercise = myKeyboard.nextInt();

       if (exercise == 1) {
           // P3.26 (page 130)[10 pts.]
           System.out.println("P3.26 (page 130)[10 pts.]");

           int number;
           int mod;
           int qty;

           System.out.print("Please enter a positive integer up to 3,999 to be converted into the romain system: ");
           number = myKeyboard.nextInt();

           if (number > 0 && number < 3999) {
               if (number / 1000 > 0) {
                   qty = number / 1000;
                   for (int i = 0; i < qty; i++) {
                       System.out.print("M");
                   }
                   number = number % 1000;
               }
               if (number / 500 > 0) {
                   mod = (number % 500) / 100;
                   switch (mod) {
                       case 0:
                           System.out.print("D");
                           break;
                       case 1:
                           System.out.print("DC");
                           break;
                       case 2:
                           System.out.print("DCC");
                           break;
                       case 3:
                           System.out.print("DCCC");
                           break;
                       case 4:
                           System.out.print("CM");
                           break;
                   }
                   number = number % 500 - mod * 100;
               }
               if (number / 100 > 0) {
                   if (number / 100 != 4) {
                       qty = number / 100;
                       for (int i = 0; i < qty; i++) {
                           System.out.print("C");
                       }
                   } else {
                       System.out.print("CD");
                   }
                   number = number % 100;
               }

               if (number / 50 > 0) {
                   mod = (number % 50) / 10;
                   switch (mod) {
                       case 0:
                           System.out.print("L");
                           break;
                       case 1:
                           System.out.print("LX");
                           break;
                       case 2:
                           System.out.print("LXX");
                           break;
                       case 3:
                           System.out.print("LXXX");
                           break;
                       case 4:
                           System.out.print("XC");
                           break;
                   }
                   number = number % 50 - mod * 10;
               }


               if (number / 10 > 0) {
                   if (number / 10 == 4) {
                       System.out.print("XL");
                   } else {
                       qty = number / 10;
                       for (int i = 0; i < qty; i++) {
                           System.out.print("X");
                       }
                   }
                   number = number % 10;
               }

               switch (number) {
                   case 1:
                       System.out.print("I");
                       break;
                   case 2:
                       System.out.print("II");
                       break;
                   case 3:
                       System.out.print("III");
                       break;
                   case 4:
                       System.out.print("IV");
                       break;
                   case 5:
                       System.out.print("V");
                       break;
                   case 6:
                       System.out.print("VI");
                       break;
                   case 7:
                       System.out.print("VII");
                       break;
                   case 8:
                       System.out.print("VIII");
                       break;
                   case 9:
                       System.out.print("IX");
                       break;
               }
           } else {
               System.out.println("Only numbers between 1 and 3,999 are represented");
           }

           // End of Program

       } else if (exercise == 2) {
           // P3.28 (page 130)[10pts.]
           System.out.println("P3.28 (page 130)[10pts.]");

           int year;

           System.out.print("Please enter the year that you want to check if it is a leap year: ");
           year = myKeyboard.nextInt();
           if (year % 4 == 0 && (!(year % 100 == 0) || year % 400 == 0)) {
               System.out.println("The year " + year + " IS a leap year");
           } else {
               System.out.println("The year " + year + " ISN'T a leap year");
           }

           // End of Program

       } else if (exercise == 3) {
           // P3.38 (page 133)[10 pts.]
           System.out.println("P3.38 (page 133)[10 pts.]");

           //Open Left
           // dash left:  10010000P
           //             10110000P
           // out left:   00010100P
           //             00110100P
           // ins left:   00011000P

           //Open Right
           // dash right: 01010000P
           //             01110000P
           // out right:  00010001P
           //             00110001P
           // ins right:  00010010P

           String doors_system_state;
           char dashboard_left_switch;
           char dashboard_right_switch;
           char child_lock;
           char master_unlock;
           char inside_left_handle;
           char outside_left_handle;
           char inside_right_handle;
           char outside_right_handle;
           char gear;
           int left_door_state = 0;
           int right_door_state = 0;

           System.out.print(
                   "Input the states of each one of the following on the same order as listed bellow:\n\n" +
                           "* Use 0 for off or 1 for activated\n" +
                           "* For the gear user P N D 1 2 3 R \n\n" +
                           "- Dashboard left switch.  \n" +
                           "- Dashboard right switch. (Use 0 for off or 1 for activated) \n" +
                           "- Child lock. (Use 0 for off or 1 for activated) \n" +
                           "- Master unlock. (Use 0 for off or 1 for activated)\n" +
                           "- Inside left handle. (Use 0 for off or 1 for activated)\n" +
                           "- Outside left handle. (Use 0 for off or 1 for activated)\n" +
                           "- Inside right handle? (Use 0 for off or 1 for activated)\n" +
                           "- Outside right handle? (Use 0 for off or 1 for activated)\n" +
                           "- Gear on.\n\n" +
                           "IMPORTANT: There should be no white spaces on your input.\n" +
                           "e.g.: 00101000P\n" +
                           "> "
           );

           doors_system_state = myKeyboard.next();

           dashboard_left_switch = doors_system_state.charAt(0);
           dashboard_right_switch = doors_system_state.charAt(1);
           child_lock = doors_system_state.charAt(2);
           master_unlock = doors_system_state.charAt(3);
           inside_left_handle = doors_system_state.charAt(4);
           outside_left_handle = doors_system_state.charAt(5);
           inside_right_handle = doors_system_state.charAt(6);
           outside_right_handle = doors_system_state.charAt(7);
           gear = doors_system_state.charAt(8);

           System.out.println("System State: " + doors_system_state);
           System.out.println("Dashboard Left Switch: " + dashboard_left_switch);
           System.out.println("Dashboard Right Switch: " + dashboard_right_switch);
           System.out.println("Child Lock: " + child_lock);
           System.out.println("Master Unlock: " + master_unlock);
           System.out.println("Inside Left Handle: " + inside_left_handle);
           System.out.println("Outside Left Handle: " + outside_left_handle);
           System.out.println("Inside Right Handle: " + inside_right_handle);
           System.out.println("Outside Right Handle: " + outside_right_handle);
           System.out.println("Gear: " + gear);


           if ((gear == 'P' || gear == 'p') && master_unlock == '1') {
                
                if (dashboard_left_switch == '1' || outside_left_handle == '1') {
                    System.out.println("Left door opens");
                } else if (child_lock == '0' && inside_left_handle == '1') {
                    System.out.println("Left door opens");
                }

               if (dashboard_right_switch == '1' || outside_right_handle == '1') {
                    System.out.println("Right door opens");
                } else if (child_lock == '0' && inside_right_handle == '1') {
                    System.out.println("Right door opens");
                } 


           }else {
               System.out.println("Booth doors stay closed");
           }

           // End of Program

       } else {
           System.out.println("Ops!! You need to input 1, 2 or 3");
       }

   }
}
