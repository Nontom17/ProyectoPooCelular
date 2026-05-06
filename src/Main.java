public class Main {
    public static void main(String[] args) {

        Celular celular1 = new Celular("Xiaomi", "Redmi 10A", "32GB","2GB","4G");


        Celular celular2 = new Celular("Samsung", "S22","256GB","8GB","5G");


        System.out.println("Marca: "+celular1.getMarca());
        System.out.println("Modelo: "+celular1.getModelo());
        System.out.println("Memoria: "+celular1.getMemoria());
        System.out.println("Ram: "+celular1.getRam());
        System.out.println("Conectividad: "+celular1.getConectividad());

        celular1.setModelo("Redmi Note 15");
        System.out.println("\nNuevo Modelo");
        System.out.println(celular1.getModelo());




    }
}