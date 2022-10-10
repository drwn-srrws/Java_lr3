import java.util.Random;
public class Main {
    public static void main(String[] args) {
        char с1;
        byte b1 = 2;
        byte b2 = 5;
        double d1,d2;
        String str1 = b1+"."+b2;
        d1= 2;
        d1= Double.parseDouble(str1);
        Random random = new Random();
        d2 = random.nextDouble(100);
        b1 = (byte)Math.round(d2);
        double y = (Math.pow(d1+d2, 1/3)) / (Math.sin(b1)+ Math.cos(b2));
        System.out.println(d2);
    }
}
