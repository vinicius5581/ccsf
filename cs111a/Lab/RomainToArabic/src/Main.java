import java.util.Scanner;

// I V X L C D M

// I II III IV V VI VII VIII IX
// X XX XXX XL L LX LXX LXXX XC
// C CC CCC CD D DC DCC DCCC CM
// M MM MMM

//Exceptions:
// IL IC  ID IM
// VX VL VC VD VM
// XD XM
// LC LD LM
// DM



public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a romain number up to 3999: ");
        String romainInput = keyboard.nextLine();

        //System.out.println(romainInput);

        char pointer;
        char nextPointer;
        int arabicNumber = 0;

        for(int i=0; i < romainInput.length(); i++){





            pointer = romainInput.charAt(i);

            if (pointer != 'I' || pointer !='V' || pointer != 'X' || pointer != 'L' || pointer != 'C' || pointer != 'D' || pointer != 'M'){

            }

            if(romainInput.length() > (i+1)){
                nextPointer = romainInput.charAt(i+1);
            } else {
                nextPointer = '0';
            }

            //System.out.println(pointer);
            if(pointer == 'M'){
                arabicNumber += 1000;
            }
            if(pointer == 'D'){
                arabicNumber += 500;
            }
            if(pointer == 'C'){
                if  (nextPointer == 'M' || nextPointer == 'D'){
                    arabicNumber -= 100;
                } else {
                    arabicNumber += 100;
                }
            }
            if(pointer == 'L'){
                arabicNumber += 50;
            }
            if(pointer == 'X'){
                if(nextPointer == 'C' || nextPointer == 'L'){
                    arabicNumber -= 10;
                } else {
                    arabicNumber += 10;
                }
            }
            if(pointer == 'V'){
                arabicNumber += 5;
            }
            if(pointer == 'I'){
                if(nextPointer == 'X' || nextPointer == 'V'){
                    arabicNumber -= 1;
                } else {
                    arabicNumber += 1;
                }
            }
        }
        System.out.println(arabicNumber);

    }
}
