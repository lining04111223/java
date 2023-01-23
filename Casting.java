public class Casting {

  public static void main(String[] args) {
 //implicit casting
 //byte > short > int > long  > float > double  


short x=1;
int y=x;

double a =1.1;
int b=(int)a + 2;

String c = "1";
int d = Integer.parseInt(c)+2;

System.out.println(y);
System.out.println(b);
System.out.println(d);


  }
  
}
