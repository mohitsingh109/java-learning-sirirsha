package com.javalearning.datastructure.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StringsDS {

    //Reverse a String: Reverse the characters in a string.

    public static String reverseString(String input) {
        //[M, o, h, i, t]
        // |           |
        //[t,i,h,o,M]
        //result = ""
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            //swap
            char temp = charArray[left]; //M
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        //Time Complexity: O(N)
        //Space Complexity: O(N)

        return new String(charArray);
    }

    //Palindrome Check: Check if a string reads the same forwards and backwards.
    //MAM, BANAB, ABCD

    public static boolean isPalindrome(String input) {
        //input = [M A C D A M]
        //reverse = [MAM]
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if(input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

        //Time Complexity: O(N)
        //Space Complexity: O(1)
    }

    //Find Duplicates: Find duplicate characters in a string.
    public static void findDuplicates(String str) {
        //M O M M D A O A A
        // M - 3
        // O - 2
        // D - 1
        // A - 3

        //A A B B C C D D ==> N

        Set<Character> characters = new HashSet<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // if this ch is already printed i'll not process it again
            if(characters.contains(ch)) {
                continue;
            }
            for(int j = i + 1; j < str.length(); j++) {
                if(ch == str.charAt(j)) {
                    System.out.println(ch); // A
                    characters.add(ch); //[A, B, C, D]
                    break;
                }
            }
        }

        // Time Complexity: O(N^2) ==> O(N)
        // Space Complexity: O(N) ==> O(N)

    }

    public static void findDuplicatesWithHashMap(String str) {
        // A B C D
        //M O M M D A O A A
        // {
        //   M : 3
        //   O : 2
        //   D : 1
        //   A : 3
        // }
        Map<Character, Integer> map = new LinkedHashMap<>(); // {A: 1, B: 1, C: 1, D: 1}

        for(int i = 0; i < str.length(); i++) { // N
            char ch = str.charAt(i);
//            if(!map.containsKey(ch)) {
//                map.put(ch, 1);
//            } else {
//                int currentCount = map.get(ch) + 1;
//                map.put(ch, currentCount);
//            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch: map.keySet()) {
            if(map.get(ch) > 1) {
                System.out.println(ch);
            }
        }

        // Time Complexity: O(N)
        // Space Complexity: O(N)

    }

    //Character Frequency: Count the occurrences of each character in a string.

    //Find the First Non-Repeating Character
    // A A B C B D B
    /**
     * A - 2
     * B - 3
     * C - 1
     * D - 1
     * */

    public static void findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++) { // N
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch: map.keySet()) {
            if(map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }

    //Check if Two Strings are Anagrams
    /**
     * s1 = "ABCDC" // [A, B, C, C, D]
     * s2 = "CDACB" // [A, B, C, C, D]
     * */

    /**
     * s1 = "ABCDCE"
     *
     * {
     *      A: 1
     *      B: 1
     *      C: 2
     *      D: 1
     *      E : 1
     * }
     *
     * s2 = "FCDACB"
     *
     * {
     *     A : 0
     *     B : 0
     *     C : 0
     *     D : 0
     *     E : 1
     * }
     *
     */

    public static boolean isAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray(); //N
        char[] arr2 = s2.toCharArray(); //N

        Arrays.sort(arr1); // NLog(N)
        Arrays.sort(arr2); // NLog(N)

        return Arrays.equals(arr1, arr2); // N

        // Space: O(N)
        // Time: O(NLog(N))
    }

    public static boolean isAnagramsUsingHashMap(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if(!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
            if(map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        //Time Complexity: O(N)
        //Space: O(N)

        return map.isEmpty();
    }

    // S1 = "AB  A     BA" [A B A N B A] ignoreCh = 'N'

    public static boolean isPalindrome(String input, char ignoreCh) {
        //input = [M A C D A M]
        //reverse = [MAM]
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            if(input.charAt(left) == ignoreCh) {
                left++;
                continue;
            }

            if(input.charAt(right) == ignoreCh) {
                right--;
                continue;
            }

            if(input.charAt(left) != input.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;

        //Time Complexity: O(N)
        //Space Complexity: O(1)
    }


    // Return all unique char from string
    // str = "A M A D F A F E E"
    //[M, D]

    //"A man, a plan, a canal: Panama" // true

    public static boolean isPalindromeWithSpaceAndComma(String input) {
        //input = [M A C D A M]
        //reverse = [MAM]
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            if(input.charAt(left) == ' ' || input.charAt(left) == ',' || input.charAt(left) == ':') {
                left++;
                continue;
            }

            if(input.charAt(right) == ' ' || input.charAt(right) == ',' || input.charAt(right) == ':') {
                right--;
                continue;
            }

            char leftCh = Character.toUpperCase(input.charAt(left)); //P
            char rightCh = Character.toUpperCase(input.charAt(right)); //P

            //P != P
            if(leftCh != rightCh) {
                return false;
            }

            left++;
            right--;
        }

        return true;

        //Time Complexity: O(N)
        //Space Complexity: O(1)
    }

    //[amanaP]
    //[Amanap]


    public static void main(String[] args) {
        String name = "Mohit"; // String literal
        //tihoM
        String test = new String("Mohit"); //create string object outside of pool
        char[] name1 = {'M', 'o', 'h', 'i', 't', ' ', 'A', 'B', 'C'};

//        System.out.println(reverseString("Mohit"));
//        System.out.println(reverseString("ABCD"));
//
//        System.out.println(isPalindrome("MAM"));
//        System.out.println(isPalindrome("KARAK"));

        //findDuplicatesWithHashMap("MOMMDAOAA");
        //findFirstNonRepeatingChar("AABCBDB");

        //System.out.println(isAnagramsUsingHashMap("ABCDC", "CDACB"));
        System.out.println(isPalindromeWithSpaceAndComma("A man, a plan, a canal: Panama"));
    }
}
