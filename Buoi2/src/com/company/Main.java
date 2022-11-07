package com.company;

import java.lang.String;
import java.util.HashMap;

public class Main {
    //--------------1108--------------------//
    static String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for (char s : address.toCharArray()) {
            if (s == '.') {
                str.append('[').append(s).append(']');
            } else {
                str.append(s);
            }
        }
        return str.toString();
    }

    //---------------2011------------------------//
    static int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String i : operations) {
            if (i.equalsIgnoreCase("++X") || i.equalsIgnoreCase("X++"))
                sum++;
            else
                sum--;
        }
        return sum;
    }

    //-------------2114-------------------//
    static int mostWordsFound(String[] sentences) {
        int num = 0;
        for (String i : sentences) {
            String[] word = i.split(" ");
            int numWord = word.length;
            if (num < numWord) num = numWord;
        }
        return num;
    }

    //---------------------771------------------//
    static int numJewelsInStones(String jewels, String stones) {
        int sum = 0;
        for (char jw : jewels.toCharArray()) {
            for (char i : stones.toCharArray()) {
                if (i == jw) {
                    sum++;
                }
            }
        }
        return sum;
    }

    //-------------------1678----------------------//
    public String interpret(String command) {
        String str = command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
        return str;
    }
    //----------------2325----------------------///

    static String decodeMessage(String key, String message) {
        HashMap<Character, Character> table = new HashMap<Character, Character>();

        char input[] = key.toCharArray();
        char j = 'a';
        for (int i = 0; i < input.length; ++i) {
            if (input[i] == ' ') continue;
            if (!table.containsKey(input[i])) {
                table.put(input[i], j);
                j += 1;
            }
        }
        String result = "";

        for (char i : message.toCharArray()) {

            result += table.getOrDefault(i, ' ');
        }
        return result;
    }

    //--------------------1221---------------------------//
     static int balancedStringSplit(String s) {
        int min= 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') min++;
            if (c == 'L') min--;
            if (min == 0) count++;
        }
        return count;
    }
    //---------------------1859-------------//
    public String sortSentence(String s) {
        String[] array = s.split(" ");
        int length = array.length;
        String[] newArray = new String[length];
        for (int i = 0; i < length; i++) {
            int wordLength = array[i].length();
            String word = array[i].substring(0, wordLength - 1);
            int index = array[i].charAt(wordLength - 1) - '0' - 1;
            newArray[index] = word;
        }
        StringBuffer sb = new StringBuffer(newArray[0]);
        for (int i = 1; i < length; i++)
            sb.append(" " + newArray[i]);
        return sb.toString();
    }
    //------------557--------------//



    public static void main(String[] args) {
        //-----------1108----------//
        System.out.println("-------1108--------");
        System.out.println(defangIPaddr("1.1.1.1"));
        //---------2011-------------//
        String[] s = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(s));
        //----------2114---------------//
        String[] s1 = {"van a", "binh v", "nghiem"};
        System.out.println(mostWordsFound(s1));
        //-----------------771---------------//
        //------------2325-----------------//
        String s2 = "the quick brown fox jumps over the lazy dog";
        String s3 = "vkbs bs t suepuv";
        System.out.println(decodeMessage(s2, s3));
        //--------------1859-----------------//

    }
}
