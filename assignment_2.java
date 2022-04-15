import java.util.*;

class Square
{
    double area , perimeter ;
    double area ( double s )
    {
        area = s * s;
        return ( area ) ;
    }
    double perimeter ( double s )
    {
        perimeter = 4 * s;
        return ( perimeter ) ;
    }
}
class Rectangle
{
    double area , perimeter ;
    double area ( double l, double w )
    {
        area = l * w;
        return ( area ) ;
    }
    double perimeter ( double l, double w )
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
    double area , perimeter ;
    double area ( double a, double b, double c )
    {
        area = a*b*c;
        return area ;
    }
    double perimeter ( double a, double b, double c )
    {
        perimeter = (a * b * c )/2;
        return perimeter ;
    }
}
class Cylinder
{
    final double pi=3.14;
    double area , volume ;
    double area ( double r, double h)
    {
        area = 2*pi*r*(r+h) ;
        return area ;
    }
    double volume ( double r, double h )
    {
        volume = pi*r*r*h;
        return volume ;
    }
}

class Sphere
{
    final double pi=3.14;
    double area , volume ;
    double area ( double r )
    {
        area = 4*pi*r*r;
        return area ;
    }
    double volume ( double r )
    {
        volume = (4/3)*pi*r*r*r;
        return volume ;
    }
}
class Cube
{
    double area , volume ;
    double area ( double a )
    {
        area = 6*a*a;
        return area ;
    }
    double volume ( double a )
    {
        volume = a * a * a ;
        return volume ;
    }
}
class Cuboid
{
    double area , volume ;
    double area ( double l, double b , double h )
    {
        area = 6*(l*b+b*h+h*l);
        return area ;
    }
    double volume ( double l, double b , double h )
    {
        volume = l * b * h ;
        return volume ;
    }
}

public class assignment_2
{
     public static void main(String[] args) {
         char ch;
        // INSTANCE FOR SQUARE
         Square obj1 = new Square() ;

        // INSTANCE FOR RECTANGLE
         Rectangle obj2 = new Rectangle() ;

        // INSTANCE FOR CIRCLE
         Circle obj3 = new Circle() ;
        
         // INSTANCE FOR TRIANGLE
         Triangle obj4 = new Triangle() ;
         
         // INSTANCE FOR CYLINDER
         Cylinder obj5 = new Cylinder() ;
         
         // INSTANCE FOR SPHERE
         Sphere obj6 = new Sphere() ;
         
         // INSTANCE FOR CUBE
         Cube obj7 = new Cube() ;
         
         // INSTANCE FOR CUBOID
         Cuboid obj8 = new Cuboid() ;

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
                    
                    double volume,area,perimeter,length,radius,width,height,side,side1,side2,side3;
                    // TAKING INPUT FROM USER
        
                    int x = scn.nextInt() ;
                        if(x<9 && x>=1)
                        {
                            switch(x)
                            {
                                case 1:
                                
                                    System.out.println ( "Enter side of the square : " ) ;
                                     side = scn.nextDouble() ;
                                     area = obj1.area(side);
                                     perimeter = obj1.perimeter(side);
                                    System.out.println ( "Area of the square is : " + area + "\nAnd perimeter is : " + perimeter) ;
                                    break;
                                
                                case 2:
                                    System.out.println ( "Enter Length of the rectangle : " ) ;
                                    length = scn.nextDouble() ;
                                    System.out.println ( "Enter Width of the rectangle : " ) ;
                                    width = scn.nextDouble() ;
                                     area = obj2.area(length,width);
                                     perimeter = obj2.perimeter(length,width);
                                    System.out.println ( "Area of the rectangle is : " + area + "\nAnd perimeter is : " + perimeter) ;
                                    break;
                                case 3:
                                    System.out.println ( "Enter radius of the Circle : " ) ;
                                    radius = scn.nextDouble() ;
                                     area = obj3.area(radius);
                                     perimeter = obj3.perimeter(radius);
                                    System.out.println ( "Area of the Circle is : " + area + "\nAnd perimeter is : " + perimeter ) ;
                                    break;
                                case 4:
                                    System.out.println ( "Enter the first side of the triangle : " ) ;
                                    side1 = scn.nextDouble() ;
                                    System.out.println ( "Enter the second side of the triangle : " ) ;
                                    side2 = scn.nextDouble() ;
                                    System.out.println ( "Enter the third side of the triangle : " ) ;
                                    side3 = scn.nextDouble() ;
                                     area = obj4.area(side1,side2,side3);
                                     perimeter = obj4.perimeter(side1,side2,side3);
                                    System.out.println ( "Area of the Triangle is : " + area + "\nAnd perimeter is : " + perimeter ) ;
                                    break;
                                case 5:
                                    System.out.println ( "Enter the radius of the cylinder : " ) ;
                                    radius = scn.nextDouble() ;
                                    System.out.println ( "Enter the height of the cylinder : " ) ;
                                    height = scn.nextDouble() ;
                                     area = obj5.area(radius,height);
                                    volume = obj5.volume(radius,height);
                                    System.out.println ( "Area of the Cylinder is : " + area + "\nAnd volume is : " + volume ) ;
                                    break;
                                case 6:
                                
                                System.out.println ( "Enter the radius of the sphere : " ) ;
                                radius = scn.nextDouble() ;                                
                                 area = obj6.area(radius);
                                volume = obj6.volume(radius);
                                System.out.println ( "Area of the sphere is : " + area + "\nAnd volume is : " + volume ) ;
                                break;
                                
                                case 7:
                                
                                    System.out.println ( "Enter the side of the cube : " ) ;
                                    side = scn.nextDouble() ;
                                    area = obj7.area(side);
                                    volume = obj7.volume(side);
                                    System.out.println ( "Area of the Cube is : " + area + "\nAnd volume is : " + volume ) ;
                                    break;
                                
                                case 8:
                                
                                    System.out.println ( "Enter the length of the cuboid : " ) ;
                                    length = scn.nextDouble() ;
                                    System.out.println ( "Enter the breadth of the cuboid : " ) ;
                                    width = scn.nextDouble() ;
                                    System.out.println ( "Enter the height of the cuboid : " ) ;
                                    height = scn.nextDouble() ;
                                    area = obj8.area(length,width,height);
                                    volume = obj8.volume(length,width,height);
                                    System.out.println ( "Area of the Cube is : " + area + "\nAnd volume is : " + volume ) ;
                                    break;
                            }
                        }
                        else if ( x==9 )
                        {
                            bool = false ;
                            System.out.println("Thanks for Using !");
                            break;
                        }
                        else
                        {
                            System.out.println("Invalid input , choose the correct input");
                        }
                                           
        } while ( bool );
        scn.close();
    }
}