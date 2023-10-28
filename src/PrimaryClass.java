import java.util.Random;

public class PrimaryClass {
    public static void main(String[] args) {
        int largest = 1;
        int smallest = 100;
        int numberOfIntegers = 10;
        int count= 0;
        Random rand = new Random();

        while(count < numberOfIntegers ){
            int randomNumber = rand.nextInt(100)+1;

            if(randomNumber > largest){
                largest = randomNumber;
            }
            if (randomNumber < smallest){
                smallest = randomNumber;
            }

            System.out.println(randomNumber);
            count++;



        }
        System.out.println("The Biggest number is: "+largest);
        System.out.println("The smallest number is: "+smallest);

    }



}
