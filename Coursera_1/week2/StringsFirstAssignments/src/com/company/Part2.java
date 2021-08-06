package com.company;

import java.util.Locale;

public class Part2 {
    String findSimpleGene(String DNA,String startCodon,String stopCodon){
        /* this part2 class method works for both uppercase and lowercase strings */
        if(Character.isLowerCase(DNA.charAt(0))) {
            startCodon = startCodon.toLowerCase();
            stopCodon = startCodon.toLowerCase();
        }
        if(DNA.contains(startCodon) && DNA.contains(stopCodon)){
            int startCodonIndex=DNA.indexOf(startCodon);
            int endCodonIndex=DNA.indexOf(stopCodon);
            if((endCodonIndex-startCodonIndex)%3==0)
                return DNA.substring(startCodonIndex,endCodonIndex+3);
        }
        return "";

    }
    public  void testSimpleGene(){
        String s1="HSATTUIEIUVRIEDTAAU";
        System.out.println("DNA String is "+s1);
        System.out.println("Gene is "+findSimpleGene(s1,"ATG","TAA"));
        String s2="dusgdatghinrnrun";
        System.out.println("DNA String is "+s2);
        System.out.println("Gene is "+findSimpleGene(s2,"ATG","TAA"));
        String s3="HUEDNEFRIUBC";
        System.out.println("DNA String is "+s3);
        System.out.println("Gene is "+findSimpleGene(s3,"ATG","TAA"));
        String s4="IUATGJRIEHTVDETAAFR";
        System.out.println("DNA String is "+s4);
        System.out.println("Gene is "+findSimpleGene(s4,"ATG","TAA"));
        String s5="DUEDDDEATGHEIDGFGTAA";
        System.out.println("DNA String is "+s5);
        System.out.println("Gene is "+findSimpleGene(s5,"ATG","TAA"));
    }
    public static void main(String[] args) {

        Part2 part2=new Part2();
        part2.testSimpleGene();
    }
}
