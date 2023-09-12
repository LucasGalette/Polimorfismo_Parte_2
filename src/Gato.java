public class Gato extends Animal{
    public Gato(){
        this.nome = "Garfield";
        this.numeroPatas = 4;
    }

    @Override
    public void som() {
        System.out.println("MIAAAAAAAAAU");
    }
}
