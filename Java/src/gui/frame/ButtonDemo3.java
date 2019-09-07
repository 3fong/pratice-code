package gui.frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 *
 */
public class ButtonDemo3 {

	public static void main(String[] args) {
		// �����������
		final Frame f = new Frame("��ı���ɫ");
		// ���ô������ԺͲ���
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());

		// �����ĸ���ť
		Button redButton = new Button("��ɫ");
		Button greenButton = new Button("��ɫ");
		Button buleButton = new Button("��ɫ");

		// ��Ӱ�ť
		f.add(redButton);
		f.add(greenButton);
		f.add(buleButton);

		// ���ô���ر�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// �԰�ť��Ӷ����¼�
		// redButton.addActionListener(new ActionListener() {
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// f.setBackground(Color.RED);
		// }
		// });

		// �԰�ť���������¼�
		// redButton.addMouseListener(new MouseAdapter() {
		// @Override
		// public void mouseClicked(MouseEvent e) {
		// f.setBackground(Color.RED);
		// }
		// });

		// �԰�ť������Ľ����¼�
		redButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.RED);
			}
		});

		redButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});

		greenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.GREEN);
			}
		});

		greenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});

		buleButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.BLUE);
			}
		});

		buleButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});

		// ���ô�����ʾ
		f.setVisible(true);
	}

}
