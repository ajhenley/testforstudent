package com.byaj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //   |aksalA
        String mystring = "Alaska is cold too";
        String myreversedstring = "";
        for (int i = 0; i <= mystring.length()-1; i++)
        {
            myreversedstring = mystring.charAt(i) + myreversedstring ;
        }
        System.out.println(myreversedstring);

        myreversedstring = "";
        for (int i = mystring.length()-1; i>=0; i--)
        {
            myreversedstring = myreversedstring + mystring.charAt(i);
        }

        System.out.println(myreversedstring);
    }
}
