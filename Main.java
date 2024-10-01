/*public class finder {
    
    private int n;
    private int count;

    count=0;

    for(int i=0;i++;i>n) {
        if(i%5 == 0) {
            count+=i;
        }
        if(i%7 == 0) {
            count+=i;
        }
    } 
     
    return count;
}*/

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOf(20));
        int[] array = {1,2,3,4};
        System.out.println(repeatArray(array));
    }

    private static int sumOf(int n) {
        int sum= 0;
        for(int i=0; i<n; i++) {
            if(i%5 == 0 || i%7 == 0) {
                sum += i;
            }
        }
        return sum;
    }


public static boolean repeatArray(int[] array){
    int count = 0;
    for(int i = 0; i < array.length; i++) {
        count = 0;
        for(int j = 0; j < array.length; j++) {
            if(array[j] == array[i]) {
                count = count + 1;
            }
         if(count>1) {
            return true;
         }    
        }
    }
    return false;
}
}



