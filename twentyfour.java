package twentyfour;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class twentyfour {

	 private String uid;//id
	 private int uscore;//得分
    private String answer;//用户的答案
    private  String playtime;//使用的时间
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
	 // 给定2个数和指定操作符的计算
	 public static void calcute() {

	 }

	 // 计算生成24的函数
	 public static void calculate() {

	 }


	 public void gamewin() {

	 }

	 public void gameover() {

	 }
*/
	 //对比，从数据库调出答案
	 public Boolean Contrast(String answer) throws SQLException, ClassNotFoundException{
		 Boolean decide=false;//判断答案的依据
		 String sql = "select * from 24answer where result='" + answer ;
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if (rs.next()) {
		decide=true;
	}
	return decide;
	 }
	 //记录分数
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
