/*
 * zhu.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.Rank;
import model.User;
import model.tz;

import abc.*;

/**
 * 
 * @author __USER__
 */
public class zhu extends javax.swing.JFrame {

	//	private User u;

	/** Creates new form zhu */
	public zhu() {
		initComponents();
		get24Score(); // 24点获取排名和成绩
		getFindScore();// 找茬
		get2048Score();// 2048
		this.setLocationRelativeTo(null);
		//		this.u = u;

	}

	public void get24Score() {
		ArrayList<Rank> rank;
		try {
			rank = Rank.rankList();
			Object title[] = { "用户名", "用时" };
			Object detail[][] = new Object[rank.size()][2];
			for (int i = 0; i < rank.size(); i++) {
				detail[i][0] = rank.get(i).getUserName();
				detail[i][1] = rank.get(i).getUtime();
				// detail[i][2] = rank.get(i).getGdetail();
				this.jTable1.setModel(new DefaultTableModel(detail, title));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getFindScore() {
		ArrayList<Rank> rank;
		try {
			rank = Rank.rankList1();
			Object title[] = { "用户名", "用时" };
			Object detail[][] = new Object[rank.size()][2];
			for (int i = 0; i < rank.size(); i++) {
				detail[i][0] = rank.get(i).getUserName();
				detail[i][1] = rank.get(i).getUtime();
				// detail[i][2] = rank.get(i).getGdetail();
				this.jTable2.setModel(new DefaultTableModel(detail, title));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void get2048Score() {
		ArrayList<Rank> rank;
		try {
			rank = Rank.rankList2();
			Object title[] = { "用户名", "分数" };
			Object detail[][] = new Object[rank.size()][2];
			for (int i = 0; i < rank.size(); i++) {
				detail[i][0] = rank.get(i).getUserName();
				detail[i][1] = rank.get(i).getRank();
				// detail[i][2] = rank.get(i).getGdetail();
				this.jTable3.setModel(new DefaultTableModel(detail, title));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jButton5 = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jPanel19 = new javax.swing.JPanel();
		jLabel27 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		jLabel29 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jPanel18 = new javax.swing.JPanel();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jButton6 = new javax.swing.JButton();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jPanel9 = new javax.swing.JPanel();
		jLabel33 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();
		jLabel36 = new javax.swing.JLabel();
		jLabel37 = new javax.swing.JLabel();
		jLabel38 = new javax.swing.JLabel();
		jPanel10 = new javax.swing.JPanel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTabbedPane1.setBackground(new java.awt.Color(53, 52, 54));
		jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
		jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
		jTabbedPane1.setFont(new java.awt.Font("宋体", 1, 24));

		jPanel1.setBackground(new java.awt.Color(106, 106, 104));

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/picture/24点.png"))); // NOI18N

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36));
		jLabel6.setText("\u6e38\u620f\u89c4\u5219");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel4
				.setText("\u68cb\u724c\u7c7b\u76ca\u667a\u6e38\u620f\uff0c\u8981\u6c42\u56db\u4e2a\u6570\u5b57\u8fd0");
		jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel5
				.setText("\u7b97\u7ed3\u679c\u7b49\u4e8e\u4e8c\u5341\u56db\uff0c\u4e00\u8d77\u6765\u73a9\u73a9\u5427\uff01");
		jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

		jPanel5.setBackground(new java.awt.Color(51, 51, 51));

		jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/picture/二维码.jpg"))); // NOI18N

		jLabel8.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel8.setForeground(new java.awt.Color(240, 240, 240));
		jLabel8.setText("\u5236\u4f5c\u4eba\u5458\uff1a\u675c\u4e91\u9f99");

		jLabel11.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel11.setForeground(new java.awt.Color(240, 240, 240));
		jLabel11.setText("\u5362\u9526\u6d9b");

		jLabel12.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel12.setForeground(new java.awt.Color(240, 240, 240));
		jLabel12.setText("\u5ed6\u6d69\u68ee");

		jLabel23.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel23.setForeground(new java.awt.Color(240, 240, 240));
		jLabel23.setText("\u738b\u6d69\u5eb7");

		jLabel24.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel24.setForeground(new java.awt.Color(240, 240, 240));
		jLabel24.setText("\u90d1\u6653\u6b22");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel5Layout
										.createSequentialGroup()
										.addGap(54, 54, 54)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel8)
														.addGroup(
																jPanel5Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				jLabel12)
																		.addComponent(
																				jLabel11)
																		.addComponent(
																				jLabel23)
																		.addComponent(
																				jLabel24)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE).addComponent(
												jLabel7).addGap(37, 37, 37)));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout.createSequentialGroup().addGap(
										37, 37, 37).addComponent(jLabel7,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										297,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGap(87, 87, 87)
										.addComponent(jLabel8)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel11)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel12)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel23)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel24)));

		jLabel21.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel21.setText("\u73a9\u5bb6\u540d");

		jLabel22.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel22.setText("\u7528\u65f6");

		jTable3.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane3.setViewportView(jTable3);

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel6Layout.createSequentialGroup().addGap(66, 66, 66)
						.addComponent(jLabel21).addGap(26, 26, 26)
						.addComponent(jLabel22)).addComponent(jScrollPane3,
				javax.swing.GroupLayout.PREFERRED_SIZE, 302,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		jPanel6Layout
				.setVerticalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel21)
														.addComponent(jLabel22))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												17, Short.MAX_VALUE)
										.addComponent(
												jScrollPane3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)));

		jButton1.setBackground(new java.awt.Color(119, 208, 22));
		jButton1.setText("\u8fdb\u5165\u6e38\u620f");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jLabel3)
																		.addGap(
																				41,
																				41,
																				41)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel4)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												109,
																												109,
																												109)
																										.addComponent(
																												jLabel6))
																						.addComponent(
																								jLabel5)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jPanel5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(18, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jPanel6,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				51,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel3)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel6)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel4)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel5)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				25,
																				Short.MAX_VALUE)
																		.addComponent(
																				jPanel5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				385,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));

		jTabbedPane1.addTab("24\u70b9", jPanel1);

		jPanel2.setBackground(new java.awt.Color(106, 106, 104));

		jButton5.setBackground(new java.awt.Color(119, 208, 22));
		jButton5.setForeground(new java.awt.Color(51, 51, 51));
		jButton5.setText("\u8fdb\u5165\u6e38\u620f");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/picture/2048.png"))); // NOI18N

		jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36));
		jLabel10.setText("\u6e38\u620f\u89c4\u5219");

		jPanel19.setBackground(new java.awt.Color(51, 51, 51));

		jLabel27.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel27.setForeground(new java.awt.Color(240, 240, 240));
		jLabel27.setText("\u5236\u4f5c\u4eba\u5458\uff1a\u675c\u4e91\u9f99");

		jLabel28.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel28.setForeground(new java.awt.Color(240, 240, 240));
		jLabel28.setText("\u5362\u9526\u6d9b");

		jLabel29.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel29.setForeground(new java.awt.Color(240, 240, 240));
		jLabel29.setText("\u5ed6\u6d69\u68ee");

		jLabel30.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel30.setForeground(new java.awt.Color(240, 240, 240));
		jLabel30.setText("\u738b\u6d69\u5eb7");

		jLabel31.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel31.setForeground(new java.awt.Color(240, 240, 240));
		jLabel31.setText("\u90d1\u6653\u6b22");

		jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/picture/二维码.jpg"))); // NOI18N

		javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(
				jPanel19);
		jPanel19.setLayout(jPanel19Layout);
		jPanel19Layout
				.setHorizontalGroup(jPanel19Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel19Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel19Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel27)
														.addGroup(
																jPanel19Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				jLabel29)
																		.addComponent(
																				jLabel28)
																		.addComponent(
																				jLabel30)
																		.addComponent(
																				jLabel31)))
										.addGap(33, 33, 33).addComponent(
												jLabel32).addContainerGap(41,
												Short.MAX_VALUE)));
		jPanel19Layout
				.setVerticalGroup(jPanel19Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel19Layout
										.createSequentialGroup()
										.addContainerGap(35, Short.MAX_VALUE)
										.addGroup(
												jPanel19Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel32,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																297,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel19Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel27)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel28)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel29)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel30)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel31)))
										.addGap(32, 32, 32)));

		jLabel25.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel25.setText("\u73a9\u5bb6\u540d");

		jLabel26.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel26.setText("\u7528\u65f6");

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane2.setViewportView(jTable2);

		javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(
				jPanel18);
		jPanel18.setLayout(jPanel18Layout);
		jPanel18Layout
				.setHorizontalGroup(jPanel18Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel18Layout
										.createSequentialGroup()
										.addGap(60, 60, 60)
										.addComponent(jLabel25)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE).addComponent(
												jLabel26).addGap(109, 109, 109))
						.addComponent(jScrollPane2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 292,
								javax.swing.GroupLayout.PREFERRED_SIZE));
		jPanel18Layout.setVerticalGroup(jPanel18Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel18Layout.createSequentialGroup().addGroup(
						jPanel18Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel26).addComponent(jLabel25))
						.addGap(18, 18, 18).addComponent(jScrollPane2,
								javax.swing.GroupLayout.DEFAULT_SIZE, 430,
								Short.MAX_VALUE)));

		jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel13
				.setText("\u63a7\u5236\u6240\u6709\u65b9\u5757\u5411\u540c\u4e00\u65b9\u5411\u8fd0\u52a8\uff0c\u76f8\u540c\u6570\u5b57\u649e");
		jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);

		jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel14
				.setText("\u4e00\u8d77\u5408\u5e76\u4e3a\u4ed6\u4eec\u7684\u548c\uff0c\u6700\u7ec8\u5f97\u5230\u201c2048\u201d\u3002");
		jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel9)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addGap(
																												170,
																												170,
																												170)
																										.addComponent(
																												jLabel10))
																						.addComponent(
																								jLabel14)
																						.addComponent(
																								jLabel13))
																		.addGap(
																				23,
																				23,
																				23))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jPanel19,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(
																				18,
																				18,
																				18)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel18,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																292,
																Short.MAX_VALUE))
										.addGap(30, 30, 30)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jPanel18,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				55,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel9)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel10)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel13)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel14)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				45,
																				Short.MAX_VALUE)
																		.addComponent(
																				jPanel19,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));

		jTabbedPane1.addTab("2048", jPanel2);

		jPanel3.setBackground(new java.awt.Color(106, 106, 104));

		jButton6.setBackground(new java.awt.Color(119, 208, 22));
		jButton6.setForeground(new java.awt.Color(51, 51, 51));
		jButton6.setText("\u8fdb\u5165\u6e38\u620f");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/picture/茬.png"))); // NOI18N

		jLabel16.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36));
		jLabel16.setText("\u6e38\u620f\u89c4\u5219");

		jPanel9.setBackground(new java.awt.Color(51, 51, 51));

		jLabel33.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel33.setForeground(new java.awt.Color(240, 240, 240));
		jLabel33.setText("\u5236\u4f5c\u4eba\u5458\uff1a\u675c\u4e91\u9f99");

		jLabel34.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel34.setForeground(new java.awt.Color(240, 240, 240));
		jLabel34.setText("\u5362\u9526\u6d9b");

		jLabel35.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel35.setForeground(new java.awt.Color(240, 240, 240));
		jLabel35.setText("\u5ed6\u6d69\u68ee");

		jLabel36.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel36.setForeground(new java.awt.Color(240, 240, 240));
		jLabel36.setText("\u738b\u6d69\u5eb7");

		jLabel37.setFont(new java.awt.Font("宋体", 0, 24));
		jLabel37.setForeground(new java.awt.Color(240, 240, 240));
		jLabel37.setText("\u90d1\u6653\u6b22");

		jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/picture/二维码.jpg"))); // NOI18N

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(
				jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout
				.setHorizontalGroup(jPanel9Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel9Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel9Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel33)
														.addGroup(
																jPanel9Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				jLabel35)
																		.addComponent(
																				jLabel34)
																		.addComponent(
																				jLabel36)
																		.addComponent(
																				jLabel37)))
										.addGap(50, 50, 50).addComponent(
												jLabel38).addGap(33, 33, 33)));
		jPanel9Layout
				.setVerticalGroup(jPanel9Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel9Layout
										.createSequentialGroup()
										.addGap(47, 47, 47)
										.addGroup(
												jPanel9Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel38,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																297,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel33)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel34)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel35)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel36)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel37)))
										.addContainerGap(39, Short.MAX_VALUE)));

		jLabel17.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel17.setText("\u73a9\u5bb6\u540d");

		jLabel18.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel18.setText("\u7528\u65f6");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(
				jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout
				.setHorizontalGroup(jPanel10Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel10Layout
										.createSequentialGroup()
										.addGap(71, 71, 71)
										.addComponent(jLabel17)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE).addComponent(
												jLabel18).addGap(100, 100, 100))
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 300,
								Short.MAX_VALUE));
		jPanel10Layout
				.setVerticalGroup(jPanel10Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel10Layout
										.createSequentialGroup()
										.addGroup(
												jPanel10Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel17)
														.addComponent(jLabel18))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												19, Short.MAX_VALUE)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)));

		jLabel19.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel19
				.setText("\u627e\u5230\u4e24\u5f20\u56fe\u7247\u4e0d\u540c\u7684\u5730\u65b9\uff0c\u5148\u627e\u5230");
		jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);

		jLabel20.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel20.setText("\u5168\u90e8\u4e0d\u540c\u7684\u83b7\u80dc\u3002");
		jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel15)
																		.addGap(
																				32,
																				32,
																				32)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addGap(
																												108,
																												108,
																												108)
																										.addComponent(
																												jLabel16))
																						.addComponent(
																								jLabel20)
																						.addComponent(
																								jLabel19)))
														.addComponent(
																jPanel9,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																614,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jButton6,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel10,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																288,
																Short.MAX_VALUE))
										.addContainerGap(34, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jPanel10,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(
																				3,
																				3,
																				3)
																		.addComponent(
																				jButton6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				55,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel15)
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel16)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel19)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel20)))
																		.addGap(
																				27,
																				27,
																				27)
																		.addComponent(
																				jPanel9,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)))
										.addContainerGap()));

		jTabbedPane1.addTab("\u4e00\u8d77\u6765\u627e\u832c", jPanel3);

		jPanel4.setBackground(new java.awt.Color(77, 75, 77));

		jLabel1.setBackground(new java.awt.Color(255, 255, 255));
		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/picture/空白头像.jpg"))); // NOI18N

		jLabel2.setBackground(new java.awt.Color(255, 255, 255));
		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("123");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout.createSequentialGroup().addGap(78, 78, 78)
						.addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 79,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								18, 18, 18).addComponent(jLabel2)
						.addContainerGap(886, Short.MAX_VALUE)));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGap(37, 37, 37)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel2)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																52,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jTabbedPane1,
						javax.swing.GroupLayout.DEFAULT_SIZE, 1106,
						Short.MAX_VALUE));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addComponent(
												jPanel4,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTabbedPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												581,
												javax.swing.GroupLayout.PREFERRED_SIZE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new dj24dian().setVisible(true);
		this.dispose();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new djca().setVisible(true);
		this.dispose();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		tz tz = new tz();
		tz.run(new tz(), 500, 150, 900, 800);
		this.dispose();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
//	public static void main(String args[]) {
//		java.awt.EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				new zhu().setVisible(true);
//			}
//		});
//	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel18;
	private javax.swing.JPanel jPanel19;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	// End of variables declaration//GEN-END:variables

}