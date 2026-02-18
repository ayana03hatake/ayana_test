import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UI3 {


	public  static void main(String[] args) {
		JFrame frame = new JFrame("家計簿入力画面");
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);//中央揃え
		JPanel formPanel = new JPanel(new GridLayout(4, 2, 8, 8));
        formPanel.setBackground(new Color(230, 255, 230));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//閉じるでアプリケーションも終了
	
       //インスタンスを作る
	  
	
		JPanel panel = new JPanel();
		//panel.setPreferredSize(new Dimension(300, 100));
		panel.setLayout(new FlowLayout());
		frame.setSize(200, 200);
		panel.setBackground(new Color(230, 255, 230));
		frame.add(panel);

		//項目ラベル
		JLabel datelabel = new JLabel("日付 ");
		JLabel categorylabel = new JLabel("カテゴリー");
		JLabel praicelabel = new JLabel("金額");
		JLabel memolabel = new JLabel("メモ");
		
		
		
		
		//テキストエリア
		
		
		//panel1.setBackground(new Color(230, 255, 230));
		JTextArea date = new JTextArea();
		JTextArea category = new JTextArea();
		JTextArea praice = new JTextArea();
		JTextArea memo = new JTextArea();
		
		date.setPreferredSize(new Dimension(150, 30));
		date.setFont(new Font("Century", Font.BOLD ,20));
		
		category.setPreferredSize(new Dimension(150, 30));
		category.setFont(new Font("Century", Font.BOLD ,20));
		
		praice.setPreferredSize(new Dimension(150, 30));
		praice.setFont(new Font("Century", Font.BOLD ,20));
		
		memo.setPreferredSize(new Dimension(150, 30));
		memo.setFont(new Font("Century", Font.BOLD ,20));
		
		
		/*JPanel panel1 = new JPanel();
		//panel.setPreferredSize(new Dimension(300, 100));
		panel1.setLayout(new FlowLayout());
		frame.setSize(200, 200);
		panel.setBackground(new Color(230, 255, 230));*/
		panel.add(datelabel);
		panel.add(date);
		panel.add(categorylabel);
		panel.add(category);
		panel.add(praicelabel);
		panel.add(praice);
		panel.add(memolabel);	
		panel.add(memo);

		
		
		//保存したら表に入る
		JButton button = new JButton("保存");
		button.setSize(30,100);
		panel.add(button);
		
		// ラムダ式
		
		button.addActionListener(e -> {
		    System.out.println("保存をしました！");
		   System.out.println (date.getText().trim());
		    System.out.println(category.getText().trim());
		    System.out.println(praice.getText().trim());
		    System.out.println(memo.getText().trim());
		    
		});
		//String date1 = date.getText();

		
		
		frame.setVisible(true);//
		panel.setVisible(true);//
		
		
		
		}
		

		//Container contentPane = getContentPane();
		//contentPane.add(panel, BorderLayout.CENTER);


	}


