package com.oliverdunk.polydivisble;

import java.math.BigInteger;

public class Polydivisible {

    //This string contains all digits available, append more to check further bases.
    private static String digitList = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args){
        //TODO: Should base one be included? Solution is trivial.
        for(int i = 1; i < digitList.length(); i++){
            findPolydivisbles(i);
        }
    }

    /**
     * Finds all polydivibles within a base, with console output.
     * @param base The base which should be checked.
     */
    private static void findPolydivisbles(int base) {
        System.out.println("---------------- Base " + (base < 10 ? "0" : "") + base + " ----------------");
        long startTime = System.currentTimeMillis();
        String availableDigits = digitList.substring(0, base - 1);
        permutation("", availableDigits, base);
        System.out.println("Completed in " + (System.currentTimeMillis() - startTime) + "ms.");
        System.out.println("-----------------------------------------");
        System.out.println();
    }

    /**
     * Runs through each permutation of a base, eventually checking a solution.
     * @param prefix Output from the last permutation.
     * @param availableDigits Digits left after the previous permutation.
     * @param base The base which should be checked.
     */
    private static void permutation(String prefix, String availableDigits, int base) {
        int n = availableDigits.length();
        if(n == 0) {
            if (checkPermutation(prefix, base)) System.out.println("Solution found: " + prefix);
        }
        else {
            if(!checkPermutation(prefix, base)) return;
            for (int i = 0; i < n; i++) {
                char using = availableDigits.toCharArray()[i];
                permutation(prefix + using, availableDigits.replace(using + "", ""), base);
            }
        }
    }

    /**
     * Checks to see if a permutation is valid (is a polydivisble number).
     * @param permutation Permutation which should be checked.
     * @param base The base which should be checked.
     * @return If the permutation is polydivisible.
     */
    private static boolean checkPermutation(String permutation, int base){
        if(permutation.length() == 0) return true;
        BigInteger inBaseTen = new BigInteger(permutation, base);
        if (!inBaseTen.remainder(BigInteger.valueOf(permutation.length())).equals(BigInteger.ZERO)) return false;
        return true;
    }

}
