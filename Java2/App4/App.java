/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public class App
{
	/**
	 * Main method for 'App'
	 <p>
	 * Creates 3 arrays of each 5 shapes and finding min/max area/volume/ratio
	 * 
	 * @param args Arguments (as String[])
	 */
	public static void main(String[] args)
	{
		Shape[] shapes1 = new Shape[5];
		Shape[] shapes2 = new Shape[5];
		Shape[] shapes3 = new Shape[5];
		
		shapes1[0] = new Dodecahedron(3.2);
		shapes1[1] = new Tetrahedron(2.0);
		shapes1[2] = new Octahedron(4.1);
		shapes1[3] = new Hexahedron(1.8);
		shapes1[4] = new Tetrahedron(1.5);
		
		shapes2[0] = new Icosahedron(5.9);
		shapes2[1] = new Octahedron(2.4);
		shapes2[2] = new Octahedron(3.7);
		shapes2[3] = new Tetrahedron(3.7);
		shapes2[4] = new Hexahedron(2.2);
		
		shapes3[0] = new Dodecahedron(1.5);
		shapes3[1] = new Hexahedron(3.1);
		shapes3[2] = new Icosahedron(1.7);
		shapes3[3] = new Dodecahedron(1.1);
		shapes3[4] = new Icosahedron(1.8);
		
		Researcher researcher = new Researcher();
		
		researcher.maxVolume(shapes1);
		
		researcher.minArea(shapes2);
		
		researcher.maxRatio(shapes1);
		researcher.maxRatio(shapes2);
		researcher.maxRatio(shapes3);
	}
}
