 import java.util.regex.Pattern;
 import java.util.*;

class taskOne{

    public static String reverseTheSentence(String inputString)
    {
      int n, count = 1;
      Scanner sc = new Scanner(System.in);
      System.out.print("\n");
      Pattern pattern = Pattern.compile("\\.");
        String[] words = inputString.split("\\.");
        for(String myStr: words) {
             for (int i = 0; i < myStr.length() - 1; i++)
              {

                 if ((myStr.charAt(i) == ' ') && (myStr.charAt(i + 1) != ' '))
                  {
                    count++;
                  }
              }
                System.out.println(myStr + "\n");
                System.out.println("Number of words in a string : " + count + "\n");
                count = 0;
              }

        String outputString = "";

        for (int i =words.length-1; i>=0 ;i--)
        {
            outputString = outputString + words[i] + ".";
        }
        return outputString;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input String :");

        String inputString = sc.nextLine();

        String outputString = reverseTheSentence(inputString);

        System.out.println("Input String : "+inputString + "\n");

        System.out.println("Output String : "+outputString + "\n");


    }
}
