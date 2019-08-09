package javarush.java_core_2.level8.lecture11.task11;
/*
package com.javarush.task.task18.task1826;
*/
/*
Шифровка
*/

import java.io.*;

class Solution {
    public static void main(String[] args)throws IOException {
        switch (args[0]){
            case "-e":
                BufferedReader reader  = new BufferedReader(new InputStreamReader(new FileInputStream(args[1])));
                StringBuilder sb = new StringBuilder();
                while (reader.ready()) {
                    char[] arr = reader.readLine().toCharArray();
                    for(char ch : arr){
                        String s = ch + "fekkw";
                        sb.append(s);
                    }
                    sb.append("BenderPidor");
                }
                for(int i = 0 ; i < 11 ; i++){
                    sb.deleteCharAt(sb.length() - 1 );
                }
                reader.close();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[2])));
                bufferedWriter.write(sb.toString());
                bufferedWriter.flush();
                bufferedWriter.close();
                System.out.println(sb.toString());
                break;
            case "-d":
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[1])));
                StringBuilder stringBuilder = new StringBuilder();
                while(bufferedReader.ready()){
                    stringBuilder.append(bufferedReader.readLine());
                }
                bufferedReader.close();
                BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[2])));
                String[] arr = stringBuilder.toString().replaceAll("fekkw","").split("BenderPidor");
                for(int i = 0 ; i < arr.length ; i++){
                    if (i == arr.length - 1){
                        bufferedWriter1.write(arr[i]);
                        bufferedWriter1.newLine();
                    } else {
                        bufferedWriter1.write(arr[i]);
                        bufferedWriter1.newLine();
                    }
                }
                bufferedWriter1.close();
        }
    }

}

