/*
 * tuofour.java
 *
 * Created on __DATE__, __TIME__
 */

package twentyfour;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author  __USER__
 */
public class tuofour extends javax.swing.JFrame {
	static int[] t = new int[4];
    static int p=1;
    static int m=0;
	/** Creates new form tuofour */
	public tuofour() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	public int suiji(int random, JButton jButton) {
		if (random >= 1 && random <= 13) {
			String ulr = random + ".gif";
			ImageIcon bk = new ImageIcon(this.getClass().getResource(ulr));
			jButton.setIcon(bk);

		}
		if (random >= 14 && random <= 26) {
			// random=random-13;
			String ulr = random + ".gif";
			ImageIcon bk = new ImageIcon(this.getClass().getResource(ulr));
			jButton.setIcon(bk);
			random = random - 13;
		}
		if (random >= 27 && random <= 39) {
			//random=random-26;
			String ulr = random + ".gif";
			ImageIcon bk = new ImageIcon(this.getClass().getResource(ulr));
			jButton.setIcon(bk);
			random = random - 26;
		}
		if (random >= 40 && random <= 52) {
			//random=random-39;
			String ulr = random + ".gif";
			ImageIcon bk = new ImageIcon(this.getClass().getResource(ulr));
			jButton.setIcon(bk);
			random = random - 39;
		}
		return random;

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel2 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jPanel6 = new javax.swing.JPanel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton22 = new javax.swing.JButton();
		jButton23 = new javax.swing.JButton();
		jButton24 = new javax.swing.JButton();
		jButton25 = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jPanel7 = new javax.swing.JPanel();
		jPanel8 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jPanel9 = new javax.swing.JPanel();
		jButton12 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jButton16 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jButton18 = new javax.swing.JButton();
		jButton19 = new javax.swing.JButton();
		jButton20 = new javax.swing.JButton();
		jButton21 = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel2.setBackground(new java.awt.Color(77, 75, 77));

		jButton1.setBorder(null);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jLabel11.setForeground(new java.awt.Color(244, 236, 10));
		jLabel11.setText("\u6211");

		jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel12.setForeground(new java.awt.Color(244, 236, 10));
		jLabel12.setText("\u5bf9\u624b");

		jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel13.setForeground(new java.awt.Color(255, 255, 255));
		jLabel13.setText("\u5269\u4f59\u65f6\u95f4");

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
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												98,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				153,
																				153,
																				153)
																		.addComponent(
																				jLabel11)
																		.addGap(
																				575,
																				575,
																				575)
																		.addComponent(
																				jLabel12))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				442,
																				442,
																				442)
																		.addComponent(
																				jLabel13)))
										.addContainerGap(276, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout.createSequentialGroup().addGap(
										26, 26, 26).addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										47,
										javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(31, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addComponent(
												jLabel13,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												37,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												31, Short.MAX_VALUE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel12)
														.addComponent(
																jLabel11,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																31,
																javax.swing.GroupLayout.PREFERRED_SIZE))));

		jPanel3.setBackground(new java.awt.Color(53, 52, 54));

		jPanel4.setBackground(new java.awt.Color(100, 38, 15));

		jPanel5.setBackground(new java.awt.Color(58, 154, 80));

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 386,
				Short.MAX_VALUE));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 133,
				Short.MAX_VALUE));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel1.setForeground(new java.awt.Color(255, 195, 134));
		jLabel1.setText("\u5feb\u4e50\u6251\u514b24\u70b9");

		jTextField1.setBackground(new java.awt.Color(240, 240, 240));
		jTextField1.setBorder(null);

		jPanel6.setBackground(new java.awt.Color(255, 255, 255));

		jButton2.setBackground(new java.awt.Color(245, 245, 231));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton2.setText("+");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(245, 245, 231));
		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton3.setText("-");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setBackground(new java.awt.Color(245, 245, 231));
		jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton4.setText("\u00d7");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setBackground(new java.awt.Color(245, 245, 231));
		jButton5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton5.setText("\u00f7");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setBackground(new java.awt.Color(245, 245, 231));
		jButton6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton6.setText("\uff08");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setBackground(new java.awt.Color(245, 245, 231));
		jButton7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton7.setText("\uff09");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setBackground(new java.awt.Color(245, 245, 231));
		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton8.setText("\u2190");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton9.setBackground(new java.awt.Color(245, 245, 231));
		jButton9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton9.setText("\u6e05\u9664");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jButton10.setBackground(new java.awt.Color(245, 245, 231));
		jButton10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton10.setText("\u6d17\u724c");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton11.setBackground(new java.awt.Color(245, 245, 231));
		jButton11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton11.setText("\u786e\u5b9a");

		jButton22.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton22ActionPerformed(evt);
			}
		});

		jButton23.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton23ActionPerformed(evt);
			}
		});

		jButton24.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton24ActionPerformed(evt);
			}
		});

		jButton25.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton25ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout
				.setHorizontalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																66,
																Short.MAX_VALUE)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																66,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel6Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel6Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jButton5,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								66,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton4,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								66,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED))
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton6,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				66,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED))
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				66,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
										.addGap(9, 9, 9)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton24,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																94,
																Short.MAX_VALUE)
														.addComponent(
																jButton22,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																94,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton23,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				101,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton25,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				98,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				12,
																				12,
																				12)))
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton10,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																68,
																Short.MAX_VALUE)
														.addComponent(
																jButton8,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																68,
																Short.MAX_VALUE)
														.addComponent(
																jButton9,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																68,
																Short.MAX_VALUE)
														.addComponent(
																jButton11,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																68,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel6Layout
				.setVerticalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addGap(38, 38, 38)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton22,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																146,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel6Layout
																		.createSequentialGroup()
																		.addGap(
																				14,
																				14,
																				14)
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				38,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel6Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								38,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								jPanel6Layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												38,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jButton4,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												38,
																												javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addComponent(
																jButton23,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																146,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton9,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																38,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				38,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel6Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								jPanel6Layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton6,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												38,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jButton7,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												38,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								jPanel6Layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton10,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												38,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jButton11,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												38,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				13,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel6Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton24,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								145,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton25,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								145,
																								Short.MAX_VALUE))))
										.addGap(47, 47, 47)));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(
																				94,
																				94,
																				94)
																		.addComponent(
																				jLabel1))
														.addGroup(
																jPanel4Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(
																				jPanel5,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.Alignment.LEADING))
														.addComponent(
																jPanel6,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												33,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel6,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel3Layout.createSequentialGroup().addGap(116, 116, 116)
						.addComponent(jPanel4,
								javax.swing.GroupLayout.PREFERRED_SIZE, 360,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(120, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel3Layout.createSequentialGroup().addContainerGap(
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel4,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								34, 34, 34)));

		jPanel1.setBackground(new java.awt.Color(53, 52, 54));

		jPanel7.setBackground(new java.awt.Color(100, 38, 15));

		jPanel8.setBackground(new java.awt.Color(58, 154, 80));

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(
				jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 379,
				Short.MAX_VALUE));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 133,
				Short.MAX_VALUE));

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel6.setForeground(new java.awt.Color(255, 195, 134));
		jLabel6.setText("\u5feb\u4e50\u6251\u514b24\u70b9");

		jTextField2.setBackground(new java.awt.Color(73, 38, 26));
		jTextField2.setBorder(null);

		jPanel9.setBackground(new java.awt.Color(255, 255, 255));

		jButton12.setBackground(new java.awt.Color(245, 245, 231));
		jButton12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton12.setText("+");

		jButton13.setBackground(new java.awt.Color(245, 245, 231));
		jButton13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton13.setText("-");

		jButton14.setBackground(new java.awt.Color(245, 245, 231));
		jButton14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton14.setText("\u00d7");

		jButton15.setBackground(new java.awt.Color(245, 245, 231));
		jButton15.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton15.setText("\u00f7");

		jButton16.setBackground(new java.awt.Color(245, 245, 231));
		jButton16.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton16.setText("\uff08");

		jButton17.setBackground(new java.awt.Color(245, 245, 231));
		jButton17.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton17.setText("\uff09");

		jButton18.setBackground(new java.awt.Color(245, 245, 231));
		jButton18.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton18.setText("\u2190");

		jButton19.setBackground(new java.awt.Color(245, 245, 231));
		jButton19.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton19.setText("\u6e05\u9664");
		jButton19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton19ActionPerformed(evt);
			}
		});

		jButton20.setBackground(new java.awt.Color(245, 245, 231));
		jButton20.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton20.setText("\u6d17\u724c");

		jButton21.setBackground(new java.awt.Color(245, 245, 231));
		jButton21.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jButton21.setText("\u786e\u5b9a");

		jLabel7.setText("jLabel2");

		jLabel8.setText("jLabel2");

		jLabel9.setText("jLabel2");

		jLabel10.setText("jLabel2");

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
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton13,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																47,
																Short.MAX_VALUE)
														.addComponent(
																jButton15,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																47,
																Short.MAX_VALUE)
														.addComponent(
																jButton16,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton14,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																47,
																Short.MAX_VALUE)
														.addComponent(
																jButton12,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																47,
																Short.MAX_VALUE)
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton17,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
										.addGroup(
												jPanel9Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jLabel7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				104,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				104,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel9Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				104,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				104,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel9Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton20,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton18,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																61,
																Short.MAX_VALUE)
														.addComponent(
																jButton19,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton21,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel9Layout
				.setVerticalGroup(jPanel9Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel9Layout
										.createSequentialGroup()
										.addGap(14, 14, 14)
										.addGroup(
												jPanel9Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel9Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				120,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				120,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel9Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jButton12,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												38,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel9Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jButton18,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																38,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jButton13,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																38,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel9Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																jPanel9Layout
																																		.createSequentialGroup()
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jButton14,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				38,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				jPanel9Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jButton20,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								38,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								jButton15,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								38,
																																								javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				jPanel9Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jButton21,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								38,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								jButton16,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								38,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)))
																														.addComponent(
																																jButton19,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																38,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								jPanel9Layout
																										.createSequentialGroup()
																										.addGap(
																												35,
																												35,
																												35)
																										.addGroup(
																												jPanel9Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																jLabel7,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																120,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jLabel8,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																120,
																																javax.swing.GroupLayout.PREFERRED_SIZE))))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton17,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				38,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				10,
																				10,
																				10)))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(
				jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout
				.setHorizontalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addGroup(
												jPanel7Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel7Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(
																				jPanel8,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				jPanel9,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel7Layout
																		.createSequentialGroup()
																		.addGap(
																				101,
																				101,
																				101)
																		.addComponent(
																				jLabel6)))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		jPanel7Layout
				.setVerticalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addComponent(jLabel6)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel8,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTextField2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												33,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel9,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addGap(116, 116, 116)
						.addComponent(jPanel7,
								javax.swing.GroupLayout.PREFERRED_SIZE, 360,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(120, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel1Layout.createSequentialGroup().addContainerGap(88,
						Short.MAX_VALUE).addComponent(jPanel7,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(34, 34,
						34)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(
												jPanel3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)).addComponent(
								jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jPanel1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code her=e:
		if(p==1){
			jTextField1.setText(jTextField1.getText() + t[3]);
			jButton25.setEnabled(false);
			p=0;
		}

	}

	private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if(p==1){
			jTextField1.setText(jTextField1.getText() + t[2]);
			jButton24.setEnabled(false);
			p=0;
		}
	}

	private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {
		if(p==1){
		// TODO add your handling code here:
			jTextField1.setText(jTextField1.getText() + t[1]);
			jButton23.setEnabled(false);
			p=0;
		}
	}

	private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if(p==1){
		jTextField1.setText(jTextField1.getText() + t[0]);
		jButton22.setEnabled(false);
		p=0;
		}

	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		p=1;
		// TODO add your handling code here:
		String text = jTextField1.getText();
		int i = text.length();
        if(i==1){
        	String text3 = text.substring(i - 1);
        	 text=text.substring(0,i-1);
        	 if (text3.indexOf(Integer.toString(t[0])) != -1) {
				jButton22.setEnabled(true);
			}
			if (text3.indexOf(Integer.toString(t[1])) != -1) {
				jButton23.setEnabled(true);
			}
			if (text3.indexOf(Integer.toString(t[2])) != -1) {
				jButton24.setEnabled(true);
			}
			if (text3.indexOf(Integer.toString(t[3])) != -1) {
				jButton25.setEnabled(true);
			};
			jTextField1.setText(null);
        	
        }
        if(i==2){
        	text=text.substring(0,i-1);
        	jTextField1.setText(text);
        }
        System.out.println();
        if(jTextField1.getText().equals("")){
        	jButton22.setEnabled(true);
        	jButton23.setEnabled(true);
        	jButton24.setEnabled(true);
        	jButton25.setEnabled(true);
        	
        }
		if (i >2) {
			String text2 = text.substring(i - 2);

			if (text2.indexOf(Integer.toString(t[0])) != -1) {
				jButton22.setEnabled(true);
			}
			if (text2.indexOf(Integer.toString(t[1])) != -1) {
				jButton23.setEnabled(true);
			}
			if (text2.indexOf(Integer.toString(t[2])) != -1) {
				jButton24.setEnabled(true);
			}
			if (text2.indexOf(Integer.toString(t[3])) != -1) {
				jButton25.setEnabled(true);
			}
			if((text2.indexOf('+')!=-1)||(text2.indexOf('-')!=-1)||(text2.indexOf('*')!=-1)||(text2.indexOf('/')!=-1)){
				text=text.substring(0,i-1);
			}
			else if(Integer.parseInt(text2)>10)
		     text=text.substring(0,i-2);
		   
			// 退格，将文本最后一个字符去掉

			if (text.length() == 0) {
				// 如果文本没有了内容，则初始化计算器的各种值
				jTextField1.setText(null);
			} else {
				jTextField1.setText(text);

			}
		}

	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jTextField1.setText(jTextField1.getText() + ")");
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jTextField1.setText(jTextField1.getText() + "(");
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jTextField1.setText(jTextField1.getText() + "/");
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jTextField1.setText(jTextField1.getText() + "*");
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jTextField1.setText(jTextField1.getText() + "-");
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jTextField1.setText(jTextField1.getText() + "+");
		p=1;
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		p=1;
		Random r = new Random();
		int a = r.nextInt(53);
		int b = r.nextInt(53);
		int c = r.nextInt(53);
		int d = r.nextInt(53);
		t[0] = suiji(a, jButton22);
		t[1] = suiji(b, jButton23);
		t[2] = suiji(c, jButton24);
		t[3] = suiji(d, jButton25);
		System.out.println(t[0]);
		System.out.println(t[1]);
		System.out.println(t[2]);
		System.out.println(t[3]);
		jButton22.setEnabled(true);
		jButton23.setEnabled(true);
		jButton24.setEnabled(true);
		jButton25.setEnabled(true);
		jTextField1.setText(null);
	}

	private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new tuofour().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton18;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton20;
	private javax.swing.JButton jButton21;
	private javax.swing.JButton jButton22;
	private javax.swing.JButton jButton23;
	private javax.swing.JButton jButton24;
	private javax.swing.JButton jButton25;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}