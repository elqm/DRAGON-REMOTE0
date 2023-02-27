package com.greedy.music;

import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
public class music {
	
	private static InputStream In;
	private static AudioStream BGM;
	private static AudioPlayer MGP = AudioPlayer.plyer;
	 
	public  music(String bgm) {
		
		In = music.class.getResourceAsStream("/bgm/"+bgm);
	}
		
	public static void Play(){
		BGM = new AudioInputStream(In);
		MGP.start(BGM);
	}
	

	
	

}