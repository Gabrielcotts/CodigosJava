package DevDojo.Introdução;

//Break é usado para interromper o lop infinito de um código,
// e para que seja otimizado em vez de perder tempo com lops

public class EstruturaBreak {
    static void main() {

        int valorMax = 100;
        for (int i = 0; i <= valorMax; i++) {

            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
