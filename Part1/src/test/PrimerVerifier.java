package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PrimerVerifier implements Runnable{


    BlockingQueue<Message> isPrimeQ = new ArrayBlockingQueue<>(100);
    BlockingQueue<Integer> randomIntQ = new ArrayBlockingQueue<>(100);

	public PrimerVerifier(BlockingQueue<Integer> randomIntQ,
			BlockingQueue<Message> isPrimeQ) {
		this.isPrimeQ = isPrimeQ;
		this.randomIntQ = randomIntQ;		
	}

	
	boolean isPrime(int n) {
		
		if (n%2==0) return false;
	
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	@Override
	public void run() {
		for (int i = 0; i < 50 ; i++) {
			try {
				Integer rInteger = randomIntQ.take();
				isPrimeQ.add(new Message(rInteger, isPrime(rInteger)));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}