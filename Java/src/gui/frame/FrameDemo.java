package gui.frame;

import java.awt.Frame;

public class FrameDemo {
	public static void main(String[] args) {
		// �����������
		// Frame f = new Frame();
		// Frame(String title)
		Frame f = new Frame("����ϼ");

		// ���ô������
		f.setTitle("HelloWorld");
		// ���ô����С
		f.setSize(400, 300); // ��λ������
		// ���ô���λ��
		f.setLocation(400, 200);

		// ����һ�������������ô���ɼ�
		// f.show();
		f.setVisible(true);

		// System.out.println("helloworld");
	}
}
