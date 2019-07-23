import java.io.*;

import java.util.*;

import java.text.*;

public class HappyBirthday {

public static void main(String[] args) throws IOException

{

String sName, sYear, sMonth, sDay;

int iYearBorn, iMonthBorn, iDayBorn, iYearsOld, iDaysOld, iCalendarNowDayOfYear, iCalendarBdayDayOfYear, iCalendarNowYear, iCalendarBdayYear;

BufferedReader dataIn= new BufferedReader(new InputStreamReader(System.in));

System.out.println("Please enter your name.");

sName = dataIn.readLine();

System.out.println("Please enter the 4 digit year you were born.");

sYear = dataIn.readLine();

iYearBorn = Integer.parseInt(sYear);

System.out.println("Please enter the numerical month you were born.");

sMonth = dataIn.readLine();

iMonthBorn = Integer.parseInt(sMonth);

System.out.println("Please enter the day you were born.");

sDay = dataIn.readLine();

iDayBorn = Integer.parseInt(sDay);

//create calendar called calendarNow and set it to the current time and date

GregorianCalendar calendarNow = new GregorianCalendar();

Date dateNow = calendarNow.getTime();

//long longNow = dateNow.getTime();

//create calendar called calendarBday and set it to the user's birthday (iMonthBorn-1 because Jan starts at 0)

GregorianCalendar calendarBday = new GregorianCalendar(iYearBorn, iMonthBorn-1, iDayBorn);

Date dateBday = calendarBday.getTime();

//long longBday = dateBday.getTime();

//create date format called df and output user's name and formatted birthday

DateFormat df = DateFormat.getDateInstance();

System.out.println("Hello " + sName + " you were born on " + df.format(dateBday));

//set variables to year and day of year by accessing those fields of the two calendars

iCalendarNowDayOfYear = calendarNow.get(Calendar.DAY_OF_YEAR);

iCalendarBdayDayOfYear = calendarBday.get(Calendar.DAY_OF_YEAR);

iCalendarNowYear = calendarNow.get(Calendar.YEAR);

iCalendarBdayYear = calendarBday.get(Calendar.YEAR);

//calculate number of years and days old and assign to variables

if (iCalendarNowDayOfYear >= iCalendarBdayDayOfYear) //if birthday has already occurred this year

{

iYearsOld = iCalendarNowYear - iCalendarBdayYear;

iDaysOld = (iCalendarNowDayOfYear - iCalendarBdayDayOfYear);

}

else //if birthday has not yet occurred this year

{

iYearsOld = (iCalendarNowYear - 1) - iCalendarBdayYear;

iDaysOld = (iCalendarNowDayOfYear + 365 - iCalendarBdayDayOfYear);

}

System.out.println("\nYou are " + iYearsOld + " years and " + iDaysOld + " days old");

}

}
