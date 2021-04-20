import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MeuRadioGroup extends JPanel{

	private static final long serialVersionUID = 1L;

	public ButtonGroup grupo = new ButtonGroup();
	private List<String> opcoes;

	
	public MeuRadioGroup(List<String> opcoes) {
		this.opcoes = opcoes;
		init();	
	}

	private void init() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		opcoes.forEach(opcao -> {
			JRadioButton botao = new JRadioButton(opcao);
			botao.setActionCommand(opcao);
			grupo.add(botao);
			this.add(botao);
		});
		
	}
	
	

}
