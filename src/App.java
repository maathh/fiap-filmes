import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;


public class App {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar aparencia");
		}
		JFrame frame = new JFrame();
		BotaoSalvarListener BotaoSalvarListener = new BotaoSalvarListener();
		
		JPanel tabCadastro = new JPanel();
		tabCadastro.setLayout(new FlowLayout());
		
		
		//####fotoPanel####
		JPanel fotoPanel = new JPanel();
		fotoPanel.setLayout(new FlowLayout());
		fotoPanel.setSize(190, 350);
		ImageIcon imageIcon = new ImageIcon("wandavision.jpeg"); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(160, 160,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back
		fotoPanel.add(new JLabel(imageIcon));
		//####fotoPanel####
		
		
		
		//####camposPanel####
		JPanel camposPanel = new JPanel(); 
		camposPanel.setSize(190, 350);
		camposPanel.setLayout(new BoxLayout(camposPanel, BoxLayout.Y_AXIS));
		
		MeuTextField tituloText = new MeuTextField();
		camposPanel.add(new MeuLabel("Título", Color.BLACK));
		camposPanel.add(tituloText);
		BotaoSalvarListener.setTituloField(tituloText);
		
		MeuTextField sinopseText = new MeuTextField();
		camposPanel.add(new MeuLabel("Sinopse", Color.BLACK));
		camposPanel.add(sinopseText);
		BotaoSalvarListener.setSinopseField(sinopseText);
		
		String[] generos = {"", "Ação", "Suspense"};
		JComboBox<String> generosComboBox = new JComboBox<String>(generos);
		generosComboBox.setAlignmentX(Component.LEFT_ALIGNMENT);
		camposPanel.add(new MeuLabel("Genero", Color.BLACK));
		camposPanel.add(generosComboBox);
		BotaoSalvarListener.setGeneroComboBox(generosComboBox);
		
		JPanel botoesPanel = new JPanel();
		botoesPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		botoesPanel.setLayout(new FlowLayout());
		JButton botaoSalvar = new JButton("Salvar");
		JButton botaoCancelar = new JButton("Cancelar");
		botoesPanel.add(botaoSalvar);
		botoesPanel.add(botaoCancelar);
		
		camposPanel.add(botoesPanel);
		//####camposPanel####
		
		
		
		//####opcoesPanel####
		JPanel opcoesPanel = new JPanel();
		opcoesPanel.setSize(190, 350);
		opcoesPanel.setLayout(new BoxLayout(opcoesPanel, BoxLayout.Y_AXIS));
		
		opcoesPanel.add(new MeuLabel("Onde assistir", Color.BLACK));
		MeuRadioGroup plataformasRadios = new MeuRadioGroup(List.of("Netflix", "Prime Video", "Pirate Bay"));
		opcoesPanel.add(plataformasRadios);
		BotaoSalvarListener.setPlataformasRadioGroup(plataformasRadios);
		
		JCheckBox assistidoCheck = new JCheckBox("Assistido");
		assistidoCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
		opcoesPanel.add(assistidoCheck);
		BotaoSalvarListener.setAssistidoJCheck(assistidoCheck);
		
		opcoesPanel.add(new MeuLabel("Avaliação", Color.BLACK));
		StarRater StarRater = new StarRater(5, 0);
		StarRater.setAlignmentX(Component.LEFT_ALIGNMENT);
		opcoesPanel.add(StarRater);
		BotaoSalvarListener.setStarRater(StarRater);
		//####opcoesPanel####
		
		
		botaoSalvar.addActionListener(BotaoSalvarListener);

		
		tabCadastro.add(fotoPanel);
		tabCadastro.add(camposPanel);
		tabCadastro.add(opcoesPanel);
		
		JTabbedPane abas = new JTabbedPane();
		abas.add("Cadastro", tabCadastro);
		abas.add("Lista",  new JPanel());
		
		frame.add(abas);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setVisible(true);
	}
}
