package objecttest;
import javafx.scene.shape.Circle;

import java.math.BigDecimal;
public class ObjectTest3 {
    public static void main(String[] args) {
        Cricle c1 = new Cricle(2.3);
        Cricle c2 = new Cricle(2.3,"white",2.0);
        System.out.println(c1.color == c2.color);//判断颜色是否相同
        //或
        System.out.println(c1.getColor().equals(c2.getColor()));
        System.out.println(c1.equals(c2));//判断半径相等
        System.out.println(c2.toString());//输出半径
    }
}
class GeometricObject{//父类几何形状
    protected String color;
    protected double weight;

    protected  GeometricObject(){
        color = "white";
        weight = 1.0;
    }

    protected  GeometricObject(String color,double weight){
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
class Cricle extends  GeometricObject{
    private double radius;

    public Cricle(){
        super();
        this.radius = 1.0;
    }

    public Cricle(double radius){
        super();
        this.radius = radius;
    }

    public Cricle(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;//求圆面积
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Cricle){
            Cricle c = (Cricle)o;
            return this.radius == c.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cricle{" + "radius=" + radius + '}';
    }
}

