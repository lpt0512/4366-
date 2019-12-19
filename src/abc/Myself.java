package abc;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;





public class Myself extends JPanel {
	public static RectObject[][] rset = new RectObject[4][4];
	public RectObject[][] list = new RectObject[4][4];
	public static final int WID = 150, SP = 10;
	public int scores = 0;
	public static JLabel scoreLabel;
	public int[] label = { 2, 4, 8, 16, 32, 64, 128 };
	public Color[] clo = { new Color(200, 200, 200), new Color(228, 228, 160),
			new Color(214, 163, 92), new Color(234, 124, 72),
			new Color(240, 84, 77), new Color(255, 68, 53),
			new Color(200, 200, 64) };
	public static final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3;
	public static Map cmap = new HashMap();
	public boolean change, CheckMode = false, gameOverFlag = false,
			successFlag = false;
	public Myself myp11;
	public LinkedList saveList = new LinkedList();
	public JButton goBackButton;

	public int[] xindex = { SP, 2 * SP + WID, 3 * SP + 2 * WID,
			4 * SP + 3 * WID };
	public int[] yindex = { SP, 2 * SP + WID, 3 * SP + 2 * WID,
			4 * SP + 3 * WID };

	public void paintComponent(Graphics g) {
		// background
		super.paintComponent(g);
		for (int i = 0; i < xindex.length; i++) {
			for (int j = 0; j < yindex.length; j++) {
				g.setColor(Color.WHITE);
				g.drawRoundRect(xindex[i], yindex[j], WID, WID, WID / 5,
						WID / 5);
				g.setColor(new Color(197, 183, 129));
				g.fillRoundRect(xindex[i], yindex[j], WID, WID, WID / 5,
						WID / 5);
			}
		}
		// paint rectangle
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (rset[i][j] != null) {
					g.setColor(Color.WHITE);
					g.drawRoundRect(yindex[j], xindex[i], WID, WID, WID / 5,
							WID / 5);
					if (rset[i][j].value < 128) {
						g.setColor((Color) cmap.get(rset[i][j].value));
					} else {
						g.setColor((Color) cmap.get(128));
					}
					g.fillRoundRect(yindex[j], xindex[i], WID, WID, WID / 5,
							WID / 5);
					g.setColor(Color.BLACK);

					Font font = new Font("TimesRoman", Font.BOLD, 50);
					g.setFont(font);
					FontMetrics fm = Toolkit.getDefaultToolkit()
							.getFontMetrics(font);
					int len = fm.stringWidth("" + rset[i][j].value);
					int hg = fm.getHeight();
					g.drawString("" + rset[i][j].value, yindex[j] + WID / 2
							- len / 2, xindex[i] + WID / 2 + hg / 4);

					if (rset[i][j].value == 2048 && successFlag == false) {
						successFlag = true;
//						gameSuccess();
					}
				}
			}
		}
	}

}
