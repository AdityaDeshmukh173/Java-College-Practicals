public class Main {
    public static void main(String args[]){

        Circle c1 = new Circle();
        c1.r = 15 ;
        c1.pi= 3.14 ;
        System.out.println("Area of circel 1 is: "+c1.getArea());
        System.out.println("Perimeter of circle 1 is: "+c1.getPerimeter());

        Circle c2 = new Circle();
        c2.r = 20;
        c2.pi = 3.14 ;
        System.out.println("Area of circle 2 is: "+c2.getArea());
        System.out.println("Perimeter of circle 2 is: "+c2.getPerimeter());
    }
}

class Circle{
    public double r ;
    public double pi ;

    public double getArea(){
        double area = pi * r * r ;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2* pi* r;
        return perimeter ;
    }
}