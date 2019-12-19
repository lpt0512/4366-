package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin implements Serializable{

	private String name;
	private String pw;

	public Admin(String uname, String apw) {
		super();

		this.name = name;
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

//	 // 登入
//	 public static Admin login(String name, String pw) throws SQLException,
//	 ClassNotFoundException {
//	 Admin a = null;
//	 String sql = "select * from admin where name='" + name + "' and pw = '"
//	 + pw + "'";
//	 ResultSet rs = DataConnect.getStat().executeQuery(sql);
//	 if (rs.next()) {
//	 a = new Admin(name, pw);
//	 }
//	 return a;
//	 }
//	
//	 // 增
//	 public void addUser(User u) throws SQLException, ClassNotFoundException {
//	
//	 String sql = "insert into user (uid,upw) values ('" + u.getUid()
//	 + "','" + u.getUpw() + "')";
//	 DataConnect.getStat().executeUpdate(sql);
//	 }
//	
//	 // 删
//	 public void deleteUser(int uid) throws SQLException,
//	 ClassNotFoundException {
//	
//	 String sql = "delete from user where uid =" + uid;
//	 DataConnect.getStat().executeUpdate(sql);
//	 }
//	
//	 // 查
//	 public User getUser(int uid) throws SQLException, ClassNotFoundException
//	 {
//	 User u = null;
//	 String sql = "select * from user where uid=" + uid;
//	 ResultSet rs = DataConnect.getStat().executeQuery(sql);
//	 if (rs.next()) {
//	 u = new User(rs.getInt("uid"), rs.getString(2), rs.getString(3));
//	 }
//	 return u;
//	 }
//	
//	 // 改
//	 public void updateuser(User u) throws SQLException,
//	 ClassNotFoundException {
//	 String sql = "update user set uname='" + u.getUname() + "' , upw = '"
//	 + u.getUpw() + "' where uid =" + u.getUid();
//	 System.out.println(sql);
//	 DataConnect.getStat().executeUpdate(sql);
//	 }

}