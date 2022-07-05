package snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//游戏的面板
public class GamePanel extends JPanel implements KeyListener, ActionListener {
    //定义蛇的数据结构
    int length;//蛇的长度
    int[] snakeX = new int[600];//蛇的x坐标 25*25
    int[] snakeY = new int[500];//蛇的x坐标 25*25
    String fx;//初始方向向右

    //食物的坐标
    int foodx;
    int foody;

    int score;//分数
    Random random = new Random();

    //游戏当前的状态
    boolean gameStatus = false;//默认不是开始

    boolean isFail = false;//游戏失败状态
    //定时器  以ms会单位 1000ms=1s
    Timer timer = new Timer(100, this);

    //构造器
    public GamePanel() {
        init();
        //获得焦点和键盘事件
        this.setFocusable(true);//获得焦点事件
        this.addKeyListener(this);
        timer.start();//游戏一开始定时器就开启!
    }

    public void init() {
        score = 0;
        fx = "R";
        length = 3;
        snakeX[0] = 100;
        snakeY[0] = 100;//脑袋的坐标
        snakeX[1] = 75;
        snakeY[1] = 100;//第一个身体的坐标
        snakeX[2] = 50;
        snakeY[2] = 100;//第二个身体的坐标
        foodx = 25 + 25 * random.nextInt(34);
        foody = 75 + 25 * random.nextInt(24);
    }


    //绘制面板
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏
        //绘制静态的面板
        this.setBackground(Color.white);
        Data.header.paintIcon(this, g, 25, 11);//把头部头部广告栏画上去
        g.fillRect(25, 75, 850, 600);//广告
        //画积分
        g.setColor(Color.white);
        g.setFont(new Font("微软雅黑", Font.BOLD, 20));
        g.drawString("长度" + length, 750, 30);
        g.drawString("分数" + score, 750, 55);
        //画食物
        Data.food.paintIcon(this, g, foodx, foody);
        //把小蛇画上去
        if (fx.equals("R")) {
            Data.right.paintIcon(this, g, snakeX[0], snakeY[0]);//蛇头初始化向右,需要通过方向来判断
        } else if (fx.equals("L")) {
            Data.left.paintIcon(this, g, snakeX[0], snakeY[0]);//蛇头初始化向左,需要通过方向来判断
        } else if (fx.equals("U")) {
            Data.up.paintIcon(this, g, snakeX[0], snakeY[0]);//蛇头初始化向上,需要通过方向来判断
        } else if (fx.equals("D")) {
            Data.down.paintIcon(this, g, snakeX[0], snakeY[0]);//蛇头初始化向下,需要通过方向来判断
        }
        Data.right.paintIcon(this, g, snakeX[0], snakeY[0]);//蛇头初始化向右,需要通过方向来判断
        for (int i = 1; i < length; i++) {
            Data.body.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        if (gameStatus == false) {
            g.setColor(Color.white);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏", 300, 300);
        }
        if (isFail) {
            g.setColor(Color.RED);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("失败,按下空格重新开始", 300, 300);
        }
    }

    //事件监听---需要通过固定事件来刷新,1s=10次
    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameStatus && isFail == false) {//如果游戏是开始状态,就让小蛇动起来!
            //吃食物
            if (snakeX[0] == foodx && snakeY[0] == foody) {
                length++;
                score++;
                //再次随机食物
                foodx = 25 + 25 * random.nextInt(34);
                foody = 75 + 25 * random.nextInt(24);
            }
            //移动
            for (int i = length - 1; i > 0; i--) {//从后一节移到前一节的位置 snake[1] =snake[0];
                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }
            //走向
            if (fx.equals("R")) {
                snakeX[0] = snakeX[0] + 25;
                if (snakeX[0] > 850) {
                    snakeX[0] = 25;
                }//边界判断
            } else if (fx.equals("L")) {
                snakeX[0] = snakeX[0] - 25;
                if (snakeX[0] < 25) {
                    snakeX[0] = 850;
                }//边界判断
            } else if (fx.equals("U")) {
                snakeY[0] = snakeY[0] - 25;
                if (snakeY[0] < 75) {
                    snakeY[0] = 650;
                }//边界判断
            } else if (fx.equals("D")) {
                snakeY[0] = snakeY[0] + 25;
                if (snakeY[0] > 650) {
                    snakeY[0] = 75;
                }//边界判断
            }
            //失败判定
            for (int i = 1; i < length; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                    isFail = true;
                }
            }
            repaint();//重画页面
        }
//        timer.start();//定时器开启!
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();//获得键盘按键是哪一个
        if (keyCode == KeyEvent.VK_SPACE) {//如果按下的是空格
            if (isFail) {
                //重写开始
                isFail = false;
                init();
            } else {
                gameStatus = !gameStatus;//取反
            }
            repaint();
        }
        //小蛇移动

        if (keyCode == KeyEvent.VK_UP && fx != "D") {
            fx = "U";
        } else if (fx != "U" && keyCode == KeyEvent.VK_DOWN) {
            fx = "D";
        } else if (fx != "R" && keyCode == KeyEvent.VK_LEFT) {
            fx = "L";
        } else if (keyCode == KeyEvent.VK_RIGHT && fx != "L") {
            fx = "R";
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

}
