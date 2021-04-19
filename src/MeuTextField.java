import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class MeuTextField extends JTextField {

	private static final long serialVersionUID = 1L;
	
	public MeuTextField() {
		super();
		init();
	}

	private void init() {
		this.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		this.setPreferredSize(new Dimension(150,25));
		this.setBorder(BordaFactory.criar());
	}

}
