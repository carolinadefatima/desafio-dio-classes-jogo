public class Jogo {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Gandalf", 1000, "mago");
        Heroi heroi2 = new Heroi("Aragorn", 35, "guerreiro");
        Heroi heroi3 = new Heroi("Lee", 30, "monge");
        Heroi heroi4 = new Heroi("Hanzo", 25, "ninja");

        heroi1.atacar();
        heroi2.atacar();
        heroi3.atacar();
        heroi4.atacar();
    }
}

class Heroi {
    String nome;
    int idade;
    String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo.toLowerCase();
    }

    public void atacar() {
        String ataque = "";

        switch (this.tipo) {
            case "mago":
                ataque = "magia";
                break;
            case "guerreiro":
                ataque = "espada";
                break;
            case "monge":
                ataque = "artes marciais";
                break;
            case "ninja":
                ataque = "shuriken";
                break;
            default:
                ataque = "um ataque genérico";
                break;
        }

        System.out.println("O " + this.tipo + " atacou usando " + ataque);
    }
}
