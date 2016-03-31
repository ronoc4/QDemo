package com.conor;

/**
 * Created by conor on 3/30/16.
 */
public class Queue {
    //Array to hold the queue
    char q[];
    int putloc, getloc; //indices for put and get

    Queue(int size) {
        q = new char[size]; //store in memory
        putloc = getloc = 0; //set to both index same element
    }

    //Put a character into the queue
    void put (char ch) {
        if(putloc == q.length) {
            System.out.println(" - Queue is full");
            return;
        }
        q[putloc++] = ch;
    }

    //get character from queue
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }
}
