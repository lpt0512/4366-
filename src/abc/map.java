package abc;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.util.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class map extends JFrame {
    // 移动方向
    final public static int MOVE_UP = 0xf37;
    final public static int MOVE_DOWN = 0xf36;
    final public static int MOVE_LEFT = 0xf35;
    final public static int MOVE_RIGHT = 0xf34;
    // 游戏状态
    final public static int GAME_OVER = 0xf33;
    final public static int GAME_CONTINUE = 0xf32;
    final public static int GAME_WIN = 0xf31;
    // 按钮事件
    final public static int BUTTON_NEW_GAME = 0xf30;
    final public static int BUTTON_ABOUT = 0xf28;
    final public static int BUTTON_EXIT = 0xf27;

    /**
     * 行
     */
    public int column;
    /**
     * 列
     */
    public int row;
    /**
     * 游戏状态
     */
    public int gameState;
    /**
     * 网格集
     */
    public HashMap<Point, Cube> viewList = new HashMap<Point, Cube>();
    /**
     * 计分板
     */
    public JMenuItem scoreBoard;
    /**
     * 计步器
     */
    public JMenuItem arithmometer;
    /**
     * 计步
     */
    public int count;
    /**
     * 新游戏加流程
     */
    public int gameLv;

    /**
     * main函数
     * 
     * @param args
     */
    public static void main(String[] args) {
        map game = new map(400, 500);
        game.setTitle("2048");
        game.setLocationRelativeTo(null);
        game.setVisible(true);
        game.newGame();
    }

    /**
     * 构造一个默认大小的界面
     */
    public map() {
        this(400, 500);
    }

    /**
     * 构造一个指定宽高的界面
     * 
     * @param width
     *            宽
     * @param height
     *            高
     */
    public map(int width, int height) {
        column = width / 100;
        row = height / 100;

        this.setLayout(new GridLayout(row, column));
        // 事件监听
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        this.setSize(width, height);

        // 利用button 绘制网格
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                viewList.put(new Point(i, j), new Cube());
                this.add(getView(i, j).getView());
            }
        }

        // 设置按键监听
        this.addKeyListener(new MyKeyListener(this));

        JMenuBar jmb = new JMenuBar();
        JMenu jm = new JMenu("游戏");
        JMenuItem item1 = new JMenuItem("新游戏");
        item1.addMouseListener(new MyMouseListener(this,
                map.BUTTON_NEW_GAME));
        JMenuItem item2 = new JMenuItem("退出");
        item2.addMouseListener(new MyMouseListener(this, map.BUTTON_EXIT));
        jm.add(item1);
        jm.add(item2);

        JMenu jm2 = new JMenu("关于");
        JMenuItem item3 = new JMenuItem("关于");
        item3.addMouseListener(new MyMouseListener(this, map.BUTTON_ABOUT));
        jm2.add(item3);

        scoreBoard = new JMenuItem();
        arithmometer = new JMenuItem();

        jmb.add(jm);
        jmb.add(jm2);
        jmb.add(scoreBoard);
        jmb.add(arithmometer);
        this.setJMenuBar(jmb);
    }

    /**
     * 向上移动
     */
    public void up() {
        for (int x = 1; x < row; x++) {
            for (int i = 0; i < column; i++) {
                move(map.MOVE_UP, x, i, true);
            }
        }

        createCube();
        for (int x = 1; x < row; x++) {
            for (int i = 0; i < column; i++) {
                move(map.MOVE_UP, x, i, false);
            }
        }
        addCount();
    }

    /**
     * 向下移动
     */
    public void down() {
        for (int x = row - 2; x >= 0; x--) {
            for (int y = 0; y < column; y++) {
                move(map.MOVE_DOWN, x, y, true);
            }
        }

        createCube();
        for (int x = row - 2; x >= 0; x--) {
            for (int y = 0; y < column; y++) {
                move(map.MOVE_DOWN, x, y, false);
            }
        }

        addCount();
    }

    /**
     * 向左移动
     */
    public void left() {
        for (int y = 1; y < column; y++) {
            for (int x = 0; x < row; x++) {
                move(map.MOVE_LEFT, x, y, true);
            }
        }

        createCube();
        for (int y = 1; y < column; y++) {
            for (int x = 0; x < row; x++) {
                move(map.MOVE_LEFT, x, y, false);
            }
        }

        addCount();
    }

    /**
     * 向右移动
     */
    public void right() {
        for (int y = column - 2; y >= 0; y--) {
            for (int x = 0; x < row; x++) {
                move(map.MOVE_RIGHT, x, y, true);
            }
        }

        createCube();
        for (int y = column - 2; y >= 0; y--) {
            for (int x = 0; x < row; x++) {
                move(map.MOVE_RIGHT, x, y, false);
            }
        }

        addCount();
    }

    /**
     * 移动
     * 
     * @param move_way
     *            移动方向
     * @param x
     *            横坐标
     * @param y
     *            纵坐标
     */
    public void move(int move_way, int x, int y, boolean isAdd) {
        switch (move_way) {
        case map.MOVE_DOWN: {
            for (; x < row - 1; x++) {
                swap(getView(x + 1, y), getView(x, y), isAdd);
            }
        }
            break;

        case map.MOVE_LEFT: {
            for (; y > 0; y--) {
                swap(getView(x, y - 1), getView(x, y), isAdd);
            }
        }
            break;

        case map.MOVE_RIGHT: {
            for (; y < column - 1; y++) {
                swap(getView(x, y + 1), getView(x, y), isAdd);
            }
        }
            break;

        case map.MOVE_UP: {
            for (; x > 0; x--) {
                swap(getView(x - 1, y), getView(x, y), isAdd);
            }
        }
            break;
        }
    }

    /**
     * 单向交换实现移动
     * 
     * @param next
     *            移动至目标位置
     * @param now
     *            需要移动的目标
     * @param isAdd
     *            是否是第一次移动
     */
    public void swap(Cube next, Cube now, boolean isAdd) {
        if (isAdd) {
            if (now.getNum() != 0 && next.getNum() == 0) {
                next.setText(now.getNum());
                now.setText(0);
                next.setIsAdded(now.isAdded());
                now.setIsAdded(false);
            } else if (!now.isAdded() && !next.isAdded()
                    && next.getNum() == now.getNum() && now.getNum() != 0) {
                next.setText(now.getNum() * 2);
                now.setText(0);
                next.setIsAdded(true);
                now.setIsAdded(false);
            }
        } else {
            if (next.getNum() == 0) {
                next.setText(now.getNum());
                now.setText(0);
            }
            now.setIsAdded(false);
            next.setIsAdded(false);
        }
    }

    /**
     * 获取指定控件
     * 
     * @param x
     * @param y
     * @return Cube
     */
    public Cube getView(int x, int y) {
        return viewList.get(new Point(x, y));
    }

    /**
     * 生成随机控件 随机位置
     */
    public void createCube() {
        int x;
        int y;

        do {
            x = (int) (Math.random() * 1000 % row);
            y = (int) (Math.random() * 1000 % column);
        } while (getView(x, y).getNum() != 0);

        getView(x, y).setText(Math.random() > 0.5 ? 2 : 4);
        isOverGame();
    }

    /**
     * 检测游戏状态
     */
    public void isOverGame() {
        int score = 0;
        int state = map.GAME_OVER;

        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {

                // 计算得分
                score += getView(x, y).getNum();

                if (getView(x, y).getNum() == 0) {
                    state = map.GAME_CONTINUE;
                } else if (getView(x, y).getNum() == 2048 * (gameLv + 1)) {
                    state = map.GAME_WIN;
                }
            }
        }

        if (state != map.GAME_CONTINUE && state != map.GAME_WIN) {
            gameState = map.GAME_OVER;
        } else {
            gameState = state;
        }

        scoreBoard.setText("得分:" + score);

    }

    /**
     * 计步
     */
    public void addCount() {
        count++;
        arithmometer.setText("计步：" + count);
    }

    /**
     * 获取游戏状态
     * 
     * @return int
     */
    public int getGameState() {
        return gameState;
    }

    /**
     * 初始化游戏数据
     */
    public void initialise() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                getView(i, j).setText(0);
            }
        }

        createCube();
        createCube();
        count = 0;
        arithmometer.setText("计步：" + count);
        gameLv = 0;
        this.setTitle("2048");
    }

    /**
     * 开启新游戏
     */
    public void newGame() {
        if (gameState == map.GAME_CONTINUE) {
            int jop = JOptionPane.showConfirmDialog(null, "是否开始新一轮游戏?", "Tips",
                    JOptionPane.YES_NO_OPTION);

            if (jop == JOptionPane.YES_OPTION) {
                initialise();
            }
        } else {
            initialise();
        }
    }

    /**
     * 重载窗体事件-控制关闭
     */
    protected void processWindowEvent(WindowEvent e) {
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            if (getGameState() == map.GAME_CONTINUE) {
                int jop = JOptionPane.showConfirmDialog(null, "是否退出游戏?",
                        "Tips", JOptionPane.YES_NO_OPTION);

                if (jop == JOptionPane.YES_OPTION) {
                    super.processWindowEvent(e);
                }
            } else {
                super.processWindowEvent(e);
            }
        }
    }

    /**
     * 进入下一难度游戏
     */
    public void nextLv() {
        gameLv++;
        this.setTitle(2048 * (gameLv + 1) + "");
    }

    /**
     * 关于
     */
    public void about() {
        JOptionPane.showMessageDialog(null, "E-mail:czh60601@126.com");
    }
}

class Cube {
    public int num;
    public JButton btn;
    public boolean isAdded;

    /**
     * 构造一个方块
     */
    public Cube() {
        btn = new JButton();
        btn.setFont(new Font("微软雅黑", Font.BOLD, 24));
        btn.setEnabled(false);
        num = 0;
        isAdded = false;
    }

    /**
     * 设置文本内容
     * 
     * @param n
     *            数值
     */
    public void setText(int n) {
        num = n;
        btn.setText(n != 0 ? n + "" : "");
    }

    /**
     * 获取控件
     * 
     * @return JButton
     */
    public JButton getView() {
        return btn;
    }

    /**
     * 获取数值
     * 
     * @return int
     */
    public int getNum() {
        return num;
    }

    /**
     * 是否是相加而成 限当前移动次有效,移动结束后改回默认值-false
     * 
     * @return
     */
    public boolean isAdded() {
        return isAdded;
    }

    /**
     * 修改生成方式
     * 
     * @param b
     *            true-相加而成
     */
    public void setIsAdded(boolean b) {
        isAdded = b;
    }

}

class MyKeyListener implements KeyListener {
    /*
     * 键盘代码 w/87 s/83 a/65 d/68 up/38 down/40 left/37 right/39 f1/112 f2/113
     * f3/114
     */
    final public static int KEY_W = 0xf57;
    final public static int KEY_S = 0xf53;
    final public static int KEY_A = 0xf41;
    final public static int KEY_D = 0xf44;
    final public static int KEY_UP = 0xf26;
    final public static int KEY_DOWN = 0xf28;
    final public static int KEY_LEFT = 0xf25;
    final public static int KEY_RIGHT = 0xf27;

    public map game;

    /**
     * 构造一个键盘监听器
     * 
     * @param game
     *            主界面
     */
    public MyKeyListener(map game) {
        this.game = game;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode() + 0xf00;

        switch (game.getGameState()) {
        case map.GAME_CONTINUE: {
            switch (keyCode) {
            case MyKeyListener.KEY_W:
            case MyKeyListener.KEY_UP: {
                game.up();
            }
                break;

            case MyKeyListener.KEY_S:
            case MyKeyListener.KEY_DOWN: {
                game.down();
            }
                break;

            case MyKeyListener.KEY_A:
            case MyKeyListener.KEY_LEFT: {
                game.left();
            }
                break;

            case MyKeyListener.KEY_D:
            case MyKeyListener.KEY_RIGHT: {
                game.right();
            }
                break;
            }
        }
            break;

        case map.GAME_OVER: {
            int jop = JOptionPane
                    .showConfirmDialog(null, "很遗憾，你没能达成本次目标，是否开启新游戏?", "游戏结束",
                            JOptionPane.YES_NO_OPTION);

            if (jop == JOptionPane.YES_OPTION) {
                game.newGame();
            }
        }
            break;

        case map.GAME_WIN: {
            int jop = JOptionPane.showConfirmDialog(null,
                    "你已完成本次目标:" + game.getTitle() + ",是否进入更高难度游戏?", "恭喜晋级",
                    JOptionPane.YES_NO_OPTION);

            if (jop == JOptionPane.YES_OPTION) {
                game.nextLv();
            }
        }
            break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}

class MyMouseListener implements MouseListener {
    public map game;
    public int btnEvn;

    public MyMouseListener(map game, int btnEvn) {
        this.game = game;
        this.btnEvn = btnEvn;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        switch (btnEvn) {
        case map.BUTTON_NEW_GAME: {
            game.newGame();
        }
            break;

        case map.BUTTON_ABOUT: {
            game.about();
        }
            break;

        case map.BUTTON_EXIT: {
            game.processWindowEvent(new WindowEvent(game,
                    WindowEvent.WINDOW_CLOSING));
        }
            break;
        }
    }

}
