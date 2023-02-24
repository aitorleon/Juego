package klaseak;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class raketak {

    private int x, y;
    static final int zabala = 10, altuera = 40;

    public raketak(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle2D getRaketa() {
        return new Rectangle2D.Double(x, y, zabala, altuera);
    }
    public void Mugitu1 (Rectangle limiteak) {
    	if (teklatuEbentuak.w && y > limiteak.getMinY()) {
    		y--;
    	}
    	if (teklatuEbentuak.s && y < limiteak.getMaxY()-altuera) {
    		y++;
    	}
    }
    public void Mugitu2 (Rectangle limiteak) {
    	if (teklatuEbentuak.up && y > limiteak.getMinY()) {
    		y--;
    	}
    	if (teklatuEbentuak.down && y < limiteak.getMaxY()-altuera) {
    		y++;
    	}
    }
}
