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
	static int time2=1;//���ڼ���
	public tread(int time,JLabel jLabel,JLabel jLabel2) {
		// TODO Auto-generated constructor stub
		this.jLabel=jLabel;
		this.time=time;
		this.jLabel2=jLabel2;
	}
	 public void run() {
         while(time>0) {
             time--;
             if(time<10) {//��ʱ��ֻʣ5��ʱ����
            	 jLabel.setForeground(Color.RED);
            	 jLabel2.setForeground(Color.RED);
             }
             jLabel.setText(time+"");
             jLabel2.setText("��");
             time2=time;
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
         JOptionPane.showMessageDialog(new JPanel(), "�[��Y������ݔ��");
     }
	 public int fanghui(){
		return time2;
	 }
 }
