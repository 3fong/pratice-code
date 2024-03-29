package gui04;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 需求：把按钮添加到窗体，并对按钮添加一个点击事件。
 * A：创建窗体对象
 * B:创建按钮对象
 * C:把按钮添加到窗体
 * D:窗体显示
 */
public class FrameDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		Frame f = new Frame("添加按钮");
		// 设置属性
		f.setBounds(400, 200, 400, 300);
		// 设置布局为流式布局
		f.setLayout(new FlowLayout());

		// 创建按钮对象
		Button bu = new Button("点我啊");
		// bu.setSize(20, 10);

		// 把按钮添加到窗体
		f.add(bu);

		// 设置窗体可以关闭
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		bu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("你再点试试");
			}
		});

		// 窗体显示
		f.setVisible(true);
	}
}
