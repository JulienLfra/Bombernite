public class MainTest {

	public static void main(String[] args) {
		Bomb bomb1 = new Bomb();
		System.out.println(bomb1.toString());
		Player player1 = new Player();
		System.out.println(player1.toString());
		Monster monster1 = new Monster(0,5);
		System.out.println(monster1.toString());
		
		TimerGame timer = new TimerGame();
		timer.schedule(timer.getTimerTask(), 1000, 1000);
	}

}

