package com.comac.java;

import java.util.ArrayList;

/**
 * @date 2021/4/3-21:46
 */
public class hellp {
    public static void main(String[] args){
        int num1=111111111111,num2=4;
        //模板sout soutp soutm soutv  xxx.sout  fori iter test
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("hellp.main");
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        ArrayList list=new ArrayList();
        list.add(1);
        list.add(3);
        for (Object o : list) {
            System.out.println(o);
        }


    }
}