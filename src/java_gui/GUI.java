package java_gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

	private int count = 0;
//	import J from swing...
	private JLabel label;
	private JFrame frame;
	private JPanel panel;

	public GUI() {
		frame = new JFrame();
		
		panel = new JPanel();
		
		JButton button = new JButton("Click me!");
		button.addActionListener(this);
		label = new JLabel("Number of clicks: 0");
		
		panel.setBorder(BorderFactory.createEmptyBorder(100, 300, 100, 300));
		panel.setLayout(new GridLayout(2, 5));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI");
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count ++;
		label.setText("Number of clicks: " + count);
	}

}
