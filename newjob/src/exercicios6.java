import java.util.Locale;
import java.util.Scanner;

public class exercicios6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isHealer = true;
        while (isHealer) {
            System.out.println("Informe a abreviacao da classe: ");
            String clazz = in.nextLine();
            if (clazz.length() == 3) {
                switch (clazz.toUpperCase()) {
                    case "PLD", "WAR", "DKN", "GNB" -> System.out.println("Tank");
                    case "WHM", "SCH", "AST", "SAG" -> System.out.println("Healer");
                    case "MNR", "DRG", "NJA", "SMR", "RPR", "BRD", "MCN", "DNC", "BLM", "SMN", "RDM", "BEM" ->
                            System.out.println("DPS");
                    default -> {
                        System.out.println("Não é uma abreviação valida!");
                        isHealer = false;
                    }
                }

            } else {
                System.out.println("Digite uma classe com três letras");
            }
        }
    }
}
