package gui.frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 *
 */
public class ButtonDemo {

	public static void main(String[] args) {
		// �����������
		Frame f = new Frame("��Ӱ�ť");
		// ��������
		f.setBounds(400, 200, 400, 300);
		// ���ò���Ϊ��ʽ����
		f.setLayout(new FlowLayout());

		// ������ť����
		Button bu = new Button("���Ұ�");
		// bu.setSize(20, 10);

		// �Ѱ�ť��ӵ�����
		f.add(bu);

		// ���ô�����Թر�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		bu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���ٵ�����");
			}
		});

		// ������ʾ
		f.setVisible(true);
	}

}
