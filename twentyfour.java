package twentyfour;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class twentyfour {

	 private String uid;//id
	 private int uscore;//�÷�
    private String answer;//�û��Ĵ�
    private  String playtime;//ʹ�õ�ʱ��
	 public String getUid() {
	  return uid;
	 }

	 public void setUid(String uid) {
	  this.uid = uid;
	 }

	 public int getUscore() {
	  return uscore;
	 }

	 public void setUscore(int uscore) {
	  this.uscore = uscore;
	 }
    public String getPlaytime() {
		return playtime;
	 }

	 public void setPlaytime(String playtime) {
		this.playtime = playtime;
	 }

/*
* 
* 
* 
	 // ����2������ָ���������ļ���
	 public static void calcute() {

	 }

	 // ��������24�ĺ���
	 public static void calculate() {

	 }


	 public void gamewin() {

	 }

	 public void gameover() {

	 }
*/
	 //�Աȣ������ݿ������
	 public Boolean Contrast(String answer) throws SQLException, ClassNotFoundException{
		 Boolean decide=false;//�жϴ𰸵�����
		 String sql = "select * from 24answer where result='" + answer ;
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if (rs.next()) {
		decide=true;
	}
	return decide;
	 }
	 //��¼����
	/* public void gold(User u,String time) throws SQLException, ClassNotFoundException{
		 String sql = "insert into twentyfour(uid,utime) values ('" + u.getUid()
			+ "','"+time +"')";
	DataConnect.getStat().executeUpdate(sql);
	 }*/
	 public void suiji(int  random ,JLabel jLabel){
		 if(random>=1&&random<=13){
			 String ulr=random+".gif";
				ImageIcon bk = new ImageIcon(this.getClass().getResource(ulr));
				jLabel.setIcon(bk);
		 }
	         if(random>=14&&random<=26){
	        	// random=random-13;
	        	 String ulr=random+".gif";
					ImageIcon bk = new ImageIcon(this.getClass().getResource(ulr));
					jLabel.setIcon(bk);
		 }	 if(random>=27&&random<=39){
			 //random=random-26;
        	 String ulr=random+".gif";
				ImageIcon bk = new ImageIcon(this.getClass().getResource(ulr));
				jLabel.setIcon(bk);
		 }	 if(random>=40&&random<=52){
			 //random=random-39;
        	 String ulr=random+".gif";
				ImageIcon bk = new ImageIcon(this.getClass().getResource(ulr));
				jLabel.setIcon(bk);
		 }
		 
	 }
}
