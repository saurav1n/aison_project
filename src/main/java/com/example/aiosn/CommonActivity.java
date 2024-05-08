package com.example.aiosn;

import java.time.Clock;
import java.time.Instant;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class CommonActivity {

    public static boolean isValidEmail(String email) {
        String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(email);
        return matcher.matches();
    }


    public String getOTP(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(9000) + 1000;
        return String.valueOf(randomNumber);

    }



    public int uniqueTimeStamp(){
        return longToInt(unique());
    }


    public long unique(){

        Clock clock = Clock.systemDefaultZone();
        Instant instant = clock.instant();   // or Instant.now();
        long seconds = instant.getEpochSecond();
        long nano = instant.getNano();
        return nano;
        // epoch nanoseconds = seconds * 1E9 + nano

    }


    public int longToInt(Long value){
        long l = value;
        int i = (int) l;
        return i;
    }

}
