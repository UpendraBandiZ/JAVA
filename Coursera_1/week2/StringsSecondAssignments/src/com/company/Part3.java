package com.company;

public class Part3 {

    public int countGenes(String dna)
    {
        int index=0,count=0;
        while(true) {
            int firstIndex = dna.indexOf("atg", index);
            int lastIndex = dna.indexOf("taa", firstIndex);
            if (firstIndex == -1 || lastIndex == -1)
                break;
            else
                count++;
            index = lastIndex + 3;
        }
        return count;
    }
    public void testCountGenes()
    {
        System.out.println(countGenes("atgggtttataaatgaaggttaaaaggttatgaatggtagtaaa"));
        System.out.println(countGenes("atgtaagatgccctaagt"));
    }

    public static void main(String[] args) {
        Part3 part3=new Part3();
        part3.testCountGenes();
    }

}
