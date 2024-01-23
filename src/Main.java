import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("recept.txt");
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Рецепт для шаурмы");
        System.out.println("Укажите кол-во грамм куринного филе");
        int filekurinnoe = scanner.nextInt();
        System.out.println("Укажите кол-во грамм капусты белокочанной");
        int kapusta = scanner.nextInt();
        System.out.println("Укажите кол-во огурцов консерированных");
        int cucumber = scanner.nextInt();
        System.out.println("Укажите кол-во помидоров");
        int potato = scanner.nextInt();
        System.out.println("Укажите кол-во столовых ложек кетчупа");
        int ketchup = scanner.nextInt();
        System.out.println("Укажите кол-во столовых ложек майонеза");
        int mayonez = scanner.nextInt();
        System.out.println("Укажите кол-во щепоток соли");
        int salt = scanner.nextInt();
        System.out.println("Укажите кол-во щепоток черного молотого перца");
        int pepper = scanner.nextInt();
        System.out.println("Напишите пошаговую инструцию для приготовления шаурмы");
        scanner.nextLine();
        var recept = scanner.nextLine();
        pw.println("Рецепт классической шаурмы:\n1. Куриное филе: "+filekurinnoe+" грамм\n2. Капуста белокочанная: "+kapusta+" грамм\n3. Огурцы консервированные: "+cucumber+" штук\n4. Помидоры: "+potato+" штук\n5. Кетчуп: "+ketchup+" ст. ложек\n6. Майонез: "+mayonez+" ст. ложек\n7. Соль: "+salt+" щепоток\n8. Черный перец: "+pepper+" щепоток.");
        pw.println("Инструкция по приготовлению классической шаурмы: "+recept);
        pw.close();
        Scanner scanner2 = new Scanner(new File("recept.txt"));
        while (scanner2.hasNextLine()) {
            System.out.println(scanner2.nextLine());
        }
        scanner2.close();
    }
}