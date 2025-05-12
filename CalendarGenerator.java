package day01;

public class CalendarGenerator {
    public static void main(String[] args) {
        int year = 2025;
        int weekDay = 0;
        for(int i= 1900;i<2025;i++){
            weekDay += i%4==0&&i%100!=0||i%400==0?366:365;
        }
        weekDay %= 7;
        for(int i =1, days;i<=12;i++){
            System.out.println(year+"年"+i+"月");
            System.out.println("一\t二\t三\t四\t五\t六\t日");
            days = switch (i) {
                case 1,3,5,7,8,10,12 -> 31;
                case 4,6,9,11 -> 30;
                default -> year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
            };
            for(int j =0;j<weekDay;j++){
                System.out.print("\t");
            }
            for(int j =1;j<=days;j++){
                System.out.printf("%d\t",j);
                weekDay++;
                if(weekDay == 7 || j == days){
                    System.out.println();
                    weekDay = 0;
                }
            }
        }
        System.out.println();
    }
}
