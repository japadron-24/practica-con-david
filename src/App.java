import com.jose.*;
public class App {

    // este es el main de la clase App
    public static void main(String[] args) throws Exception {
        ClasePrueba clasePrueba = new ClasePrueba();
        clasePrueba.add();
        clasePrueba.add();
        clasePrueba.add();
        clasePrueba.add();
        clasePrueba.add();
        System.out.println(clasePrueba);
        System.out.println(clasePrueba.lista);
    }
}
