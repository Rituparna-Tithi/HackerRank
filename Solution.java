import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    

    public static String findDay(int month, int day, int year) {
        String[]day_of_week ={"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        Calendar cal= Calendar.getInstance();
        cal.set(year,month-1,day);
       
        int p=cal.get(Calendar.DAY_OF_WEEK);
        
        return day_of_week[p-1];

    }

}

public class Solution {