package klaseak;

import java.applet.AudioClip;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import errekurtsoakHartu.audioa;

public class pelota {
	private Integer puntuaketa1=0,puntuaketa2=0;
	public static boolean jokoaBukatu=false;
	private int x;
	private int y;
	private int dx=1, dy=1;
	private final int zabala=15, altuera=15;
	
	
	audioa audioa = new audioa();
	AudioClip rebote_pelota1=audioa.getAudioa("/errekurtsoak/rebote_pelota1.wav");
	AudioClip rebote_pelota2=audioa.getAudioa("/errekurtsoak/rebote_pelota2.wav");
	AudioClip falta=audioa.getAudioa("/errekurtsoak/falta.wav");
	public pelota (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Rectangle2D getPelota () {
		return new Rectangle2D.Double(x,y,zabala,altuera);
	}
	public void mugitu (Rectangle limiteak, boolean kolisioar1, boolean kolisioar2) {
		x+=dx;
		y+=dy;
		
		if (kolisioar1) {
			dx=-dx;
			x=25;
		}
		if (kolisioar2) {
			dx=-dx;
			x=740;
		}
		if (x<limiteak.getMinX()) {
			puntuaketa2++;
			
			x=(int) limiteak.getCenterX();
			y=(int) limiteak.getCenterY();
			dx=-dx;
			falta.play();
		}
		if (x+ zabala>=limiteak.getMaxX()) {
			puntuaketa1++;
			x=(int) limiteak.getCenterX();
			y = (int) limiteak.getCenterY();
			dx=-dx;
			audioa.getAudioa("errekurtsoak/falta.wav").play();
		}
		if (y>limiteak.getMaxY()) {
			dy=-dy;
			rebote_pelota2.play();
		}
		if (y<0) {
			dy = -dy;
			rebote_pelota1.play();
		}
	}
	
	public int getPuntuaketa1 () {
		return puntuaketa1;
	}
	public int getPuntuaketa2 () {
		return puntuaketa2;
	}
}
