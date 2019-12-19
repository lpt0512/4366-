package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User implements Serializable {

	private String uname;
	private int uid;
	private String upw;
	// 2048
	private int bestresult;
	private int besttime;
	// 24点
	private int bestscore;
	// 找茬
	private int best;
	private int time;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public int getBestresult() {
		return bestresult;
	}

	public void setBestresult(int bestresult) {
		this.bestresult = bestresult;
	}

	public int getBesttime() {
		return besttime;
	}

	public void setBesttime(int besttime) {
		this.besttime = besttime;
	}

	public int getBestscore() {
		return bestscore;
	}

	public void setBestscore(int bestscore) {
		this.bestscore = bestscore;
	}

	public int getBest() {
		return best;
	}

	public void setBest(int best) {
		this.best = best;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public User(int uid, String uname, String upw) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upw = upw;
	}

	

//	// 登录
//	public static User login(int uid, String upw) throws SQLException,
//			ClassNotFoundException {
//		User u = null;
//		String sql = "select * from user where uid='" + uid + "' and upw = '"
//				+ upw + "'";
//		ResultSet rs = DataConnect.getStat().executeQuery(sql);
//		if (rs.next()) {
//			u = new User(uid, rs.getString("uname"), upw);
//		}
//		return u;
//	}
//
//	// 注册
//	public static void register(String username, String password1,
//			String password2, int uid) throws Exception {
//		if (!password1.equals(password2))
//			throw new Exception("两次输入的密码不一致");
//
//		String sql = "insert into user(uid,uname,upw) values( '" + uid
//				+ "' , '" + username + "','" + password1 + "')";
//		DataConnect.getStat().executeUpdate(sql);
//	}
//
//	// 改名
//	public void alterName(User u) throws SQLException, ClassNotFoundException {
//		String sql = "update user set uname='" + u.getUname() + "' where uid ="
//				+ u.getUid();
//		System.out.println(sql);
//		DataConnect.getStat().executeUpdate(sql);
//	}
//
//	// 改密
//	public void alterPw(User u) throws SQLException, ClassNotFoundException {
//		String sql = "update user set upw='" + u.getUpw() + "' where uid ="
//				+ u.getUid();
//		System.out.println(sql);
//		DataConnect.getStat().executeUpdate(sql);
//	}
//
//	public static void main(String[] args) throws Exception {
//		register("6666", "6666", "6666", 6666);
//	}
}