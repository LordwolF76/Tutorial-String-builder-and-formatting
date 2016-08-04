/**
 * Created by LordwolF on 8/3/2016.
 */


public class App {
    public static void main(String[] args) {

        //inefficient
        String info = "";

        info += "My name is LordwolF.";
        info += " ";
        info += "I am a Lycan.";
        System.out.println(info);


        //more efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Joan.");
        sb.append(" ");
        sb.append("I am from Arc!");
        //sb.toString finishes it back to a new string
        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        //.append note no ; so . instead of s.
        s.append("My name is Roger")
        .append(" ")
        .append("I am a Rabbit");
        System.out.println(s.toString());

        ///// Formatting  //////////

        System.out.print("Here is some text. \tThat was a tab. \nThat was a new line");
        System.out.println("more text");


        //formatting integers
        System.out.printf("Total Cost %-10d", 5);

        for(int i=0; i<20; i++) {
            System.out.printf("%-2d: some text here\n", i);
        }
        //formatting floating points
        System.out.printf("Total Value: %.5f\n", 5.6);
        System.out.printf("Total Value: %6.5f\n", 34.56);




    }
}
