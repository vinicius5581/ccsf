// Homework-3
// P3.38 (page 133)[10 pt
import java.util.Scanner;

public class DoorsSystem {
   public static void main(String[] args) {
       Scanner myKeyboard = new Scanner(System.in);
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

       //Open Both
       // dash right 11010000P
       //            00010101P

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


       if ((gear == 'P' || gear == 'p') && master_unlock == '1') {
            if ((dashboard_left_switch == '1' || outside_left_handle == '1') || (child_lock == '0' && inside_left_handle == '1')) {
                left_door_state = 1;
                System.out.println("Left door opens");
            }
           if ((dashboard_right_switch == '1' || outside_right_handle == '1') || (child_lock == '0' && inside_right_handle == '1')) {
               right_door_state = 1;
               System.out.println("Right door opens");
            }
           if (left_door_state == 0 && right_door_state == 0){
               System.out.println("Booth doors stay closed");
           }
       } else {
           System.out.println("Booth doors stay closed");
       }
   }
}
