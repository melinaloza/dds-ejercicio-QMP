public class Prenda {

  private TipoPrenda tipo;
  private Material tela;
  private Categoria categoria;
  private Color colorSecundario;
  private Color colorPrincipal;


public Prenda( TipoPrenda tipo, Material tela, Categoria categoria, Color colorPrincipal, Color colorSecundario){ //constructor
  validarPrenda(tipo,tela,categoria,colorPrincipal,colorSecundario);
  this.tipo= tipo;
  this.tela= tela;
  this.categoria= categoria;
  this.colorPrincipal= colorPrincipal;
  this.colorSecundario= colorSecundario;
}

public void validarPrenda( TipoPrenda tipo, Material tela, Categoria categoria, Color colorPrincipal, Color colorSecundario){
  if(tipo == null){
    throw new RuntimeException("No puede ser nulo el tipo de la prenda");
  }
  if(tela == null){
    throw new RuntimeException("No puede ser nulo la tela de la prenda");
  }
  if(categoria == null){
    throw new RuntimeException("No puede ser nulo la categoria de la prenda");
  }
  if(colorPrincipal == null){
    throw new RuntimeException("No puede ser nulo el color principal de la prenda");
  }
}


}
