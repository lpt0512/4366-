package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.DataConnect;

public class Rank implements Comparable<Rank>{
	private String userName;
	private int utime;
	private int rank;
	
	
	public Rank(String userName,int utime,int rank) {
		super();
		this.userName=userName;
		this.utime=utime;
		this.rank=rank;
		// TODO Auto-generated constructor stub
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUtime() {
		return utime;
	}
	public void setUtime(int utime) {
		this.utime = utime;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@SuppressWarnings("null")
	public static  ArrayList<Rank> rankList() throws SQLException, ClassNotFoundException{		//24µ„
		String sql = "select * from twentyfour";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		ArrayList<Rank> rank = new ArrayList<Rank>();
		while (rs.next()) {
			rank.add(new Rank(rs.getString(1), rs.getInt(2), rs.getInt(3)));
		}
		return compareTo(rank);
	}

	public static  ArrayList<Rank> rankList1() throws SQLException, ClassNotFoundException{	//’“≤Á
		String sql = "select * from find";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		ArrayList<Rank> rank = new ArrayList<Rank>();
		while (rs.next()) {
			rank.add(new Rank(rs.getString(1), rs.getInt(2), rs.getInt(3)));
		}
		return compareTo(rank);
	}
	
	public static  ArrayList<Rank> rankList2() throws SQLException, ClassNotFoundException{	//’“≤Á
		String sql = "select * from tzfe";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		ArrayList<Rank> rank = new ArrayList<Rank>();
		while (rs.next()) {
			rank.add(new Rank(rs.getString(1), rs.getInt(2), rs.getInt(3)));
		}
		return compareTo2(rank);
	}
	
	public static ArrayList<Rank> compareTo(ArrayList<Rank> rank){
		ArrayList<Rank> r1 = new ArrayList<Rank>();
		r1.add(new Rank(null, 0, 0));
		for(int i=0;i<rank.size();i++){
			for(int j=0;j<rank.size()-1;j++){
				if(rank.get(j).getUtime()>rank.get(j+1).getUtime()){
					r1.set(0, rank.get(j));
					rank.set(j, rank.get(j+1));
					rank.set(j+1,r1.get(0));
				}
			}
		}
		for(int j= 0;j<rank.size();j++){
		}
		return rank;	
	}

	public static ArrayList<Rank> compareTo2(ArrayList<Rank> rank){
		ArrayList<Rank> r1 = new ArrayList<Rank>();
		r1.add(new Rank(null, 0, 0));
		for(int i=0;i<rank.size();i++){
			for(int j=0;j<rank.size()-1;j++){
				if(rank.get(j).getRank()>rank.get(j+1).getRank()){
					r1.set(0, rank.get(j));
					rank.set(j, rank.get(j+1));
					rank.set(j+1,r1.get(0));
				}
			}
		}
		for(int j= 0;j<rank.size();j++){
		}
		return rank;	
	}
	@Override
	public int compareTo(Rank o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
