package klaseak;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class basea extends JPanel {
	pelota pelota = new pelota(0,0);
	raketak r1 = new raketak(10, 200);
	raketak r2 = new raketak(784-10-raketak.zabala, 200);
	public basea() {
		setBackground(Color.BLACK);
	}
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.WHITE);
		marraztu(g2);
		eguneratu();
	}
	public void marraztu (Graphics2D g) {
		g.fill(pelota.getPelota());
		g.fill(r1.getRaketa());
		g.fill(r2.getRaketa());
	}
	public void eguneratu () {
		pelota.mugitu(getBounds(),kolisioa(r1.getRaketa()),kolisioa(r2.getRaketa()));
		r1.Mugitu1(getBounds());
		r2.Mugitu2(getBounds());
	}
	private boolean kolisioa (Rectangle2D r) {
		return pelota.getPelota().intersects(r);
	}
	public void iteratuJokoa () {
		while (true) {
			try {
				repaint();
				Thread.sleep(6);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
