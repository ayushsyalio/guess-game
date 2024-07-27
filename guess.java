package com.company;

import java.util.*;

class game{
    public int a, b, c=0;

    public int guess(){
        Random random = new Random();
        b = random.nextInt(0,101);
        return b;


    }

    public void userinput() {
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Guess the number");
            a = sc.nextInt();

            if (a < b) {
                System.out.println("Enter bigger number");
            } else if (a > b) {
                System.out.println("Enter smaller number");

            }
            c++;
        } while (a != b);
    }
    public void isCorrectnumber(){
        if (a==b){
            System.out.println("Correct guess!!!");
        }


    }

    public void numberofGuess(){
        System.out.println("total number of guess :" + c);
        if(c<3){
            System.out.println("Great guess!!!!");
        } else if (c>3 && c<7) {
            System.out.println("Good!");

        }else {
            System.out.println("can do better :/");
        }

    }

}

public class guess {
    public static void main(String[] args) {
        game player = new game();
        player.guess();
        player.userinput();
        player.isCorrectnumber();
        player.numberofGuess();
    }
}
