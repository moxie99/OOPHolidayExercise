package Holiday;

public class Main{
    public static boolean isSameMonth(){
        holiday holiday1 = new holiday(4, "July", "Independence");
        holiday holiday2 = new holiday(8, "July", "Christmas");

        if(holiday1.month == holiday2.month){
            return true;
        }else{
            return false;
        }
    }

    public static double avgDate(int [] holidayDays){
        /*
        Write a method avgDate which takes an array of base type Holiday
         as its argument, and returns a double that is the average of the day
          variables in the Holiday instances in the array.
          You may assume that the array is full (i.e. does not have any null entries).
         */
        int startDay = 0;
        for(int i = 0; i < holidayDays.length; i++){
            startDay+=holidayDays[i];
            return startDay;
        }
        return startDay/holidayDays.length;
    }

    public static void main(String[] args) {
        boolean monthOutcome = isSameMonth();
        System.out.println(monthOutcome);

        int [] holidayDays = {2,5,6,7,8};
        double avgDateOutcome = avgDate(holidayDays);
        System.out.println(avgDateOutcome);
    }
}
