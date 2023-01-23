import java.text.NumberFormat;

public class Currency {

  public static void main(String[] args) {
    

    //NumberFormat currency = NumberFormat.getCurrencyInstance();
    //String result =currency.format(123456);
// another method
String result = NumberFormat.getCurrencyInstance().format(123456);


System.out.println(result);

  }



}
