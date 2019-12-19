package server;

import java.io.*;
import java.net.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Rank;

import model.Admin;
import model.DataConnect;
import model.User;

public class Server implements Protocal {
	private Socket s;
	private static ObjectInputStream ois;
	private static ObjectOutputStream oos;

	@SuppressWarnings("static-access")
	public Server() throws IOException, SQLException, ClassNotFoundException {
		ServerSocket ss = new ServerSocket(1522);
		while (true) {
			s = ss.accept();
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			int command = ois.readInt();
			if (command == U_LOGIN) {
				this.u_login();
			}
			if (command == U_REGISTER) {
				this.register();
			}
			if (command == U_ALTERNAME) {
				this.alterName();
			}
			if (command == U_ALTERPW) {
				this.alterPw();

			}
			if (command == A_LOGIN) {
				this.a_login();
			}
			if (command == A_ADDUSER) {
				this.addUser();

			}
			if (command == A_DELETEUSER) {
				this.deleteUser();

			}
			if (command == A_GETUSER) {
				this.getUser();

			}
			if (command == A_UPDATEUSER) {
				this.updateuser();

			}
//			if (command == D_UPSCOREL3) {
//				this.upScore3();
//
//			}
//			if (command == D_EXTRACT) {
//				this.extract();
//
//			}
//			if (command == TF_CONTRAST) {
//				this.Contrast();
//
//			}
//			if (command == TF_UPSCOREL1) {
//				this.upScore1();
//
//			}
//			if (command == TZ_UPSCOREL2) {
//				this.upScore2();
//
//			}
//			if (command == D_RANKLIST1) {
//				this.rankList1();
//
//			}
//			if (command == TZ_RANKLIST2) {
//				this.rankList2();
//			}
//			if (command == TF_RANKLIST) {
//				this.rankList();
//			}
//			if (command == PH_COMPARETO) {
//				this.compareTo();
//			}

		}

	}

	// USER
	// 登录
	public void u_login() throws SQLException, ClassNotFoundException,
			IOException {
		int uid = ois.readInt();
		String upw = ois.readUTF();
		User a = null;
		String sql = "select * from user where uid='" + uid + "' and upw = '"
				+ upw + "'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()) {
			a = new User(uid, rs.getString("uname"), upw);
		}
		oos.writeObject(a);
		oos.flush();
	}

	// 注册
	public void register() throws SQLException, ClassNotFoundException,
			IOException {
		@SuppressWarnings("unused")
		User u = (User) ois.readObject();
		String username = ois.readUTF();
		String uid = ois.readUTF();
		String password1 = ois.readUTF();
		String password2 = ois.readUTF();
		if (!password1.equals(password2))
			throw new IOException("两次输入的密码不一致");

		String sql = "insert into user(uid,uname,upw) values( '" + uid
				+ "' , '" + username + "','" + password1 + "')";
		DataConnect.getStat().executeUpdate(sql);
	}

	// 改名
	public void alterName() throws SQLException, ClassNotFoundException,
			IOException {
		User u = (User) ois.readObject();
		String sql = "update user set uname='" + u.getUname() + "' where uid ="
				+ u.getUid();
		System.out.println(sql);
		DataConnect.getStat().executeUpdate(sql);
	}

	// 改密
	public void alterPw() throws SQLException, ClassNotFoundException,
			IOException {
		User u = (User) ois.readObject();
		String sql = "update user set upw='" + u.getUpw() + "' where uid ="
				+ u.getUid();
		System.out.println(sql);
		DataConnect.getStat().executeUpdate(sql);
	}

	// Admin
	// 登入
	public void a_login() throws SQLException, ClassNotFoundException,
			IOException {
		String name = ois.readUTF();
		String pw = ois.readUTF();
		Admin a = null;
		String sql = "select * from admin where name='" + name + "' and pw = '"
				+ pw + "'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()) {
			a = new Admin(name, pw);
		}
		oos.writeObject(a);
		oos.flush();
	}

	// ADMIN
	// 增
	public void addUser() throws SQLException, ClassNotFoundException,
			IOException {
		@SuppressWarnings("unused")
		Admin a = (Admin) ois.readObject();
		User u = (User) ois.readObject();
		String sql = "insert into user (uid,uname,upw) values ('" + u.getUid()
				+ "','" + u.getUname() + "','" + u.getUpw() + "')";
		DataConnect.getStat().executeUpdate(sql);
	}

	// 删
	public void deleteUser() throws SQLException, ClassNotFoundException,
			IOException {
		@SuppressWarnings("unused")
		Admin a = (Admin) ois.readObject();
		int uid = ois.readInt();
		String sql = "delete from user where uid =" + uid;
		DataConnect.getStat().executeUpdate(sql);
	}

	// 查
	public void getUser() throws SQLException, ClassNotFoundException,
			IOException {
		@SuppressWarnings("unused")
		Admin a = (Admin) ois.readObject();
		String uid = ois.readUTF();
		User u = null;
		String sql = "select * from user where uid=" + uid;
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()) {
			u = new User(rs.getInt("uid"), rs.getString(2), rs.getString(3));
		}
		oos.writeObject(u);
		oos.flush();
	}

	// 改
	public void updateuser() throws SQLException, ClassNotFoundException,
			IOException {
		@SuppressWarnings("unused")
		Admin a = (Admin) ois.readObject();
		User u = (User) ois.readObject();
		String sql = "update user set uname='" + u.getUname() + "' , upw = '"
				+ u.getUpw() + "' where uid =" + u.getUid();
		System.out.println(sql);
		DataConnect.getStat().executeUpdate(sql);
	}

//	// DIFF
//	// 記錄分數*
//	public void upScore3() throws IOException, ClassNotFoundException {
//		User u = (User) ois.readObject();
//		int i = ois.readInt();
//		int j = ois.readInt();
//		try {
//			String sql = "insert into  find(uid,utime,uscore) values ('"
//					+ u.getUid() + "','" + i + "','" + j + "')";
//			DataConnect.getStat().executeUpdate(sql);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public void extract() throws SQLException, ClassNotFoundException,
//			IOException {
//		int id = ois.readInt();
//		int pid = ois.readInt();
//		String sql = "select * from picture where id='" + id + "'and pid='"
//				+ pid + "'";
//		ResultSet rs = DataConnect.getStat().executeQuery(sql);
//		model.difference d = null;
//		while (rs.next()) {
//			d = new model.difference(rs.getInt(3), rs.getInt(4), rs.getInt(5),
//					rs.getInt(6));
//		}
//		oos.writeObject(d);
//		oos.flush();
//
//	}
//
//	public static void rankList1() throws SQLException, ClassNotFoundException,
//			IOException {
//		ArrayList<Rank> rank = new ArrayList<Rank>();
//		String sql = "select * from find";
//		ResultSet rs = DataConnect.getStat().executeQuery(sql);
//		while (rs.next()) {
//			rank.add(new Rank(rs.getString(1), rs.getInt(2), rs.getInt(3)));
//		}
//		oos.writeObject(rank);
//		oos.flush();
//	}
//
//	// TF
//	// 对比，从数据库调出答案
//	public void Contrast() throws SQLException, ClassNotFoundException,
//			IOException {
//		String answer = (String) ois.readObject();
//		Boolean decide = false;// 判断答案的依据
//		String sql = "select * from 24answer where result='" + answer;
//		ResultSet rs = DataConnect.getStat().executeQuery(sql);
//		if (rs.next()) {
//			decide = true;
//			oos.writeObject(decide);
//			oos.flush();
//		}
//	}
//
//	public static void rankList() throws SQLException, ClassNotFoundException,
//			IOException {
//		ArrayList<Rank> rank = new ArrayList<Rank>();
//		String sql = "select * from twentyfour";
//		ResultSet rs = DataConnect.getStat().executeQuery(sql);
//		while (rs.next()) {
//			rank.add(new Rank(rs.getString(1), rs.getInt(2), rs.getInt(3)));
//		}
//		oos.writeObject(rank);
//		oos.flush();
//	}
//
//	// 记录分数
//	public void upScore1() throws IOException, ClassNotFoundException {
//		User u = (User) ois.readObject();
//		int i = ois.readInt();
//		int j = ois.readInt();
//		try {
//			String sql = "insert into  twentyfour (uid,utime,uscore) values ('"
//					+ u.getUid() + "','" + i + "','" + j + "')";
//			DataConnect.getStat().executeUpdate(sql);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	// TZ
//	// 记录分数和時間
//	public void upScore2() throws IOException, ClassNotFoundException {
//		User u = (User) ois.readObject();
//		int i = ois.readInt();
//		int j = ois.readInt();
//		try {
//			String sql = "insert into  tzfe (uid,utime,uscore) values ('"
//					+ u.getUid() + "','" + i + "','" + j + "')";
//			DataConnect.getStat().executeUpdate(sql);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public static void rankList2() throws SQLException, ClassNotFoundException,
//			IOException {
//		ArrayList<Rank> rank = new ArrayList<Rank>();
//		String sql = "select * from tzfe";
//		ResultSet rs = DataConnect.getStat().executeQuery(sql);
//		while (rs.next()) {
//			rank.add(new Rank(rs.getString(1), rs.getInt(2), rs.getInt(3)));
//		}
//		oos.writeObject(rank);
//		oos.flush();
//	}
//
//	// 排行榜
//	@SuppressWarnings("unchecked")
//	public static void compareTo() throws IOException, ClassNotFoundException {
//		ArrayList<Rank> rank = (ArrayList<Rank>) ois.readObject();
//		ArrayList<Rank> r1 = new ArrayList<Rank>();
//		r1.add(new Rank(null, 0, 0));
//		for (int i = 0; i < rank.size(); i++) {
//			for (int j = 0; j < rank.size() - 1; j++) {
//				if (rank.get(j).getUtime() > rank.get(j + 1).getUtime()) {
//					r1.set(0, rank.get(j));
//					rank.set(j, rank.get(j + 1));
//					rank.set(j + 1, r1.get(0));
//				}
//			}
//		}
//		for (int j = 0; j < rank.size(); j++) {
//		}
//		oos.writeObject(rank);
//		oos.flush();
//	}
//
//	@SuppressWarnings("unchecked")
//	public static void compareTo2() throws IOException, ClassNotFoundException {
//		ArrayList<Rank> rank = (ArrayList<Rank>) ois.readObject();
//		ArrayList<Rank> r1 = new ArrayList<Rank>();
//		r1.add(new Rank(null, 0, 0));
//		for (int i = 0; i < rank.size(); i++) {
//			for (int j = 0; j < rank.size() - 1; j++) {
//				if (rank.get(j).getUtime() > rank.get(j + 1).getUtime()) {
//					r1.set(0, rank.get(j));
//					rank.set(j, rank.get(j + 1));
//					rank.set(j + 1, r1.get(0));
//				}
//			}
//		}
//		for (int j = 0; j < rank.size(); j++) {
//		}
//		oos.writeObject(rank);
//		oos.flush();
//	}
//
	public static void main(String[] args) {
		try {
			new Server();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
