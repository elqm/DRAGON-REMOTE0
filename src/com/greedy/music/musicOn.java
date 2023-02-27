package com.greedy.music; 
import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class musicOn {
	public void musicOn() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		
		bgm = new File("Sound/sound.Wav"); 
		Clip clip;
		
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip)AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
			
		} catch (Exception e) {
			System.out.println("err : " + e);
			}
		
	}

	public static void main(String[] args) {
		musicOn test = new musicOn();
		while(true) {
			try {
				test.musicOn();
				  Thread.sleep(94000); // 3초에 한번씩 재생하도록 설정
			} catch(Exception e) {
				
			}
		}

	}

}