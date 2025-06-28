import java.util.Arrays;
import java.util.Scanner;

public class CaligraphyPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print number of String (N):");
        int n = sc.nextInt();
        String[] CaliString = new String[n];

        for(int i = 0; i < n; i++){
            System.out.println("Print " + i + " String of cali");
            CaliString[i] = sc.next();
        }
        System.out.println("Print number of String (Q):");
        int Q = sc.nextInt();
        String[] cutomerString = new String[Q];
        
        for(int i = 0; i < Q; i++){
            System.out.println("Print " + i + " String of customer");
            cutomerString[i] = sc.next();
        }

        checkAnogram(CaliString,cutomerString);
    }

    public static void checkAnogram(String[] CaliString, String[] cutomerString){

        for (String custStr : cutomerString) {
            char[] chars1 = custStr.toCharArray();
            Arrays.sort(chars1);
            String sortedorginal = new String(chars1);
            int count = 0;
            for (String caliStr : CaliString) {

                if (custStr.length() > caliStr.length()) continue;

                String prefix = caliStr.substring(0, custStr.length());
                char[] chars = prefix.toCharArray();
                Arrays.sort(chars);
                String sortedprefix = new String(chars);

                if(sortedorginal.equals(sortedprefix)){

                    count++;
                }
            }

            if (count == 0) {
                System.out.println("-1");

            }else{

                System.out.println(count);
            }
        }
    }
}
