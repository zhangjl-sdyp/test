import javax.swing.*;
import java.awt.*;

/**
 * @ClassName UI
 * @Date 2019/12/29 下午 08:45
 */
public class UI {
    public void showUI() {
        //建立新界面
        JFrame frame = new JFrame();
        frame.setSize(600, 900);
        //用户点击关闭窗口时关闭界面
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //流式布局
        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);
        //插入账号文本框
        JTextField register = new JTextField();
        frame.add(register);
        //标签1
        JLabel lable1 = new JLabel();
        frame.add(lable1);
        //密码
        JPasswordField password = new JPasswordField();
        frame.add(password);
        //标签2
        JLabel lable2 = new JLabel();
        frame.add(lable2);
        //复选框
        JCheckBox checkbox = new JCheckBox();
        frame.add(checkbox);
        //按钮
        JButton butt = new JButton();
        //设置复选框大小
        Dimension check = new Dimension(200, 35);
        checkbox.setPreferredSize(check);
        //加入接口类
        lisener lisen = new lisener();
        //给按钮添加监听器
        butt.addActionListener(lisen);
        //让监听器的文本框和处理的文本框对应
        lisen.nameinput = register;
        lisen.passinput = password;
        lisen.jiemain = frame;
        password.addActionListener(lisen);
        //设置界面可见
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        UI ui = new UI();
        ui.showUI();
    }
}






















