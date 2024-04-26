package com.plasencia.one;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    
     public static void main(String[] args) {
         System.out.println("The Start");

         int index = 0;
         String champion = "";
         while (StdIn.isEmpty()) {
           String word = StdIn.readString();
           boolean accept = StdRandom.bernoulli(1 / (index + 1.0));
           if (accept) {
             champion = word;
           }
           index++;
         }
         StdOut.println("Champion: " + champion);

         System.out.println("The End");
     }

}
