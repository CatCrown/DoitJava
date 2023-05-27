package chapter05.Q5;

import java.util.Calendar;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean isValid = true;

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day < 1 || day > 31){
                    isValid = false;
                }else {
                    this.day = day;
                }
                break;
            case 4: case 6: case 9: case 11:
                if (day < 1 || day > 30){
                    this.isValid = false;
                }else {
                    this.day = day;
                }
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {// 윤년일 경우
                    if (day < 1 || day > 29) {
                        this.isValid = false;
                    } else {
                        this.day = day;
                    }
                }else {
                    if (day < 1 || day > 28) {
                        this.isValid = false;
                    } else {
                        this.day = day;
                    }
                }
                break;
            default:
                isValid = false;
        }
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if (month < 1 || month > 12){
            this.isValid = false;
            System.out.println("오류입니다.한달은 1~12월까지 있습니다. ");
        }else {
            this.month = month;
            this.isValid = true;
        }
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year > Calendar.getInstance().get(Calendar.YEAR)) {
            isValid = false;
        }
        else {
            this.year = year;
        }
    }

    public MyDate(int day, int month, int year){
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public String isValid(){
        if (isValid){
            return "유효한 날짜입니다. ";
        }else {
            return "유효하지 않은 날짜입니다.";
        }

    }

}
