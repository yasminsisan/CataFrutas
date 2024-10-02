package Interface;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class Interface extends JFrame {
	JButton[] bt = new JButton[9];
	public Interface() {
		setVisible(true);
		setTitle("Título");
		setDefaultCloseOperation(3);
		setLayout(null);
		setBounds(0,0,700,700);
		int cont = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				bt[cont] = new  JButton();
				add(bt[cont]);
				bt[cont].setBounds((100*i)+50,(100*j)+50,95,95);
				cont++;
			}
		}
	}
	
	
	
	/*private JFrame frame;

	*/
	public static void main(String[] args) {
		
		new Interface();
		
		/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}
/*
	
	public Interface() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}*/

}
