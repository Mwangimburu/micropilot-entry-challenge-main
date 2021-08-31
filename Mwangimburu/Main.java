public class Main {

    public static void main(String[] args) {
        CountZeros countObject = new CountZeros();

        int [] arr = {1,8,0,4,0,8,0};

        int zeros = countObject.countZeros(arr);
        
        System.out.println(zeros);
    }
}
