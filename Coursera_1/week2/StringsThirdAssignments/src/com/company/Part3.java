package com.company;
import edu.duke.*;


public class Part3{
    public float cgRatio(String dna)
        {
            float cgRatio;
            int count=0;
            for(int i=0;i<dna.length();i++)
            {
                if(dna.charAt(i)=='c' || dna.charAt(i)=='g')
                    count++;
            }
            cgRatio=(float)count/dna.length();
            return cgRatio;
        }
        public void processGenes(StorageResource sr) {
            int lCount = 0, cgCount = 0;

            for (String s : sr.data()) {

                if (s.length() > 9) {
                    System.out.println("Length>9:" + s);
                    lCount++;
                }
                //System.out.println(cgRatio(s));
                if (cgRatio(s) > 0.35) {
                    System.out.println("CG Ratio>0.35:" + s);
                    cgCount++;
                }

            }
            System.out.println("Number of String longer than 9 charecter:" + lCount);
            System.out.println("Number of Strings whose CG Ratio is greater than 0.35:" + cgCount);

        }
        public void testProcessGenes()
        {
            StorageResource storageResource=new StorageResource();
            storageResource.add("atcgatgcatagcta");
            storageResource.add("atctg");
            storageResource.add("ccggatgcagc");
            storageResource.add("cgaaattttt");
            storageResource.add("atctagtcgtacgtaaac");
            processGenes(storageResource);

        }

        public static void main(String[] args) {
            Part3 part3=new Part3();
            part3.testProcessGenes();
        }

    }

