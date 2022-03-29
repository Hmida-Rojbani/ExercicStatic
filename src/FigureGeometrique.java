 
public class FigureGeometrique {
    String couleurContour = "Jaune";
    String couleurSurface = "Blanc";
 
    static int nbFigures = 0;
    static int nbFigContNoir = 0;
    static int nbFigSurfBlanc = 0;
	public FigureGeometrique() {
		super();
		nbFigures++;
		nbFigSurfBlanc++;
		
	}
	public FigureGeometrique(String couleurContour, String couleurSurface) {
		super();
		this.couleurContour = couleurContour;
		this.couleurSurface = couleurSurface;
		nbFigures++;
		if(couleurContour.equalsIgnoreCase("Noir")) {
			nbFigContNoir++;
		}
		if(couleurSurface.equalsIgnoreCase("Blanc")) {
			nbFigSurfBlanc++;
		}
	}
	public void changerCouleurContour(String couleurContour) {
		if(this.couleurContour.equalsIgnoreCase("Noir")) {
			nbFigContNoir--;
		}
		
		this.couleurContour = couleurContour;
		if(couleurContour.equalsIgnoreCase("Noir")) {
			nbFigContNoir++;
		}	
		
	}
    
    
}