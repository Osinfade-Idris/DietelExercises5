public class ProductOddInteger {
    public static void main(String[] args) {
        int product=1;
        for(int c = 1; c <=15; c+=2)
        {
          product=product*c;
        }
        System.out.println("Product is " + product);
    }
}
