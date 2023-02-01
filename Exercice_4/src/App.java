import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);     
        System.out.println("entrez la Largeur du rectangle");
        int longeur = scanner.nextInt();
        System.out.println("entrez la Longeur du rectangle");
        int largeur = scanner.nextInt();
        Rectangle rectangle = new Rectangle(largeur,longeur);
        System.out.println(rectangle);
        
    }
}
