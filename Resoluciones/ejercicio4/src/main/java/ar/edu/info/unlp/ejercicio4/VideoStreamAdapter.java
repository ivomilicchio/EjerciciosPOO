package ar.edu.info.unlp.ejercicio4;

public class VideoStreamAdapter implements Media {
	
	private VideoStream videoStream;
	
	public VideoStreamAdapter() {
		
		videoStream = new VideoStream();
	}
	
	public void play() {
		
		videoStream.reproduce();
	}

}
