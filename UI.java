import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UI {


	public  static void main(String[] args) {
		JFrame frame = new JFrame("家計簿入力画面");
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);//中央揃え
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//閉じるでアプリケーションも終了
	
       //インスタンスを作る
	  
	
		JPanel panel = new JPanel();
		panel.setSize(200, 50);
		panel.setBackground(new Color(230, 255, 230));

		//テキストエリア
		JTextArea date = new JTextArea();
		JTextArea category = new JTextArea();
		JTextArea praice = new JTextArea();
		JTextArea memo = new JTextArea();

		date.setPreferredSize(new Dimension(40, 20));
		category.setPreferredSize(new Dimension(60, 20));
		praice.setPreferredSize(new Dimension(100, 20));
		memo.setPreferredSize(new Dimension(100, 20));

		panel.add(date);
		panel.add(category);
		panel.add(praice);
		panel.add(memo);

		frame.add(panel, BorderLayout.CENTER);
	   
		
		//保存したら表に入る
		JButton button = new JButton("保存");
		
		button.setSize(30,100);
		panel.add(button);
		// ラムダ式
		
		button.addActionListener(e -> {
		    System.out.println("保存をしました！");
		   String dateText =(date.getText().trim());
		    System.out.println(category.getText());
		    System.out.println(praice.getText());
		    System.out.println(memo.getText());
		    
		});
		//String date1 = date.getText();

		
		
		frame.setVisible(true);//
		panel.setVisible(true);//
		
		
		
		}
		

		//Container contentPane = getContentPane();
		//contentPane.add(panel, BorderLayout.CENTER);


	}


