package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cout = new Scanner(System.in);
        int n = cout.nextInt();

        CommonResource commonResource= new CommonResource();
        for (int i = 1; i <=n; i++){

                Thread t = new Thread(new CountThread(commonResource, n));
                t.setName("Member_" + i);
                t.start();

        }
    }
}

class CommonResource{
    int x=0;
}

class CountThread implements Runnable{

    CommonResource res;
    int n;
    int previous=99;

    CountThread(CommonResource res, int n){
        this.res=res;
        this.n=n;
    }
    public void run(){

        synchronized(res){

            res.x=0;

            for (int i = 0; i <= n; i++){
                //System.out.println(previous);

                if(previous==2){
                    System.out.printf("Currenly %s \n", Thread.currentThread().getName(), res.x);
                    break;
                }

                else if(res.x==previous){
                    System.out.printf("Currenly %s \nPrevious: %d and ", Thread.currentThread().getName(), res.x);
                    break;
                }

                else res.x++;

                previous = Integer.parseInt(Thread.currentThread().getName().split("_")[1]);
            }
        }
    }
}
