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
* ������Ƶ�ļ���������Ч 
*/ 
public class music { 
    private AudioStream  as; //���β��������� 
    ContinuousAudioDataStream cas;//ѭ���������� 
    // ���캯�� 
    public music(URL url) 
    { 
        try { 
            //��һ�������ļ�����Ϊ���� 
            as = new AudioStream (url.openStream()); 
        } catch (FileNotFoundException e) { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } catch (IOException e) { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 
    } 
    // һ�β��� ��ʼ 
    public void start() 
    { 
        if( as==null ){ 
            System.out.println("AudioStream object is not created!"); 
            return; 
        }else{ 
            AudioPlayer.player.start (as); 
        } 
    } 
    // һ�β��� ֹͣ 
    public void stop() 
    { 
        if( as==null ){ 
            System.out.println("AudioStream object is not created!"); 
            return; 
        }else{ 
            AudioPlayer.player.stop(as); 
        }        
    } 
    // ѭ������ ��ʼ 
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
    // ѭ������ ֹͣ 
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
	myMusicPlay.start();//����һ�� 
}
}

