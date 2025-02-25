package 뮤직플레이어실습1;

import java.io.FileInputStream;import javazoom.jl.decoder.JavaLayerError;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MyMp3Player {
	private Player player;
	
	public void play(String path) {
		try {
			if(player!=null) {
				player.close();
			}
			
			FileInputStream fileInputStream = new FileInputStream(path);
			player = new Player(fileInputStream);
			new Thread(() -> {
				try {
					player.play();
				}catch(JavaLayerException e) {
					e.printStackTrace();
				}
			}).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void stop() {
		if(player != null) {
			player.close();
		}
	}
	

}
