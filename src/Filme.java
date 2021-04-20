import java.io.Serializable;

public class Filme implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String titulo;
	private String sinopse;
	private String genero;
	private String plataforma;
	private boolean assistido;
	private int StarRater;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public boolean isAssistido() {
		return assistido;
	}
	public void setAssistido(boolean assistido) {
		this.assistido = assistido;
	}
	public int getStarRater() {
		return StarRater;
	}
	public void setStarRater(int starRater) {
		StarRater = starRater;
	}
	
	public String toString() {
 	   return new StringBuffer(" Titulo : ")
 	   .append(this.titulo)
 	   .append("\n Sinopse : ")
 	   .append(this.sinopse)
 	   .append("\n Genero : ")
	   .append(this.genero)
	   .append("\n Plataforma : ")
	   .append(this.plataforma)
	   .append("\n Assistido : ")
	   .append(this.assistido == true ? "Sim" : "Não")
	   .append("\n Nota : ")
	   .append(this.StarRater)
 	   .toString();
	}
	
	
}
