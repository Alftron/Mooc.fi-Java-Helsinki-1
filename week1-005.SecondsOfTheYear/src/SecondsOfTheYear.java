public class SecondsOfTheYear
{
    public static void main(String[] args)
    {   
        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        int secondsInYear = (((secondsInMinute * minutesInHour) * hoursInDay) * daysInYear);

        System.out.println("There are " + secondsInYear + " seconds in a year");
    }
}
