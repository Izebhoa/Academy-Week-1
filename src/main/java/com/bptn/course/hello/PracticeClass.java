package com.bptn.course.hello;

public class PracticeClass {

//SWITCH STMT	
	    public static void main(String[] args) {
	        for(int i = 0; i < 10; i++) {
	            if(i == 4) {
	                break;
	            }
	            System.out.println(i);
	        }
	        System.out.println("We've broken out of the loop!");
	    }
}
// For i, the count will keep iterating until  i == 4
// It will print "0, 1, 2, 3, then when i ==4, the loop breaks and then prints "We've broken out of the loop!" .
