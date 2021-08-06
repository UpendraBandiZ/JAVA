package com.company;

import edu.duke.FileResource;

import java.util.ArrayList;

class WordFrequencies {
    private ArrayList<String> myWords;
    private ArrayList<Integer> myFrequencies;
    WordFrequencies(){
        myWords=new ArrayList<>();
        myFrequencies=new ArrayList<>();
    }
    public void findUnique(){
        myWords.clear();
        myFrequencies.clear();
        FileResource fileResource=new FileResource();
        for (String word:fileResource.words()) {
            word=word.toLowerCase();
            if(!myWords.contains(word))
                myWords.add(word);
        }
        for(int i=0;i<myWords.size();i++){
            int count=0;
            for (String word:fileResource.words()) {
                word=word.toLowerCase();
                if(word.equals(myWords.get(i)))
                    count++;
            }
            myFrequencies.add(count);
        }
    }
    public int findIndexOfMax(){
        int max=Integer.MIN_VALUE,maxValueIndex=-1;
        for(int i=0;i<myFrequencies.size();i++){
            if(max<myFrequencies.get(i)){
                max=myFrequencies.get(i);
                maxValueIndex=i;
            }
        }
        return maxValueIndex;
    }
    public void tester(){
        findUnique();
        System.out.println("Number of unique words:"+myWords.size());
        for(int i=0;i<myWords.size();i++)
            System.out.println(myFrequencies.get(i)+" "+myWords.get(i));
        int index=findIndexOfMax();
        System.out.println("The word that occurs most often and its count are :"+myWords.get(index)+" "+myFrequencies.get(index));
    }
    public static void main(String[] args) {
        WordFrequencies wordFrequencies=new WordFrequencies();
        wordFrequencies.tester();
    }
}
