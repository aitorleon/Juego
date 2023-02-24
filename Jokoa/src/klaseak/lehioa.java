package klaseak;

import javax.swing.JFrame;

public class lehioa extends JFrame {
	private final int zabala=800, altuera=500;
	private basea lamina;
	private haria haria;
	public lehioa () {
		setTitle("Pong");
		setSize(zabala, altuera);
		setLocationRelativeTo(null);
		setResizable(false);
		lamina = new basea();
		add(lamina);
		addKeyListener(new teklatuEbentuak());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		haria=new haria(lamina);
		haria.start();
	}
}
