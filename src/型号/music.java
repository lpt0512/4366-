package model;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.TargetDataLine;

import java.io.*; 
import java.net.URL; 
import sun.audio.*; 

/** 
* 
* @author wuhuiwen 
* 播放音频文件，产生音效 
*/ 
public class music { 
    private AudioStream  as; //单次播放声音用 
    ContinuousAudioDataStream cas;//循环播放声音 
    // 构造函数 
    public music(URL url) 
    { 
        try { 
            //打开一个声音文件流作为输入 
            as = new AudioStream (url.openStream()); 
        } catch (FileNotFoundException e) { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } catch (IOException e) { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 
    } 
    // 一次播放 开始 
    public void start() 
    { 
        if( as==null ){ 
            System.out.println("AudioStream object is not created!"); 
            return; 
        }else{ 
            AudioPlayer.player.start (as); 
        } 
    } 
    // 一次播放 停止 
    public void stop() 
    { 
        if( as==null ){ 
            System.out.println("AudioStream object is not created!"); 
            return; 
        }else{ 
            AudioPlayer.player.stop(as); 
        }        
    } 
    // 循环播放 开始 
    public void continuousStart() 
    { 
        // Create AudioData source. 
        AudioData data = null; 
        try { 
            data = as.getData(); 
        } catch (IOException e) { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 

        // Create ContinuousAudioDataStream. 
        cas = new ContinuousAudioDataStream (data); 

        // Play audio. 
        AudioPlayer.player.start(cas); 
    } 
    // 循环播放 停止 
    public void continuousStop() 
    { 
        if(cas != null) 
        { 
            AudioPlayer.player.stop (cas); 
        }    
    } 
public static void main(String[] args) throws MalformedURLException {
	URL cb;
	File f = new File("D:\\11611.wav");
	cb = f.toURL();
	music myMusicPlay = new music(cb); 
	myMusicPlay.start();//播放一次 
}
}

