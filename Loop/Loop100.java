public class Loop100 {
    public static void main(String[] args) {
        for(int num=1; num<=100; num++) {
            if (num%3==0 || num%7 ==0) {
                System.out.println(num);
            }
        }
    }
}
