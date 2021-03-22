/*编写Order类，有int型的orderld，String型的orderName，相应的getter（）和setter（）方法
* 两个参数构造器，重写父类的equals（）方法，public boolean equals(Object obj)，并判断
* 测试类中创建的两个对象是否相等*/
package objecttest;

import java.util.Objects;

public class ObjectTest1 {
    public static void main(String[] args) {
        Order s1 = new Order(21,"haha");
        Order s2 = new Order(22,"xixi");
        System.out.print(s1.equals(s2));
    }
}
class Order{
    int orderld;
    String orderName;

    public Order(int orderld,String orderName){
        this.orderld = orderld;
        this.orderName = orderName;
    }

    public void setOrderld(int orderld) {
        this.orderld = orderld;
    }

    public int getOrderld() {
        return orderld;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderName() {
        return orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderld == order.orderld && Objects.equals(orderName, order.orderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderld, orderName);
    }
}
