package strings;

public class StringBuilder {

  public static void main(String[] args) {

    var nome = "Diego";

    final var builder = new java.lang.StringBuilder(nome);
    //add strings à original
    System.out.println(builder.append("Marcos"));

    //colocar a string de trás p frente
    final var reverse = builder.reverse();

    System.out.println(reverse);

    //inserir em posições específicas da string
    final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
    System.out.println(insert);

  }

}
