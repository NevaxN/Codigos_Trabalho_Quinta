import java.util.concurrent.ConcurrentHashMap;

public class ExemploMap {
    private final ConcurrentHashMap<String, Integer> mapa = new ConcurrentHashMap<>();

    public void adicionar(String chave, int valor) {
        mapa.put(chave, valor);
    }

    public int pegar(String chave) {
        return mapa.getOrDefault(chave, 0);
    }

    public static void main(String[] args) {
        ExemploMap exemplo = new ExemploMap();

        exemplo.adicionar("A", 10);
        exemplo.adicionar("B", 20);

        System.out.println("Valor de A: " + exemplo.pegar("A"));
        System.out.println("Valor de B: " + exemplo.pegar("B"));
        System.out.println("Valor de C: " + exemplo.pegar("C"));
    }
}
