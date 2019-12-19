package model;

import java.awt.Color;
import java.awt.Component;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class tread extends Thread{
	JLabel jLabel;
	JLabel jLabel2;
	 int time;
	static int time2=1;//用于计算
	public tread(int time,JLabel jLabel,JLabel jLabel2) {
		// TODO Auto-generated constructor stub
		this.jLabel=jLabel;
		this.time=time;
		this.jLabel2=jLabel2;
	}
	 public void run() {
         while(time>0) {
             time--;
             if(time<10) {//当时间只剩5秒时闪红
            	 jLabel.setForeground(Color.RED);
            	 jLabel2.setForeground(Color.RED);
             }
             jLabel.setText(time+"");
             jLabel2.setText("秒");
             time2=time;
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
         JOptionPane.showMessageDialog(new JPanel(), "遊戲結束，你輸了");
     }
	 public int fanghui(){
		return time2;
	 }
 }
