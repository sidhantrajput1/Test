
// Calculate the sum of all elements in the elements in the given array.
class ArrayExample {
    void sumOfArrays() {
        int [] arr = {1,2,9,5};
        int sum =0;
        
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
}
public class Main {
    public static void main (String[] args) {
        ArrayExample obj = new ArrayExample();
        
        obj.sumOfArrays();
    }
}
