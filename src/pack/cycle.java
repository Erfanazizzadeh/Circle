import java.util.Scanner;

public class Circle {
  private  static  int radious;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //get number
        System.out.println("Circle :  \n Enter your number : ");
        radious = scanner.nextInt();
        //print
        System.out.println("Circle{"+ " perimerter: "+ getPerimeter() + ", Area: "+ getArea()+", Diameter: "+getDiameter());



    }
        public static int getPerimeter(){
            return (int) (getDiameter()*Math.PI); }
        public static int getDiameter(){
        return radious*2;
        }
        public static int getArea(){
        return (int) (radious*radious * Math.PI);// 3.14 cast the number to int
        }


}
