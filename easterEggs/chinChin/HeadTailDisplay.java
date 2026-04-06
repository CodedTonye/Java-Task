import java.security.SecureRandom;

public class HeadTailDisplay {
    
    public static void main(String[] args) {

	SecureRandom randomNumbers = new SecureRandom();

	int randomNum = randomNumbers.nextInt(2);

	switch (randomNum) {
            case 0 -> System.out.println("Head");
	    case 1 -> System.out.println("Tail");
    }
	System.out.println(randomNum);
  }
}