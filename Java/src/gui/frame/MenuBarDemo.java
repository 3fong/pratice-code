package gui.frame;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 *һ���˵�
 */
public class MenuBarDemo {

	public static void main(String[] args) {
		// �������������������
		Frame f = new Frame("һ���˵�");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());

		// �����˵���
		MenuBar mb = new MenuBar();
		// �����˵�
		Menu m = new Menu("�ļ�");
		// �����˵���
		MenuItem mi = new MenuItem("�˳�ϵͳ");

		// ˭���˭��
		m.add(mi);
		mb.add(m);

		// ���ò˵���
		f.setMenuBar(mb);

		// ���ô���ر�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		mi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// ���ô���ɼ�
		f.setVisible(true);
	}

}
