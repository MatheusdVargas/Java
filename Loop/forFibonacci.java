public class forFibonacci {
    public static void main(String[] args) {
        long p0 = 1, p1 = 1, p2;
        System.out.print(p0 + ", " + p1);
        for(int i=3; i<= 50; i++) {
            p2 = p0 + p1;
            System.out.print(", " + p2);
            p0 = p1;
            p1 = p2;
        }
    }
}
