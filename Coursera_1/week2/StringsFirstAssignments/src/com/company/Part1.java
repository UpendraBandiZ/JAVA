package com.company;

public class Part1 {
   String findSimpleGene(String DNA){
       if(DNA.contains("ATG") && DNA.contains("TAA")){
           int startCodon=DNA.indexOf("ATG");
           int endCodon=DNA.indexOf("TAA");
           if((endCodon-startCodon)%3==0)
             return DNA.substring(startCodon,endCodon+3);
       }
        return "";
    }
   void testSimpleGene(){

       String s1="HSATTUIEIUVRIEDTAAU";// DNA with no “ATG
       System.out.println("DNA String is "+s1);
       System.out.println("Gene is "+findSimpleGene(s1));
       String s2="EDEATGIRNUIOEXN";//DNA with no “TAA”
       System.out.println("DNA String is "+s2);
       System.out.println("Gene is "+findSimpleGene(s2));
       String s3="HUEDNEFRIUBC";//DNA with no “ATG” or “TAA”
       System.out.println("DNA String is "+s3);
       System.out.println("Gene is "+findSimpleGene(s3));
  /* below string DNA with ATG, TAA and the substring between them
       is a multiple of 3 (a gene)
        */
       String s4="IUATGJRIEHTVDETAAFR";
       System.out.println("DNA String is "+s4);
       System.out.println("Gene is "+findSimpleGene(s4));
       /* below DNA with ATG, TAA and
       the substring between them is not a multiple of 3.*/
       String s5="DUEDDDEATGHEIDGFGTAA";
       System.out.println("DNA String is "+s5);
       System.out.println("Gene is "+findSimpleGene(s5));

   }
    public static void main(String[] args) {
        Part1 part1=new Part1();
        part1.testSimpleGene();

    }
}
