package com.example.string;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class StringSplit {
    public static void  main(String args[]) throws UnsupportedEncodingException {
        String decodedURL = "";
        //String mycookie = "userReferrer=http%3A%2F%2Fstage.consumerreports.org%2Fcro%2Fhomepage_v2%2Findex.htm";
        //String mycookie = "userReferrer=http%3A%2F%2Fstage.consumerreports.org%2Fcro%2Fhomepage_v2%2Findex.htm;";
        //String mycookie =  "userReferrer=https%3a%2f%2fstage2.consumerreports.org%2fcro%2findex.htm; userToken=caf6dce3-bfe2-46bc-8966-6992b4dd8cc1; userLicenses=d=H4sIAAAAAAAAAKtWylSyUrK0MLEwNDE2VdJRylGyio7VUcpMBQor1QIA2n8V6x8AAAA%3D&t=1630357022824&s=bf4fc90b9b1463b0ce217320773578d3cbeedeb6; userInfo=products=&displayName=M&email=maulik.megha%2Btest101autoredirect16%40consumer.org&zipCode=&ID=98481435&userName=MAULIK.MEGHA%2BTEST101AUTOREDIRECT16%40CONSUMER.ORG&firstName=M&lastName=K&erightsID=&tier=EMAIL; userAds=userid=98481435&country=&flags=&erightsId=";
        //String mycookie =  "userAds=userid=98481435&country=&flags=&erightsId=; userReferrer=https%3a%2f%2fstage2.consumerreports.org%2fcro%2findex.htm; userToken=caf6dce3-bfe2-46bc-8966-6992b4dd8cc1; userLicenses=d=H4sIAAAAAAAAAKtWylSyUrK0MLEwNDE2VdJRylGyio7VUcpMBQor1QIA2n8V6x8AAAA%3D&t=1630357022824&s=bf4fc90b9b1463b0ce217320773578d3cbeedeb6; userInfo=products=&displayName=M&email=maulik.megha%2Btest101autoredirect16%40consumer.org&zipCode=&ID=98481435&userName=MAULIK.MEGHA%2BTEST101AUTOREDIRECT16%40CONSUMER.ORG&firstName=M&lastName=K&erightsID=&tier=EMAIL";
        String mycookie =  "userAds=userid=98481435&country=&flags=&erightsId=; userToken=caf6dce3-bfe2-46bc-8966-6992b4dd8cc1; userLicenses=d=H4sIAAAAAAAAAKtWylSyUrK0MLEwNDE2VdJRylGyio7VUcpMBQor1QIA2n8V6x8AAAA%3D&t=1630357022824&s=bf4fc90b9b1463b0ce217320773578d3cbeedeb6; userInfo=products=&displayName=M&email=maulik.megha%2Btest101autoredirect16%40consumer.org&zipCode=&ID=98481435&userName=MAULIK.MEGHA%2BTEST101AUTOREDIRECT16%40CONSUMER.ORG&firstName=M&lastName=K&erightsID=&tier=EMAIL; userReferrer=https%3a%2f%2fstage2.consumerreports.org%2fcro%2findex.htm";

        if(!mycookie.isEmpty() && mycookie.contains("userReferrer")) {
            String cookieValue = mycookie.split("userReferrer=")[1];
            int endUrlIndex = cookieValue.indexOf(";") > 0 ? cookieValue.indexOf(";") : cookieValue.length();
            String encodedURL = cookieValue.substring(0, endUrlIndex);

            decodedURL = java.net.URLDecoder.decode(encodedURL, "UTF-8");
            System.out.println("encodedURL : "+encodedURL);
            System.out.println("decodedURL : "+decodedURL);
            //output:
            //encodedURL : http%3A%2F%2Fstage.consumerreports.org%2Fcro%2Fhomepage_v2%2Findex.htm
            //decodedURL : http://stage.consumerreports.org/cro/homepage_v2/index.htm
        }


        // given String input = "VISA XXXXXXXXXXX1234" and result will be "VISA"
        // Second Example input = "American Express XXXXXXXXXXXX0005" and result = "American Express"
        String input = "VISA XXXXXXXXXXX1234";
        System.out.println("result = "+input.substring(0, input.lastIndexOf(" ")).length());


        //convert "MM/yyyy" to "MMyy"
        SimpleDateFormat parser = new SimpleDateFormat("MM/yyyy");
        SimpleDateFormat formatter = new SimpleDateFormat("MMyy");
        try {
            System.out.println(formatter.format(parser.parse("05/2025")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String filePath = "meghma/cr/in/FBLEAD_261732915258155_1_2020111615243034001.json";
        String fileName = filePath.substring(filePath.lastIndexOf("/")+1);
        String[] fileNameValues = fileName.split("_");
        String fileId = fileNameValues[1]; //fileName.substring(fileName.indexOf("_")+1, fileName.indexOf(".json"));
        System.out.println("fileName : "+fileName);
        System.out.println("fileId : "+fileId);

        /*
        1|John|Smith|john@yahoo.com
        2|Jane|Doe|jdoe@gmail.com
        3|Paul|Sun|psun@hotmail.fooo
         */
        String line = "1|John|Smith|john@yahoo.com";
        String[] values = line.split("\\|");
        System.out.println("length: "+values.length);
        //System.out.println("values: "+ Arrays.stream(values).toString());


        String inputfile = "meghma/cr/in/FBLEAD_261732915258155_1_2020111615243034001.xml";
        System.out.println(inputfile.replaceAll(".xml",".zip"));

       /*Email must be of form user@domain where domain in (gmail.com, yahoo.com, hotmail.com, outlook.com, consumer.org, ymail.net)

        c) write to stdout the total number of records in the file
        d) write to stdout the total number of records that pass validation
        e) write to stdout the total number of records that failed validation
        f) write to stdout which records line that had errors
        */

        /*
        1|John|Smith|john@yahoo.com
        2|Jane|Doe|jdoe@gmail.com
        3|Paul|Sun|psun@hotmail.fooo
        4||Ting|
        5|Dennis||dennis.ting@consumer.org
        6|D|T||dt@outlook.com
        7|Henry|Hill|Henry.hill@gmail.com
        8|Paula|Stein|paula@stein@gmail.com
        9|Chris|Copper|chris.copper@hotmail.com
        10|Daniel|Yu|dan.yu@ymail.net
        */

        String fileDateTime  = "20220207103606521";
        System.out.println("OLD FILE-DATE-TIME-ID : "+fileDateTime);
        System.out.println("NEW FILE-DATE-TIME-ID : " + fileDateTime.substring(0,fileDateTime.length() - 3));

        String orderNumber = "7878778787";
        boolean hasOrderNumber = !orderNumber.isEmpty();
        System.out.println("hasOrderNumber : "+hasOrderNumber);

        String name = "M";
        String name1 = null;

        if(name.equalsIgnoreCase("M")){
            if(name1 != null && name1.equalsIgnoreCase("M")){
                System.out.println("M");
            } else {
                System.out.println("X");
            }
        }

        String error = "Cannot construct instance of `org.consumerreports.ec.ecomapi.controller.command.EmailPreferencesOptType`, problem: businessUnit [CROX] is not supported";
        String result = error.substring(error.indexOf(":")+1, error.length());
        System.out.println("result : "+result);


    }
}
