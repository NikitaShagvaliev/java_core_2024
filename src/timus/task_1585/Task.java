package timus.task_1585;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k3, k1, k2;
        k1 = k2 = k3 = 0;
        String s, s1;
        n = input.nextInt();
        for(int i = 0; i < n; ++i){
            s = input.next();
            s1 = input.next();
            if(s.equals("Emperor"))
                ++k1;
            else if(s.equals("Little"))
                ++k2;
            else
                ++k3;
        }
        if(k1 > k2 && k1 > k3)
            System.out.println("Emperor Penguin");
        else if(k2 > k1 && k2 > k3)
            System.out.println("Little Penguin");
        else if(k3 > k1 && k3 > k2)
            System.out.println("Macaroni Penguin");
    }
}