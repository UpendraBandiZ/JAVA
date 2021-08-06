package com.company;
import edu.duke.URLResource;
import java.io.IOException;
public class Part4 {
    public  void findYoutubeUrls(){
        String url="https://www.dukelearntoprogram.com/course2/data/manylinks.html";
        URLResource ur=new URLResource(url);
        for (String word: ur.words()){
            int index=word.toLowerCase().indexOf("youtube.com");
            if(index>=0){
                int startIndex=word.indexOf("\"");
                int endIndex=word.indexOf("\"",startIndex+1);
                System.out.println("Youtube link "+word.substring(startIndex,endIndex+1));
            }
        }
    }

    public static void main(String[] args)throws IOException{
        Part4 part4=new Part4();
        part4.findYoutubeUrls();
    }
}
