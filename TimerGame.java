// 5/10/2018 - Guillaume Bozon
// Classe permettant de créer un timer
// Version : 1.0.0

import java.util.Timer;
import java.util.TimerTask;

public class TimerGame extends Timer {

	// Attribut
	// ----------------------------------------------------------------------------------------
	int delais;
	static int k;
	Timer t;
	TimerTask timerTask;

	// Constructeur
	// -------------------------------------------------------------------------------------
	public TimerGame() {
		delais = 1000;
		k = 0;
		t = new Timer();
		timerTask = new TimerTask() {
			@Override
			public void run() {
				k++;
				System.out.println("Time: " + k);
			}
		};
	}

	// Méthode
	// ------------------------------------------------------------------------------------------*
	public TimerTask getTimerTask() {
		return timerTask;
	}
}
