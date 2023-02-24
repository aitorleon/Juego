package klaseak;

import java.util.logging.Level;
import java.util.logging.Logger;

public class haria extends Thread {
	basea lamina;
	public haria (basea lamina) {
		this.lamina=lamina;
	}
	@Override
	public void run () {
		while (true) {
			try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(haria.class.getName()).log(Level.SEVERE, null, ex);
            }
            lamina.repaint();
		}
	}
}
