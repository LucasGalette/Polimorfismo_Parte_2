public class Zoo {
    public static void main(String[] args) {
        Vaca Mimosa = new Vaca();
        Gato Garfield = new Gato();
        Carneiro Shawn = new Carneiro();

        Animal bichos [] = {Mimosa, Garfield, Shawn};

        for(Animal animal : bichos){
            System.out.println(animal.nome + " é da classe " + animal.getClass().getName() +
                    ", tem " + animal.numeroPatas + " patas e faz ");
            animal.som();
            System.out.println();
        }


    }
}
