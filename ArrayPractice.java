import java.util.Arrays;

public class ArrayPractice {

public static void main(String[] args) {

int [] numbers = new int [5];
numbers[0]=1;
System.out.println(numbers);
System.out.println(Arrays.toString(numbers));

 ///
 int [] numbers2 = {4,2,5,1,3};
 System.out.println(numbers2.length);
 Arrays.sort(numbers2);
 System.out.println(Arrays.toString(numbers2));
 

}
}