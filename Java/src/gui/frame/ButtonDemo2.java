package gui.frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 *
 */
public class ButtonDemo2 {

	public static void main(String[] args) {
		// �����������
		Frame f = new Frame("���ת��");
		// ���ô������ԺͲ���
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());

		// �����ı���
		final TextField tf = new TextField(20);
		// ������ť
		Button bu = new Button("���ת��");
		// �����ı���
		final TextArea ta = new TextArea(10, 40);

		// �������ӵ�����
		f.add(tf);
		f.add(bu);
		f.add(ta);

		// ���ô���ر�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// �԰�ť����¼�
		bu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ȡ�ı����ֵ
				String tf_str = tf.getText().trim();
				// ������
				tf.setText("");

				// ���ø��ı���
				// ta.setText(tf_str);
				// ׷�Ӻͻ���
				ta.append(tf_str + "\r\n");

				// ��ȡ���
				tf.requestFocus();
			}
		});

		// ���ô�����ʾ
		f.setVisible(true);
	}

}
