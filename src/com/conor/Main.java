package com.conor;

public class Main {

    public static void main(String[] args) {

        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;

        System.out.println("Using bigQ to store the alphabet.");
        //put numbers into the queue
        for(int i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        //Retrieve and display elements from bigQ
        System.out.println("Contents of bigQ: ");
        for (int i = 0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) {
                System.out.println(ch);
            }
        }

        //System.out.println("\n");
    }
}
