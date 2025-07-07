import java.util.Random;

public class OrderIDGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        String[] orderIDS = new String[5];
        for(int i =0; i <orderIDS.length; i++){
            //This genrates a random between A and E
            char prefix = (char)(random.nextInt(5)+ 'A');

            //This generates a random number from 1 to 999 and format it with leading zeros
            int number = random.nextInt(999) + 1;
            String suffix = String.format("%03d",number);

            //Combine prefix and suffix to form the orderId
            orderIDS[i]= prefix + suffix;
        }
        for (String orderID : orderIDS) {
            System.out.println(orderID);
        }
    }
}
