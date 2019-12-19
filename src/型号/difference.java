package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class difference {

	 private String uid;
	 private int uscore;
	 private int x1;
	 private int x2;
	 private int y1;
	 private int x;
	 private int y;
	 private boolean j1;
	 private boolean j2;
	 private boolean j3;
	 public boolean isJ3() {
		return j3;
	}
	public void setJ3(boolean j3) {
		this.j3 = j3;
	}
	private int num;
	 private int id;
	 private int pid;
	 public difference(int x,int y,boolean j1,boolean j2 , int num){
		 this.x=x;
		 this.y=y;
		 this.j1=j1;
		 this.j2=j2;
		 this.num=num;
	 }
	 public difference(boolean j1,boolean j2 ,boolean j3 ,int num){
		 this.j1=j1;
		 this.j2=j2;
		 this.j3=j3;
		 this.num=num;
	 }
	 public difference(int x1,int x2,int y1,int y2) {
		super();
		// TODO Auto-generated constructor stub
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	 public difference(int id){
		 this.id=id;
	 }
	 public void add(difference d){
		 this.num=num+3;
		 d.j1=true;
		 d.j2=true;
		 d.j3=true;
	 }
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	private int y2;
/*
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

	 public void score() {

	 }

	 public static void refreshBest() {

	 }
*/
	 public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public boolean isJ1() {
			return j1;
		}
		public void setJ1(boolean j1) {
			this.j1 = j1;
		}
		public boolean isJ2() {
			return j2;
		}
		public void setJ2(boolean j2) {
			this.j2 = j2;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
	 //記錄分數
	 public static void gold(String uid,String time) throws SQLException, ClassNotFoundException{
		 String sql = "insert into find (uid,time) values ('" + uid
			+ "','"+time +"')";
	DataConnect.getStat().executeUpdate(sql);
	 }
	 public  difference extract(int id,int pid) throws SQLException, ClassNotFoundException{
		 String sql = "select * from picture where id='"+id+"'and pid='"+pid+"'" ;
	     ResultSet rs = DataConnect.getStat().executeQuery(sql);
	     difference d=null;
	while(rs.next()) {
		d= new difference(rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
	}
	return d;
	
	 }
	 public  int[] random(){
		 int a[]=new int[4];
			int n = 4;
			int b=0;
			Random rand = new Random();
			boolean[] bool = new boolean[5];
			int num = 0;
			for (int i = 0; i <n; i++) {
			do {
			// 如果产生的数相同继续循环
			num = rand.nextInt(n)+1;
			} while (bool[num]);
			bool[num] = true;
			a[b]=num;
			b++;
			}
			
		return a;
		 
	 }
	 public String tupianl(int a){
		 String tupian=null;
		 if(a==1){
			  tupian="1.jpg";
		 }
		 if(a==2){
			  tupian="3.png";
		 }if(a==3){
			  tupian="6.png";
		 }if(a==4){
			 tupian="8.png";
		 }
		 return tupian;
		 
	 }
	 public String tupianr(int a){
		 String tupian=null;
		 if(a==1){
			  tupian="2.jpg";
		 }
		 if(a==2){
			  tupian="4.jpg";
		 }if(a==3){
			  tupian="5.jpg";
		 }if(a==4){
			 tupian="7.jpg";
		 }
		 return tupian;
		 
	 }
	/* public static void judge(int x,int y,boolean j1,boolean j2 , int num,JLabel jLabel){
		 if (num != 0) {
				if (j1) {
					if ((x > 255 && x < 267) && (y > 286 && y < 305)) {
						JOptionPane.showMessageDialog(new JPanel(),
								"找到了");
						j1 = false;
						num = num - 1;
						jLabel.setText("还没找出不同的个数：" + num);
					}
				}

				if (j2) {
					if ((x > 434 && x < 490) && (y > 294 && y < 305)) {
						JOptionPane.showMessageDialog(new JPanel(),
								"找到了");
						j2 = false;
						num = num - 1;
						jLabel.setText("还没找出不同的个数：" + num);
					}
				}
			}

	 }*/ 
	 public void judge(int x,int y,int suiji,JLabel jLabel,difference d,difference d2) throws SQLException, ClassNotFoundException{
			
			 if (d.getNum() != 0) {
					if (d.isJ1()) {
						d2=extract(suiji,1);
						if ((x >d2.x1 && x < d2.x2) && (y > d2.y1 && y < d2.y2)) {
							JOptionPane.showMessageDialog(new JPanel(),
									"找到了");
							d.j1 = false;
							d.num = d.num - 1;
							jLabel.setText("还没找出不同的个数：" + d.num);
						}
					}

					if (d.isJ2()) {
						d2=extract(suiji,2);
						if ((x >d2.x1 && x < d2.x2) && (y > d2.y1 && y < d2.y2)) {
							JOptionPane.showMessageDialog(new JPanel(),
									"找到了");
							d.j2 = false;
							d.num = d.num - 1;
							jLabel.setText("还没找出不同的个数：" + d.num);
						}
					}
					if (d.isJ3()) {
						d2=extract(suiji,3);
						if ((x >d2.x1 && x < d2.x2) && (y > d2.y1 && y < d2.y2)) {
							JOptionPane.showMessageDialog(new JPanel(),
									"找到了");
							d.j3 = false;
							d.num = d.num - 1;
							jLabel.setText("还没找出不同的个数：" + d.num);
						}
					
				}
			 }
		 }
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		 int id =1,x2 =6666,y1 = 0,y2 = 0;
	  boolean j2 = false;boolean j3 = false;
	  difference d1=new difference(id,x2,j2,j3,y1);
	  d1.j1=true;
	  System.out.println(d1.num);
	  
	  System.out.println(d1.num);
	
	 }
	}