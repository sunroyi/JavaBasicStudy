package sun.controller;

public class main {

    public static void main(String[] args){

        String str1 = "abc";
        StringBuilder sb = new StringBuilder();
        sb.append("abc");

        System.out.println(str1.equals(sb.toString()));
        System.out.println(str1==sb.toString());
    }
}
