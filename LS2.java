import java.util.Locale;

public class LS2 {
    public static void main(String[] args) {
        // Reference string : lifesight
        //input1 : ifesightl
        //input2 : ifesighlt

        String reference = "lifesight";
        String input1 = "ifesightl";
        String input2 = "ifesighlt";

        //esightil

        // lifesight


        System.out.println(check(reference, input1));
        System.out.println(check(reference, input2));
    }

    static boolean check (String ref, String input){
       boolean isMatch= false;
       char[] chr = input.toCharArray();
        System.out.println("input " + chr.toString());
       for (int i=0; i<input.length(); i++) {

           char lastChar = input.charAt(input.length() - 1);

           System.out.println(lastChar);

           input = lastChar + input.substring(0, input.length() - 1);

           System.out.println( lastChar + input.substring(1));
           if (input.equals(ref)){
               return true;
           }

       }

        return  false;
    }
}
