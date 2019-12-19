package abc;

import java.awt.*;
import java.awt.event.*;

import java.io.*;

import java.sql.*;
import java.util.*;

import javax.swing.*;



public class TwoZero extends JApplet {

	private String uid;
	private int uscore;

	private twozero tz;
	Myself my = new Myself();
	public static final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3;
	public int scores = 0;
	public boolean change, CheckMode = false;
	public boolean gameOverFlag = false;
	public boolean successFlag = false;
	public int[] label = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048 };
	public Color[] clo = { new Color(200, 200, 200), new Color(228, 228, 160),
			new Color(214, 163, 92), new Color(234, 124, 72),
			new Color(240, 84, 77), new Color(255, 68, 53),
			new Color(200, 200, 64), new Color(220, 220, 58),
			new Color(239, 232, 54), new Color(243, 236, 38),
			new Color(250, 241, 5) };
	public LinkedList saveList = new LinkedList();
	public JButton goBackButton;
	public static RectObject[][] rset = new RectObject[4][4];
	public RectObject[][] list = new RectObject[4][4];
	public static JLabel scoreLabel;

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

	public void action() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

			}
		}
	}

	// 键盘的监听
	public KeyListener kl = new KeyListener() {
		public void keyPressed(KeyEvent e) {
			saveTheStep();
			goBackButton.setVisible(true);
			if (gameOverFlag == true) {
				return;
			}
			if (!aDirAble()) {
				gameOver();
			}
			int key = e.getKeyCode();
			switch (key) {
			case KeyEvent.VK_UP:
				change = false;
				moveUp(true);
				if (change == true) {
					getARandomRect();
					// saveTheStep();
				}
				break;
			case KeyEvent.VK_DOWN:
				change = false;
				moveDown(true);
				if (change == true) {
					getARandomRect();
					// saveTheStep();
				}
				break;
			case KeyEvent.VK_LEFT:
				change = false;
				moveLeft(true);
				if (change == true) {
					getARandomRect();
					// saveTheStep();
				}
				break;
			case KeyEvent.VK_RIGHT:
				change = false;
				moveRight(true);
				if (change == true) {
					getARandomRect();
					// saveTheStep();
				}
				break;
			}
			saveTheStep();
		}

		public void keyTyped(KeyEvent e) {
		}

		public void keyReleased(KeyEvent e) {
		}
	};

	// 检测是否有其他步骤
	public boolean aDirAble() {
		CheckMode = true;
		change = false;
		moveLeft(true);
		moveRight(true);
		moveDown(true);
		moveUp(true);
		CheckMode = false;
		if (change == true) {
			return true;
		} else {
			return false;
		}
	}

	// 运行计算
	// public void calculation() {
	//
	// }

	public TwoZero() {
		// saveTheStep();
		for (int i = 0; i < 7; i++) {
			my.cmap.put(label[i], clo[i]);
		}
	}

	// 左移
	public void moveLeft(boolean flag) {
		clearList(list);
		for (int i = 0; i < 4; i++) {
			int k = 0;
			for (int j = 0; j < 4; j++) {
				if (rset[i][j] != null) {
					list[i][k++] = new RectObject(rset[i][j]);
				}
			}
		}
		for (int i = 0; i < 4 && flag; i++) {
			for (int j = 0; j < 3; j++) {
				if (list[i][j] != null && list[i][j + 1] != null
						&& list[i][j].value == list[i][j + 1].value) {
					list[i][j].value *= 2;
					if (CheckMode == false) {
						int sum = Integer.parseInt(scoreLabel.getText());
						sum += list[i][j].value;
						scoreLabel.setText("" + sum);
					}
					list[i][j + 1] = null;
					j++;
				}
			}
		}

		if (isChange()) {
			if (CheckMode == false) {
				copySet(rset, list);
				repaint();
				moveLeft(false);
			}
			change = true;
		} else {
			repaint();
		}
	}

	// 右移
	public void moveRight(boolean flag) {
		clearList(list);
		for (int i = 0; i < 4; i++) {
			int k = 3;
			for (int j = 3; j > -1; j--) {
				if (rset[i][j] != null) {
					list[i][k--] = new RectObject(rset[i][j]);
				}
			}
		}
		for (int i = 0; i < 4 && flag; i++) {
			for (int j = 3; j > 0; j--) {
				if (list[i][j] != null && list[i][j - 1] != null
						&& list[i][j].value == list[i][j - 1].value) {
					list[i][j].value *= 2;
					if (CheckMode == false) {
						int sum = Integer.parseInt(scoreLabel.getText());
						sum += list[i][j].value;
						scoreLabel.setText("" + sum);
					}
					list[i][j - 1] = null;
					j--;
				}
			}
		}

		if (isChange()) {
			if (CheckMode == false) {
				copySet(rset, list);
				repaint();
				moveRight(false);
			}
			change = true;
		} else {
			repaint();
		}
	}

	// 上移
	public void moveUp(boolean flag) {
		clearList(list);
		for (int j = 0; j < 4; j++) {
			int k = 0;
			for (int i = 0; i < 4; i++) {
				if (rset[i][j] != null) {
					list[k++][j] = new RectObject(rset[i][j]);
				}
			}
		}
		for (int j = 0; j < 4 && flag; j++) {
			for (int i = 0; i < 3; i++) {
				if (list[i][j] != null && list[i + 1][j] != null
						&& list[i][j].value == list[i + 1][j].value) {
					list[i][j].value *= 2;
					if (CheckMode == false) {
						int sum = Integer.parseInt(scoreLabel.getText());
						sum += list[i][j].value;
						scoreLabel.setText("" + sum);
					}
					list[i + 1][j] = null;
					i++;
				}
			}
		}

		if (isChange()) {
			if (CheckMode == false) {
				copySet(rset, list);
				repaint();
				moveUp(false);
			}
			change = true;
		} else {
			repaint();
		}
	}

	// 下移
	public void moveDown(boolean flag) {
		clearList(list);
		for (int j = 0; j < 4; j++) {
			int k = 3;
			for (int i = 3; i > -1; i--) {
				if (rset[i][j] != null) {
					list[k--][j] = new RectObject(rset[i][j]);
				}
			}
		}
		for (int j = 0; j < 4 && flag; j++) {
			for (int i = 3; i > 0; i--) {
				if (list[i][j] != null && list[i - 1][j] != null
						&& list[i][j].value == list[i - 1][j].value) {
					list[i][j].value *= 2;
					if (CheckMode == false) {
						int sum = Integer.parseInt(scoreLabel.getText());
						sum += list[i][j].value;
						scoreLabel.setText("" + sum);
					}
					list[i - 1][j] = null;
					i--;
				}
			}
		}

		if (isChange()) {
			if (CheckMode == false) {
				copySet(rset, list);
				repaint();
				moveDown(false);
			}
			change = true;
		} else {
			repaint();
		}
	}

	// 其他功能
	public void copySet(RectObject[][] dst, RectObject[][] src) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				dst[i][j] = src[i][j];
			}
		}
	}

	// 清除
	public void clearList(RectObject[][] s) {
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				s[i][j] = null;
			}
		}
	}

	// 随机生成数字
	public void getARandomRect() {
		ArrayList list = new ArrayList();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (rset[i][j] == null) {
					list.add(new Point(i, j));
				}
			}
		}
		if (list.size() == 0 && !aDirAble()) {
			gameOver();
			return;
		}
		Random rand = new Random();
		int index = rand.nextInt(list.size());
		Point loc = (Point) list.get(index);
		index = rand.nextInt(2);
		rset[loc.x][loc.y] = new RectObject();
		if (index == 1) {
			rset[loc.x][loc.y].value = 4;
		} else {
			rset[loc.x][loc.y].value = 2;
		}
	}

	public static String title(Object o) {
		String t = o.getClass().toString();
		if (t.indexOf("class") != -1) {
			t = t.substring(6);
		}
		return t;
	}

	// 得分变化
	public void saveTheStep() {
		if (saveList.size() < 20) {
			ArrayList arr = new ArrayList();
			int score = Integer.parseInt(scoreLabel.getText());
			arr.add(score);
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (rset[i][j] != null) {
						arr.add(rset[i][j].value);
					} else {
						arr.add(0);
					}
				}
			}
			saveList.addLast(arr);
		} else {
			saveList.removeFirst();
			saveTheStep();
		}
	}

	// 检测rset是否不同于列表
	// 计算是否发生变化
	public boolean isChange() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (rset[i][j] != null && list[i][j] != null
						&& !rset[i][j].equals(list[i][j])) {
					return true;
				}
				if (rset[i][j] != null && list[i][j] == null) {
					return true;
				}
				if (rset[i][j] == null && list[i][j] != null) {
					return true;
				}
			}
		}
		return false;
	}

	// 刷新best
	public static void refreshBest() {
		try {
			int best = 0;
			File f = new File("BestRecord");
			RandomAccessFile file;
			if (f.exists()) {
				file = new RandomAccessFile(f, "rw");
				best = file.readInt();
				file.seek(0);
			} else {
				file = new RandomAccessFile(f, "rw");
			}
			// System.out.println("The Best score is "+best);
			int cur = Integer.parseInt(scoreLabel.getText());
			if (cur > best) {
				file.writeInt(cur);
			}
			file.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

	public void gameSuccess() {
		JPanel jl = new SuccessPane(twozero.myp1.getWidth(), twozero.myp1
				.getHeight());
		jl.setOpaque(false);
		jl.setBounds(0, 0, 700, 700);
		JButton jb1 = new JButton("Continue");
		Font font = new Font("TimesRoman", Font.BOLD, 30);
		jb1.setOpaque(false);
		jb1.setFont(font);
		JButton jb2 = new JButton("Close");
		jb2.setSize(jb1.getSize());
		jb2.setOpaque(false);
		jb2.setFont(font);
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// myp.remove(jl);
				twozero.myp1.validate();
				repaint();
			}
		});
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshBest();
				System.exit(0);
			}
		});
		jl.add(jb1);
		jl.add(jb2);
		// myp1.add(jl);
		jl.validate();
	}

	// 保存记录
	public static void saveRecord() {
		try {
			RandomAccessFile file = new RandomAccessFile(
					new File("LASTRECORD"), "rw");
			int score = Integer.parseInt(scoreLabel.getText());
			file.writeInt(score);
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (rset[i][j] != null) {
						file.writeInt(rset[i][j].value);
					} else {
						file.writeInt(0);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 游戏失败
	public void gameOver() {
		gameOverFlag = true;
		JPanel jl = new GameOverPane(twozero.myp1.getWidth(), twozero.myp1
				.getHeight());
		jl.setBounds(0, 0, 700, 700);
		JButton jb1 = new JButton("Again");
		Font font = new Font("TimesRoman", Font.BOLD, 30);
		jb1.setOpaque(false);
		jb1.setFont(font);
		JButton jb2 = new JButton("Close");
		jb2.setSize(jb1.getSize());
		jb2.setOpaque(false);
		jb2.setFont(font);
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scoreLabel.setText("0");
				// myp.remove(jl);
				clearList(rset);
				twozero.myp1.validate();
				getARandomRect();
				getARandomRect();
				repaint();
				gameOverFlag = false;
				refreshBest();
			}
		});
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshBest();
				File f = new File("LASTRECORD");
				if (f.exists()) {
					f.delete();
				}
				System.exit(0);
			}
		});
		jl.add(jb1);
		jl.add(jb2);
		// myp.add(jl);
		jl.validate();
	}

	public class Point {
		int x;
		int y;

		public Point(int i, int j) {
			x = i;
			y = j;
		}
	}

	

}