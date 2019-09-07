package gui.frame;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 *�����������Ƿ������ַ��ȡ�������¼���Ч��
 */
public class KeyAdapterDemo {

	public static void main(String[] args) {
		// �������������������
		Frame f = new Frame("��������������ַ�");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());

		// ����Label��ǩ����
		Label label = new Label("���������QQ���룬�����Ƿ����֣�����������");
		TextField tf = new TextField(40);

		// ��ӵ�������
		f.add(label);
		f.add(tf);

		// ���ô���ر�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// ���ı�������¼�
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// �����ȡ�õ��ַ��������ַ��ȡ���¼�
				// ˼·���Ȼ�ȡ�ַ��ж��ַ�ȡ���¼�
				// char getKeyChar()
				char ch = e.getKeyChar();
				// System.out.println(ch);
				if (!(ch >= '0' && ch <= '9')) {
					e.consume();
				}
			}
		});

		// ���ô���ɼ�
		f.setVisible(true);
	}

}
