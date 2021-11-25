public class Retangulo implements FiguraGeometrica{

    private int base;
    private int altura;
    
  public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int getArea() {
        // TODO Auto-generated method stub
        int area;
        area=base*altura;
        return area;
    }
  @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Retângulo";
    }
    @Override
    public int getPerimetro() {
        // TODO Auto-generated method stub
        int perimetro;
        perimetro=(base+altura)*2;
        return perimetro;
    }
}
