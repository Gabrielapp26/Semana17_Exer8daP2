public class TestaFigura {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo();

        retangulo.setBase(5);
        retangulo.setAltura(8);

        System.out.println(retangulo.getNomeFigura());
        System.out.println("Area do retângulo: "+retangulo.getArea());
        System.out.println("Perímetro do retângulo: "+retangulo.getPerimetro());
    }
    
}
