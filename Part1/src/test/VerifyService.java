package test;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class VerifyService {
    public static void main(String[] args) {
        //Creating BlockingQueue of size 100
        BlockingQueue<Message> isPrimeQ = new ArrayBlockingQueue<>(100);
        BlockingQueue<Integer> randomIntQ = new ArrayBlockingQueue<>(100);

        Randomizer randomizer = new Randomizer(randomIntQ, isPrimeQ);
        PrimerVerifier primerVerifier = new PrimerVerifier(randomIntQ, isPrimeQ);

        new Thread(randomizer).start();
        new Thread(primerVerifier).start();

    }

}