
import java.util.*;

class matrix {

    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    int c[][] = new int[2][2];

    Scanner std = new Scanner(System.in);

    void getmatrix() {
       System.out.println("enter the value of 1st matrix");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                a[i][j] = std.nextInt();
            }
        }
          System.out.println("enter the value of 2nd matrix");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
               
                b[i][j] = std.nextInt();
            }
        }
    }

    void display() { 
System.out.println("1stmatrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
                
            }

                  System.out.println(" ");
        }
System.out.println("2nd matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j] + " ");
               
            }
           System.out.println(" ");
        }
    }
void add()
{
   System.out.println("additon of matrix");


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                c[i][j] = a[i][j]+b[i][j];            }
        }
for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
                
            }

                  System.out.println(" ");
        }

  }
void sub()
{
   System.out.println("substraction of matrix");


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                c[i][j] = a[i][j]-b[i][j];            }
        }
for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
                
            }

                  System.out.println(" ");
        }

  }
void mul()
{
   System.out.println("multiplication of matrix");


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                c[i][j] = a[i][j]*b[i][j];            }
        }
for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
                
            }

                  System.out.println(" ");
        }

  }

}

class matrix1 {

    public static void main(String[] args) {

        matrix m = new matrix();
        m.getmatrix();
        m.display();
m.add();
m.sub();
m.mul();
    }
}
