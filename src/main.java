public class main {
    public static void main(String[] args) {
        Perros a = new Perros();

        String nomperro;
        String nomraza;
        String nomgenero;
        String nomcomida;

        a.setNombre("Elsa");
        nomperro = a.getNombre();
        a.setRaza("Husky");
        nomraza = a.getRaza();
        a.setGenero("hembra");
        nomgenero = a.getGenero();
        a.setEdad(5);
        a.setPeso(50.75);
        a.setComida("Croquetas revultas con pollo");
        nomcomida = a.getComida();


        System.out.println("Nombre: " + nomperro);
        System.out.println("Raza: " + nomraza);
        System.out.println("Genero: " + nomgenero);
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Peso: " + a.getPeso());
        System.out.println("¿Que le das de comer normalemnete a tu perro?: " + nomcomida);
        System.out.println("Gua guu");
    }
}