package com.company;
import org.apache.commons.csv.*;
import edu.duke.FileResource;
public class Main {
    public void tester(){
        FileResource fileResource=new FileResource();
        CSVParser csvParser=fileResource.getCSVParser();
        System.out.println(countryInfo(csvParser,"Nauru"));
        csvParser=fileResource.getCSVParser();
        listExportersTwoProducts(csvParser,"cotton","flowers");
        csvParser= fileResource.getCSVParser();
        System.out.println(numberOfExporters(csvParser,"cocoa"));
        csvParser=fileResource.getCSVParser();
        bigExporters(csvParser,"$999,999,999,999");
    }
    public String countryInfo(CSVParser csvParser, String countryName){
        for (CSVRecord csvRecord:csvParser) {
            String country=csvRecord.get("Country");
            if(country.equals(countryName))
                return csvRecord.get("Country")+":"+csvRecord.get("Exports")+":"+csvRecord.get("Value (dollars)");
        }
        return "NOT FOUND";
    }
    public void listExportersTwoProducts(CSVParser csvParser,String exportItem1,String exportItem2){
        for (CSVRecord csvRecord:csvParser) {
            String exports=csvRecord.get("Exports");
            if(exports.contains(exportItem1) && exports.contains(exportItem2))
                System.out.println(csvRecord.get("Country"));
        }
    }
    public int numberOfExporters(CSVParser csvParser,String exportItem){
        int count=0;
        for (CSVRecord csvRecord:csvParser) {
            String exports=csvRecord.get("Exports");
            if(exports.contains(exportItem))
                count++;
        }
        return count;
    }
    public void bigExporters(CSVParser csvParser,String amount){
        for (CSVRecord csvRecord:csvParser) {
            String value=csvRecord.get("Value (dollars)");
            if(value.length()>amount.length())
                System.out.println(csvRecord.get("Country")+" +"+csvRecord.get("Value (dollars)"));
        }
    }
    public static void main(String[] args) {
        // write your code here
          Main main=new Main();
          main.tester();
    }
}
