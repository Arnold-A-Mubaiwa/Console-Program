package com.mycompany.main;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Main {

    public static ArrayList<Character> arrowChars = new ArrayList<Character>();

    public static String toArrowsString(int[] codes){
        // that converts an array of integers into a string of the corresponding arrow chars
        String corres = "";
        for (int i = 0; i < codes.length; i++){
            if (codes[i] <= 3 ){
                corres = corres + " "+ arrowChars.get(i);
            }
            else{
                corres = corres + arrowChars.get(i);
            }
        }
        return corres;
    }
    public static String toIntegersString(char[] arrows){
        String nums = "";
        for (char arrow : arrows){
                nums = nums + " " +arrowChars.indexOf(arrow);
        }
        return nums;
    }
    
    public static void main(String[] args){
        arrowChars.add('\u2190');
        arrowChars.add('\u2191');
        arrowChars.add('\u2192');
        arrowChars.add('\u2193');
        arrowChars.add('\u21A4');
        arrowChars.add('\u21A5');
        arrowChars.add('\u21A6');
        arrowChars.add('\u21A7');
        arrowChars.add('\u21E4');
        arrowChars.add('\u21E5');
        arrowChars.add('\u2196');
        arrowChars.add('\u2197');
        arrowChars.add('\u2198');
        arrowChars.add('\u2199');

        int a[] = {1,2,6,3,2,9,12};
        char b[] = {'\u2190','\u2191','\u2192','\u2193','\u2199'};
        System.out.print(toArrowsString(a));
        System.out.print(toIntegersString(b));

    }
}
