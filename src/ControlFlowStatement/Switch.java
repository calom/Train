package ControlFlowStatement;

public class Switch {

    public static void main(String[] args) {
        // write your code here
        char switchValue = 'A';

        switch (switchValue) {
            case 'A':
                System.out.println("Letter " + switchValue);
                break;
//Takto viem pekne setrit pisanie, kod aj kopirovanie toho isteho dookola. ak to v tomto pripade iba vypisuje
//            a nic ine
            case 'B': case 'C': case 'D': case 'E':
                System.out.println("Letter " + switchValue);
                break;

            default:
                System.out.println("U brake the thing with " + switchValue);
                break;


        }


        String month = "jANuary";
//        Method of of STring to use in switch. This is good to do if user would be submitting from keyboard(console) the value, and there is huge chance he write JanuarY or janUary and so on.
//        and in switch u just check for lower case, since you change anything which is inside that switch to lowercase.
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("toLowerCase works just fine  ");
                break;
            default:
                System.out.println("u nuts for sure");

        }


    }
}
