package com.knoldus.kup.services;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AppService {
    public static final long MSEC_SINCE_EPOCH = System.currentTimeMillis();

    public String getStatusWithTime(){
        // Convert the milliseconds into a
        // java.util.Date object.
        Date instant = new Date( MSEC_SINCE_EPOCH );

        // Set up a simple date format, to give the view
        // of the date object that we want.
        SimpleDateFormat sdf = new SimpleDateFormat( "HH:mm aa" );

        // Define the String, time, to be our formatted
        String time = sdf.format( instant );
        return "Running, "+ time;
    }

}
