import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @ClassName Listener2
 * @Date 2019/12/29 下午 08:53
 */
public class Listener2 implements KeyListener {
    JTextField name1;
    JFrame frame;
    JTextField pass1;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("鼠标点击了");
        String name = pass1.getText();
        String password = pass1.getText();
        if (name.equals("zhangjinlong") && password.equals("123456")) {
            System.out.println("登陆成功");
            frame.dispose();
        } else {
            System.out.println("登陆失败");
            JOptionPane pane = new JOptionPane();
            JOptionPane.showMessageDialog(null, "登陆失败", "警告", JOptionPane.ERROR_MESSAGE);
        }
    }
}
















