package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        if (text.length() == 0) {
            System.out.println("Программа завершена.");
            System.exit(0);
        }


        Pattern p = Pattern.compile("\\s?\\W+\\s?+\\W+\\s?");
        StringBuilder builder = new StringBuilder();
        Matcher m = p.matcher(text);
        while (m.find()) {
            builder.append(m.group());
            builder.append(" _ ");
        }


        System.out.println("Строки из символов: " + builder.toString());
        String bstr = builder.toString();
        String[] sbbstr = bstr.split("_");

        int max=0;
        for (int i = 0; i < sbbstr.length - 1; i++) {
            if(sbbstr[i].length()>max){
                max=sbbstr[i].length();
            }
        }
        for (int i = 0; i < sbbstr.length - 1; i++) {
            if(sbbstr[i].length()==max){
                System.out.println("Максимальная первая подстрока: "+sbbstr[i]); break;
            }
        }

        System.out.println("------------------------------");
    }

}
