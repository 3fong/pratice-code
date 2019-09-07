package gui.frame;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo3 {
	public static void main(String[] args) {
		// �����������
		Frame f = new Frame("����رհ���");

		// ���ô�������
		f.setBounds(400, 200, 400, 300);

		// �ô���ر�
		//�¼�Դ
		//�¼����Դ���Ĵ���
		//�¼����?�رմ���(System.exit(0));
		//�¼�����
//		f.addWindowListener(new WindowListener() {
//			@Override
//			public void windowOpened(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//			}
//		});
		
		//����������Ľ�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// ���ô���ɼ�
		f.setVisible(true);
	}
}
