package errekurtsoakHartu;
import java.applet.AudioClip;
public class audioa {
	public AudioClip getAudioa (String bidea) {
		return java.applet.Applet.newAudioClip(getClass().getResource(bidea));
	}
}
