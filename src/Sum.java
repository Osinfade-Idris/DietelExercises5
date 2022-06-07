public class Sum {
    public static void main(String[] args) {
        int total=0;
        int number;

        for (number=2; number<=20; number+=2)
            total +=number;
        System.out.printf("%d ", total);
    }
}
