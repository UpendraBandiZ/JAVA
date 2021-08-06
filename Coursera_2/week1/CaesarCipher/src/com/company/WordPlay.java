package com.company;

public class WordPlay {
    public boolean isVowel(char ch){
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return true;
        else
            return false;
    }
    public String replaceVowels(String phrase, char ch){
        String modifiedPhrase="";
        for(int i=0;i<phrase.length();i++){
            if(isVowel(phrase.charAt(i)))
                modifiedPhrase+=ch;
            else
                modifiedPhrase+=phrase.charAt(i);
        }
        return modifiedPhrase;
    }
    public String emphasize(String phrase,char ch) {
        String modifiedPhrase = "";
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == ch) {
                if ((i + 2) % 2 == 1)
                    modifiedPhrase += '+';
                else
                    modifiedPhrase += '*';
            } else
                modifiedPhrase += phrase.charAt(i);
        }
        return modifiedPhrase;
    }
    public void tester(){
        System.out.println(isVowel('F'));
        System.out.println(isVowel('e'));
        System.out.println(replaceVowels("HelloWorld",'*'));
        System.out.println(emphasize("Hello World",'o'));
    }
    public static void main(String[] args) {
        WordPlay wordPlay=new WordPlay();
        wordPlay.tester();
    }
}
