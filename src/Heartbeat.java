
public class Heartbeat {

	public static void main(String[] args) {
		int n = 0;
		while (n<1000000) {
			System.out.println(n + " seconds have passed");
			n=n+1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
