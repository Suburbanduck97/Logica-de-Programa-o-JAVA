import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> commandList = new ArrayList<>();
        Map<String, String> binaryCommand = new HashMap<>();

        // Adicionando comandos
        binaryCommand.put("00000", "direita ");
        binaryCommand.put("00001", "esquerda");
        binaryCommand.put("10010", "cima");
        binaryCommand.put("01001", "baixo");
        binaryCommand.put("11111", "sair");

        String response;
        while (true) {
            menu();
            System.out.print("Digite um comando binário: ");
            String command = sc.nextLine();

            if (command.equals("11111")) {
                response = binaryCommand.get(command);
                
                commandList.add(response);

                System.out.println("Lista de comandos:");
                System.out.println(commandList);
                break;
            }

            if (binaryCommand.containsKey(command)){
                response = binaryCommand.get(command);
                commandList.add(response);
            } else {
                System.out.println("Este comando não existe!");
                continue;
            }

            System.out.println();
            System.out.println("\nLista de comandos:");
            System.out.println(commandList);
            System.out.println();
        }

        sc.close();
    }

    public static void menu(){
        System.out.println("\n=== MENU ====");
        System.out.println("comandos binários: [00000/ 00001/ 10010/ 01001/ 11111]");
    }
}
