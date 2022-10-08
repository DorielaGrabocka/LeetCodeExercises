import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<List<Integer>> matrix = new ArrayList<>();
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        int n = Integer.parseInt(scInt.nextLine());
        for(int i = 1; i <= n; i++){
            //here we receive the input from the user
            //System.out.println("Please enter numbers of list: "+ i);
            ArrayList<Integer> listOfInt = new ArrayList<>();
            int numberofNumbers = scInt.nextInt();
            for (int j = 0; j < numberofNumbers; j++) {
                //System.out.println("Please enter number at position "+j);
                int number = scInt.nextInt();
                listOfInt.add(number);
            }
            matrix.add(listOfInt);
        }
        //System.out.println("Please enter the number of queries you want to ask: ");
        int q  = scInt.nextInt(); //number of queries
        String output = "";
        for (int j = 1; j <= q; j++) {
            //System.out.println("Please enter the row: ");
            int x = scInt.nextInt();
            //System.out.println("Please enter the column: ");
            int y = scInt.nextInt();
            try{
                Integer element = matrix.get(x-1).get(y-1);
                output+=element+"\n";
            }catch (Exception e){
                output+="ERROR!\n";
            }
        }
        output = output.substring(0, output.length()-1);
        System.out.println(output);

    }

}




