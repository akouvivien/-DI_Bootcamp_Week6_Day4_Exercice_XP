public class App {
    public static  int perimetre(int a, int b, int c) {
      return a + b + c ;  
    }

    public static int aire( int b, int c) {

        return (b * c) / 2;

    }
    public static void main(String[] args) throws Exception {
        int a = 3;
        int b = 4;
        int c = 5;
        System.out.println(" le perimetre du triangle est :"+perimetre(a,b,c));
        System.out.println(" soit la hauteur relative 4");
        System.out.println("soit la base = 5");
        System.out.println(" l'aire du triangle est :"+aire(b,c));
  
    }
}
