/*创建一个MyDate类，属性年月日，方法equals重写*/
package objecttest;

import java.util.Objects;

public class ObjectTest2 {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(2021,4,2);
        MyDate m2 = new MyDate(2021,5,4);
        System.out.print(m1.equals(m2));
    }
}
class MyDate{
    int year;
    int month;
    int day;

    public MyDate(int year,int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
