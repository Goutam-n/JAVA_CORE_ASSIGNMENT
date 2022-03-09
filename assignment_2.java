import java.util.*;

class Square
{
    int area , perimeter ;
    int area ( int s )
    {
        area = s * s;
        return ( area ) ;
    }
    int perimeter ( int s )
    {
        perimeter = 4 * s;
        return ( perimeter ) ;
    }
}
class Rectangle
{
    int area , perimeter ;
    int area ( int l, int w )
    {
        area = l * w;
        return ( area ) ;
    }
    int perimeter ( int l, int w )
    {
        perimeter = 2 * ( l * w );
        return ( perimeter ) ;
    }
}
class Circle
{
    final double pi=3.14;
    double area , perimeter ;
    double area ( double r)
    {
        area = pi*r*r;
        return area ;
    }
    double perimeter ( double r )
    {
        perimeter = 2 * pi * r ;
        return perimeter ;
    }
}
class Triangle
{
    int area , perimeter ;
    int area ( int a, int b, int c )
    {
        area = a*b*c;
        return area ;
    }
    int perimeter ( int a, int b, int c )
    {
        perimeter = (a * b * c )/2;
        return perimeter ;
    }
}
class Cylinder
{
    final double pi=3.14;
    double area , volume ;
    double area ( double r, int h)
    {
        area = 2*pi*r*(r+h) ;
        return area ;
    }
    double volume ( double r, int h )
    {
        volume = pi*r*r*h;
        return volume ;
    }
}


public class assignment_2
{
     public static void main(String[] args) {
        // INSTANCE FOR SQUARE
         Square obj1 = new Square() ;

        // INSTANCE FOR RECTANGLE
         Rectangle obj2 = new Rectangle() ;

        // INSTANCE FOR CIRCLE
         Circle obj3 = new Circle() ;
        
         // INSTANCE FOR TRIANGLE
         Triangle obj4 = new Triangle() ;
         
         // INSTANCE FOR Cylinder
         Cylinder obj5 = new Cylinder() ;

         boolean bool = true;

        // IMPORTING SCANNER CLASS
        Scanner scn =new Scanner(System.in);
       
        do{
            System.out.println ( " \nSelect the shape to calculate the area : \n "  +
                    " 1. Square\n "  +
                    " 2. Rectangle\n "  +
                    " 3. Circle\n "  +
                    " 4. Trianlge\n "  +
                    " 5. Cylinder\n "  +
                    " 6. Sphere\n "  +
                    " 7. Cube\n "  +
                    " 8. Cuboid\n "  +
                    " 9. Exit\n " ) ;
                 
                    // TAKING INPUT FROM USER
                   
                    int x = scn.nextInt() ;

                    if(x<9 && x>=1)
                    {
                        switch(x)
                        {
                            case 1:
                            {
                                System.out.println ( "Enter side of the square : " ) ;
                                int side = scn.nextInt() ;
                                int area = obj1.area(side);
                                int perimeter = obj1.perimeter(side);
                                System.out.println ( "Area of the square is : " + area + "\nAnd perimeter is : " + perimeter) ;
                                break;
                            }
                            case 2:
                            {
                                System.out.println ( "Enter Length of the rectangle : " ) ;
                                int length = scn.nextInt() ;
                                System.out.println ( "Enter Width of the rectangle : " ) ;
                                int width = scn.nextInt() ;
                                int area = obj2.area(length,width);
                                int perimeter = obj2.perimeter(length,width);
                                System.out.println ( "Area of the rectangle is : " + area + "\nAnd perimeter is : " + perimeter) ;
                                break;
                            }
                            case 3:
                            {
                                System.out.println ( "Enter radius of the Circle : " ) ;
                                double radius = scn.nextInt() ;
                                double area = obj3.area(radius);
                                double perimeter = obj3.perimeter(radius);
                                System.out.println ( "Area of the Circle is : " + area + "\nAnd perimeter is : " + perimeter ) ;
                                break;
                            }
                            case 4:
                            {
                                System.out.println ( "Enter the first side of the triangle : " ) ;
                                int side1 = scn.nextInt() ;
                                System.out.println ( "Enter the second side of the triangle : " ) ;
                                int side2 = scn.nextInt() ;
                                System.out.println ( "Enter the third side of the triangle : " ) ;
                                int side3 = scn.nextInt() ;
                                int area = obj4.area(side1,side2,side3);
                                int perimeter = obj4.perimeter(side1,side2,side3);
                                System.out.println ( "Area of the Triangle is : " + area + "\nAnd perimeter is : " + perimeter ) ;
                                break;
                            }
                            case 5:
                            {
                                System.out.println ( "Enter the radius of the cylinder : " ) ;
                                int radius = scn.nextInt() ;
                                System.out.println ( "Enter the height of the cylinder : " ) ;
                                int height = scn.nextInt() ;
                                double area = obj5.area(radius,height);
                                double volume = obj5.volume(radius,height);
                                System.out.println ( "Area of the Cylinder is : " + area + "\nAnd volume is : " + volume ) ;
                                break;
                            }
                        }
                    }
                    else if ( x==9 )
                    {
                        bool = false ;break;
                    }
                    else
                    {
                        System.out.println("Invalid input , choose the correct input");
                    }
        } while ( bool );
    }
}