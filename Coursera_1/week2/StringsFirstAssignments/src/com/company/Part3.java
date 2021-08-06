package com.company;

public class Part3 {
    boolean twoOccurrences(String stringa,String stringb){
        if(stringb.contains(stringa)){
            if(stringb.indexOf(stringa)!=stringb.lastIndexOf(stringa)){
                return true;
            }
        }
        return false;
    }
    String lastPart(String stringa,String stringb){
        if(stringb.contains(stringa)){
            int index=stringb.indexOf(stringa);
            int lengtha=stringa.length();
            int lengthb=stringb.length();
            return stringb.substring(index+lengtha,lengthb);
        }
        return stringb;
    }

    public  void testing(){
        String sa1="by";
        String sb1="A Story by Abby Long";
        System.out.println(sa1+" "+sb1+" "+twoOccurrences(sa1,sb1));
        System.out.println("The Part of the String after "+sa1+" in "+sb1+" is "+lastPart(sa1,sb1));
        String sa2="hi";
        String sb2="hellohihi";
        System.out.println(sa2+" "+sb2+" "+twoOccurrences(sa2,sb2));
        System.out.println("The Part of the String after "+sa2+" in "+sb2+" is "+lastPart(sa2,sb2));
        String sa3="atg";
        String sb3="ctgtatgta";
        System.out.println(sa3+" "+sb3+" "+twoOccurrences(sa3,sb3));
        System.out.println("The Part of the String after "+sa3+" in "+sb3+" is "+lastPart(sa3,sb3));
        String sa4="a";
        String sb4="Banana";
        System.out.println(sa4+" "+sb4+" "+twoOccurrences(sa4,sb4));
        System.out.println("The Part of the String after "+sa4+" in "+sb4+" is "+lastPart(sa4,sb4));
    }
    public static void main(String[] args) {

        Part3 part3=new Part3();
        part3.testing();
    }
}
