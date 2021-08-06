package com.company;

public class Part2 {
    int howMany(String stringa,String stringb){
        int count=0,start=0;
        while(true){
            int index=stringb.indexOf(stringa,start);
            if(index==-1)
                return count;
            count+=1;
            start=index+stringa.length();
             if (index >= stringb.length())
                break;

        }
        return count;
    }
    public  void testHowMany(){
        String sa1="GAA";
        String sb1="ATGAACGAATTGAATC";
        System.out.println(sa1+" occurs "+howMany(sa1,sb1)+" times in "+sb1);
        String sa2="AA";
        String sb2="ATAAAA";
        System.out.println(sa2+" occurs "+howMany(sa2,sb2)+" times in "+sb2);
        String sa3="TTY";
        String sb3="ATTYUTYYTTY";
        System.out.println(sa3+" occurs "+howMany(sa3,sb3)+" times in "+sb3);
    }
    public static void main(String[] args) {
        Part2 part2=new Part2();
        part2.testHowMany();
    }
}
