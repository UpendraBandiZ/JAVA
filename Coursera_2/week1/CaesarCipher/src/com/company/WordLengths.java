package com.company;
import edu.duke.FileResource;

class WordLengths {
    public void countWordLengths(FileResource fileResource,int[] counts){
        int i;
        for (String word:fileResource.words()) {
            i=word.length();
            int length=i;
            if(!Character.isLetter(word.charAt(0)))
                i--;
            if(!Character.isLetter(word.charAt(length-1)))
                i--;
            counts[i]+=1;
            System.out.println(counts[i]+" i "+i);
        }
    }
    public void testCountWordLengths(){

        FileResource resource = new FileResource();
        int[] counts=new int[31];
        countWordLengths(resource,counts);
        for(int i=1;i<31;i++) {
            System.out.print("Words of length ");
            System.out.println(i+ ":" + counts[i]);
        }
        System.out.println(indexOfMax(counts));
    }
    public int indexOfMax(int[] counts){
        int maxValue=Integer.MIN_VALUE,maxValueIndex=-1;
        for(int i=0;i<counts.length;i++) {
            if(maxValue<counts[i]){
                maxValueIndex=i;
                maxValue=counts[i];
            }
        }
        return maxValueIndex;
    }
    public static void main(String[] args) {
        WordLengths wordLengths=new WordLengths();
        wordLengths.testCountWordLengths();
    }
}