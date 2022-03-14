public class third_5 {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int c=1;
        int d=2;
        int e=2;
        int f=2;
        if (((e - a >= c) && (f >= b) && (b >= d)) || ((e - a >= d) && ((f >= b) && (b >= c))) || ((e - b >= d) && (f - a >= c)) || ((e - a >= c) && (f - b >= d)) || ((e - a >= d) && (f - b >= c))) {
            System.out.println("Дома входят границы участка");
        }else {
            System.out.println("Дома не входят");
    }
    }
}
