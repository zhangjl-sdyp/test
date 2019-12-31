import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName lisener
 * @Date 2019/12/29 下午 08:48
 */
public class lisener implements ActionListener {
    JTextField nameinput;
    JTextField passinput;
    JFrame jiemain;

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("你好约吗？");
        System.out.println("鼠标点击了");
        System.out.println("sadsdaa");
        String name = nameinput.getText();
        String password = passinput.getText();
        if (name.equals("zhangjinlong") && password.equals("123456")) {
            System.out.println("登陆成功");
            jiemain.dispose();
        } else {
            System.out.println("登陆失败");
            JOptionPane pane = new JOptionPane();
            JOptionPane.showMessageDialog(null, "登陆失败", "警告", JOptionPane.ERROR_MESSAGE);
        }
    }
}
