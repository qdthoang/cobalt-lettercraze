package player.view;

import java.awt.EventQueue;

public class PlayerApplication {
	public static void main(String[] args) {
		SplashScreenWindow splashScreen = new SplashScreenWindow(1000);
		splashScreen.showSplash();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuScreenFrame frame = new MenuScreenFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
