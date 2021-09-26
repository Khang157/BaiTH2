import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class chuongtrinh {
	public static void main(String[] args) {
		
		Frame fr = new Frame("Tong 2 so ");
		fr.setBounds(0, 0, 300, 70);
		fr.setLayout(new FlowLayout());

		//
		Label lblA = new Label("");
		Label lblB = new Label("");
		Label lblBang = new Label("=");
		
		JComboBox btnpt = new JComboBox();
		btnpt.addItem("+");
		btnpt.addItem("-");
		btnpt.addItem("*");
		btnpt.addItem("/");
		btnpt.setSelectedItem(null);
        btnpt.setBounds(100, 50, 50, 20);
        fr.add(btnpt);
        
       
		TextField txtA = new TextField();
		TextField txtB = new TextField();
		TextField txtKQ = new TextField();
		
		
		
		fr.add(txtA);
		fr.add(btnpt);
		fr.add(txtB);
		fr.add(lblBang);
		fr.add(txtKQ);
		
		
			ActionListener bolangnghe = new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					String strA = txtA.getText();
					String strB = txtB.getText();
					// doi sang	con so de tin toan
					int a = Integer.parseInt(strA);
					int b = Integer.parseInt(strB);
					
					String cong=String.valueOf(a+b);
					String tru=String.valueOf(a-b);
					String nhan=String.valueOf(a*b);
					String chia=String.valueOf(a/b);
					
					if(btnpt.getSelectedItem().equals("+"))
					{
						txtKQ.setText(cong);
					}
					if(btnpt.getSelectedItem().equals("-"))
					{
						txtKQ.setText(tru);
					}
					if(btnpt.getSelectedItem().equals("*"))
					{
						txtKQ.setText(nhan);
					}
					if(btnpt.getSelectedItem().equals("/"))
					{
						txtKQ.setText(chia);
					}
									
				}
			};
		btnpt.addActionListener(bolangnghe);
		
		
		
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		
		
		fr.setVisible(true);
	}
}
