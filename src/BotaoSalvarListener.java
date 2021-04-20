import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;


public class BotaoSalvarListener implements ActionListener, MouseListener {

	private MeuTextField tituloField;
	private MeuTextField sinopseField;
	private JComboBox<String> generoComboBox;
	private MeuRadioGroup plataformasRadioGroup;
	private JCheckBox assistidoJCheck;
	private StarRater StarRater;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Filme filme = new Filme();
		filme.setTitulo(tituloField.getText());
		filme.setSinopse(sinopseField.getText());
		filme.setGenero((String) generoComboBox.getSelectedItem());
		
		
		filme.setPlataforma(plataformasRadioGroup.grupo.getSelection().getActionCommand());
		filme.setAssistido(assistidoJCheck.isEnabled());
		filme.setStarRater(StarRater.getSelection());
		System.out.println(filme.toString());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
	
	}

	@Override
	public void mouseExited(MouseEvent e) {
	
	}

	public void setTituloField(MeuTextField tituloField) {
		this.tituloField = tituloField;
	}

	public void setSinopseField(MeuTextField sinopseField) {
		this.sinopseField = sinopseField;
	}

	public void setGeneroComboBox(JComboBox<String> generoComboBox) {
		this.generoComboBox = generoComboBox;
	}

	public void setPlataformasRadioGroup(MeuRadioGroup plataformasRadioGroup) {
		this.plataformasRadioGroup = plataformasRadioGroup;
	}

	public void setAssistidoJCheck(JCheckBox assistidoJCheck) {
		this.assistidoJCheck = assistidoJCheck;
	}

	public void setStarRater(StarRater starRater) {
		StarRater = starRater;
	}
	
}
