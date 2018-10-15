import java.util.TimerTask;
import java.util.Timer;

public class MainTest {

	static int k = 0;
	
	public static void main(String[] args) {
		Bomb bomb1 = new Bomb();
		System.out.println(bomb1.toString());
		bomb1.die();
		System.out.println(bomb1.toString());
		
		// EXEMPLE TIMER FONCTIONNEL -------------------------------------------------------------
		TimerTask timerTask = new TimerTask(){
			
			@Override
			public void run(){
				test();
			}
		};
		
		Timer t = new Timer();
		t.schedule(timerTask, 1000, 1000);
	}
	
	public static void test(){
		k++;
		System.out.println("k: " + k);
	}
}
