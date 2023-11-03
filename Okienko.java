import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
	public JFrame mainFrame;
	
	public static void main(String[] args){
		final JFrame mainFrame = new JFrame("Witaj okienko!");
		JButton przycisk = new JButton("Kliknij mnie!");
		JLabel label1 = new JLabel("cos");

		label1.setText("Tekst");
		mainFrame.setSize(400,200);
		mainFrame.add(przycisk);
		mainFrame.setVisible(true);

		przycisk.addActionListener(new ActionListener() {
			public int licznik = 0;
			public void actionPerformed(ActionEvent e) {
				licznik++;
				przycisk.setText(String.valueOf(licznik));
			}
		});
	}
}