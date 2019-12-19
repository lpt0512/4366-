package server;


import java.io.*;
import java.net.*;

import java.util.ArrayList;

import javax.swing.JLabel;

import model.Rank;

import model.Admin;
import model.User;
import model.difference;

public class Client implements Protocal {
	private static Socket s;
	private static ObjectOutputStream oos;
	private static ObjectInputStream ois;

	private static void init() throws UnknownHostException, IOException {
		s = new Socket("10.53.46.112", 1522);
		oos = new ObjectOutputStream(s.getOutputStream());
		ois = new ObjectInputStream(s.getInputStream());
	}

	// 用户
	// 登录
	public static User login(int uid, String upw)
			throws UnknownHostException,ClassNotFoundException, IOException {
//		 if (s == null)
		init();
		oos.writeInt(U_LOGIN);
		oos.flush();
		oos.writeInt(uid);
		oos.flush();
		oos.writeUTF(upw);
		oos.flush();
		User u = (User) ois.readObject();
		return u;
	}

	// 注册
	public static void register(User u, String username, String password1,
			String password2, String uid) throws Exception, IOException {
		// if (s == null)
		init();
		oos.writeInt(U_REGISTER);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
		oos.writeUTF(username);
		oos.flush();
		oos.writeUTF(uid);
		oos.flush();
		oos.writeUTF(password1);
		oos.flush();
		oos.writeUTF(password2);
		oos.flush();
	}

	// 改名
	public static void alterName(User u) throws ClassNotFoundException,
			IOException {
		// if (s == null)
		init();
		oos.writeInt(U_ALTERNAME);
		oos.flush();
		oos.writeObject(u);
		oos.flush();

	}

	// 改密
	public static void alterPw(User u) throws ClassNotFoundException,
			IOException {
		// if (s == null)
		init();
		oos.writeInt(U_ALTERPW);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
	}

	// 管理员
	// 登入
	public static Admin login(String name, String pw)
			throws ClassNotFoundException, IOException {
		// if (s == null)
		init();
		oos.writeInt(A_LOGIN);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(pw);
		oos.flush();
		Admin u = (Admin) ois.readObject();
		return u;
	}

	// 增
	public static void addUser(Admin a, User u) throws ClassNotFoundException,
			IOException {
		// if (s == null)
		init();
		oos.writeInt(A_ADDUSER);
		oos.flush();
		oos.writeObject(a);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
	}

	// 删
	public static void deleteUser(Admin a, int uid)
			throws ClassNotFoundException, IOException {
		// if (s == null)
		init();
		oos.writeInt(A_DELETEUSER);
		oos.flush();
		oos.writeObject(a);
		oos.flush();
		oos.writeInt(uid);
		oos.flush();

	}

	// 查
	public static User getUser(Admin a, int uid) throws ClassNotFoundException,
			IOException {
		// if (s == null)
		init();
		oos.writeInt(A_GETUSER);
		oos.flush();
		oos.writeObject(a);
		oos.flush();
		oos.writeInt(uid);
		oos.flush();
		User u = (User) ois.readObject();
		return u;
	}

	// 改
	public static void updateuser(Admin a, User u)
			throws ClassNotFoundException, IOException {
		// if (s == null)
		init();
		oos.writeInt(A_UPDATEUSER);
		oos.flush();
		oos.writeObject(a);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
	}

	// 找不同
	// 记录分数
//	public static void upScore3(User u, int i, int j) throws IOException {
//		// if (s == null)
//		init();
//		oos.writeInt(D_UPSCOREL3);
//		oos.flush();
//		oos.writeObject(u);
//		oos.flush();
//		oos.writeInt(i);
//		oos.flush();
//		oos.writeInt(j);
//		oos.flush();
//	}
//
//	public static difference extract(int id, int pid)
//			throws ClassNotFoundException, IOException {
//		// if (s == null)
//		init();
//		oos.writeInt(D_EXTRACT);
//		oos.flush();
//		oos.writeInt(id);
//		oos.flush();
//		oos.writeInt(pid);
//		oos.flush();
//		difference d = (difference) ois.readObject();
//		return d;
//
//	}
//
//	public static void judge(int x, int y, int suiji, JLabel jLabel,
//			difference d, difference d2) throws ClassNotFoundException,
//			IOException {
//		// if (s == null)
//		init();
//		oos.writeInt(D_JUDGE);
//		oos.flush();
//		oos.writeInt(x);
//		oos.flush();
//		oos.writeInt(y);
//		oos.flush();
//		oos.writeInt(suiji);
//		oos.flush();
//		oos.writeObject(jLabel);
//		oos.flush();
//		oos.writeObject(d);
//		oos.flush();
//		oos.writeObject(d2);
//		oos.flush();
//	}
//
//	@SuppressWarnings("unchecked")
//	public static ArrayList<Rank> rankList1() throws ClassNotFoundException,
//			IOException {
//		// if (s == null)
//		init();
//		oos.writeInt(D_RANKLIST1);
//		oos.flush();
//		ArrayList<Rank> rank = (ArrayList<Rank>) ois.readObject();
//		return rank;
//
//	}
//
//	@SuppressWarnings("unchecked")
//	public static ArrayList<Rank> rankList2() throws ClassNotFoundException,
//			IOException {
//		// if (s == null)
//		init();
//		oos.writeInt(TZ_RANKLIST2);
//		oos.flush();
//		ArrayList<Rank> rank = (ArrayList<Rank>) ois.readObject();
//		return rank;
//	}
//
//	// 24
//	// 对比，从数据库调出答案
//	public static Boolean Contrast(String answer)
//			throws ClassNotFoundException, IOException {
//		// if (s == null)
//		init();
//		oos.writeInt(TF_CONTRAST);
//		oos.flush();
//		oos.writeUTF(answer);
//		oos.flush();
//		Boolean decide = (Boolean) ois.readObject();
//		return decide;
//	}
//
//	// 记录分数
//	public static void upScore1(User u, int i, int j) throws IOException {
//		// if (s == null)
//		init();
//		oos.writeInt(TF_UPSCOREL1);
//		oos.flush();
//		oos.writeObject(u);
//		oos.flush();
//		oos.writeInt(i);
//		oos.flush();
//		oos.writeInt(j);
//		oos.flush();
//	}
//
//	@SuppressWarnings("unchecked")
//	public static ArrayList<Rank> rankList() throws ClassNotFoundException,
//			IOException {
//		// if (s == null)
//		init();
//		oos.writeInt(TF_RANKLIST);
//		oos.flush();
//		ArrayList<Rank> rank = (ArrayList<Rank>) ois.readObject();
//		return rank;
//	}
//
//	// 2048
//	public static void upScore2(User u, int i, int j) throws IOException {
//		// if (s == null)
//		init();
//		oos.writeInt(TZ_UPSCOREL2);
//		oos.flush();
//		oos.writeObject(u);
//		oos.flush();
//		oos.writeInt(i);
//		oos.flush();
//		oos.writeInt(j);
//		oos.flush();
//	}
//	public static ArrayList<Rank> compareTo(ArrayList<Rank> rank) throws IOException, ClassNotFoundException{
//		// if (s == null)
//		init();
//		oos.writeInt(PH_COMPARETO);
//		oos.flush();
//		oos.writeObject(rank);
//		oos.flush();
//		ArrayList<Rank> ran = (ArrayList<Rank>) ois.readObject();
//		return ran;
//		
//	}
//	public static ArrayList<Rank> compareTo2(ArrayList<Rank> rank) throws IOException, ClassNotFoundException{
//		// if (s == null)
//		init();
//		oos.writeInt(PH_COMPARETO2);
//		oos.flush();
//		oos.writeObject(rank);
//		oos.flush();
//		ArrayList<Rank> ran = (ArrayList<Rank>) ois.readObject();
//		return ran;
//		
//	}

}
