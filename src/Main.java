import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class Main {

	public static void main(String[] args) {
		int count = 1000;
		JFrame frame = new JFrame("Yamori Says");
		JButton subtractor = new JButton("What's " + count + " minus 7?");
		JTextArea answer  = new JTextArea(Integer.toString(count));
		answer.setAlignmentY(JTextArea.CENTER_ALIGNMENT);
		
		subtractor.addActionListener(new Subtractor(count, answer, subtractor));
		
		frame.add(subtractor, BorderLayout.NORTH);
		frame.add(answer, BorderLayout.SOUTH);
				
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static class Subtractor implements ActionListener {
		private int count;
		private JTextArea textArea;
		private JButton subtractor;
		
		public Subtractor(int count, JTextArea answer, JButton subtractor) {
			this.count = count;
			this.textArea = answer;
			this.subtractor = subtractor;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			this.count = this.count - 7;
			this.textArea.setText(Integer.toString(this.count));
			this.subtractor.setText("What's " + this.count + " minus 7?");
		}
		
	}

}
