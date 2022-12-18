
public class Main {
    public static void main(String[] args) {
        Potato miPotato = new Potato();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        System.out.println(miPotato.brazos);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Potato {
    public int brazos = 4;

    public void QuitarBrazo() {
        this.brazos--;
    }
}

