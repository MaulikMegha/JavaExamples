package com.example.string;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class DateString {
    public static void  main(String args[]) {

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = null;
        try {
            myDate = format.parse("20201210");
            /*Calendar cal = Calendar.getInstance();
            cal.setTime(myDate);
            cal.add(Calendar.DATE, 10);
            myDate = cal.getTime();*/
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("date : "+myDate);

        LocalDateTime today = LocalDateTime.now();     //Today
        LocalDateTime tomorrow = today.plusDays(10);     //Plus 1 day
        LocalDateTime yesterday = today.minusDays(1);   //Minus 1 day

        System.out.println("Today:     "+today);
        System.out.println("Tomorrow:  "+tomorrow);
        System.out.println("Yesterday: "+yesterday);

        Calendar calendar = Calendar.getInstance();
        System.out.println("1111 : "+calendar.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        System.out.println("2222 : " + sdf.format(new Date()));

        String todaysDate = sdf.format(calendar.getTime());
        System.out.println("XXXX >> "+String.format("accountUpdaterRequest", sdf.format(new Date())));

        //long timestamp = date.getTime();
        //System.out.println(timestamp);

        System.out.println();
        System.out.println();

        /*2020-10-21T16:04:57+0000*/
        /*SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = null;
        try {
            date = inputFormat.parse("2020-10-21T16:04:57+0000");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String formattedDate = outputFormat.format(date);
        System.out.println(formattedDate);*/ // prints 2020-10-21 12:04:57.000

        String emailID = "maulik.megha+11test@consumer.org";
        String encodedEmail = encodeValue(emailID);
        System.out.println("encodedEmail : "+encodedEmail);


        String createdTime = "2020-11-16T15:35:52+0000";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'+'0000");
        LocalDateTime dateTime = LocalDateTime.parse(createdTime, formatter);
        System.out.println("&&&& dateTime &&&& " +dateTime);

        List<Pattern> BLACKLIST_PATTERNS = Arrays
                .asList(Pattern.compile("^[\\w.\\-\\\\+]+@nowhere\\.com$"),
                        Pattern.compile("^[\\w.\\-\\\\+]+@nobody\\.com$"),
                        Pattern.compile("^[\\w.\\-\\\\+]+@noemails\\.com$"),
                        Pattern.compile("^[\\w.\\-\\\\+]+@noemail\\.com$"),
                        Pattern.compile("^[\\w.\\-\\\\+]+@nowhere\\.net"),
                        Pattern.compile("^[\\w.\\-\\\\+]+@none\\.com$"),
                        Pattern.compile("^[\\w.\\-\\\\+]+@example\\.com$"),
                        Pattern.compile("^[\\w.\\-\\\\+]+@example\\.net$"),
                        Pattern.compile("^[\\w.\\-\\\\+]+@example\\.org$"),
                        Pattern.compile("^[\\w.\\-\\\\+]+@example\\.edu$"),
                        Pattern.compile("^jenmanz@aol\\.com$"),
                        Pattern.compile("^noemail@yahoo\\.com$"),
                        Pattern.compile("^some@yahoo\\.com$"),
                        Pattern.compile("^nowhere@anywhere\\.com$"),
                        Pattern.compile("^bogus@yahoo\\.com$"));


        ZonedDateTime signedUpDatetimeOffset = ZonedDateTime.parse("2022-01-30T12:14:33-05:00");
        System.out.println("signedUpDatetimeOffset : "+signedUpDatetimeOffset);

        ZonedDateTime signedUpDatetimeUTC = ZonedDateTime.parse("2016-09-30T09:18:29.044Z");
        System.out.println("signedUpDatetimeUTC : "+signedUpDatetimeUTC);

        Long newDate = 1664284815294L;
        System.out.println("newDate : "+new Timestamp(newDate));



    }

    private static String encodeValue(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }
}
