import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // création de hasmap pour stocker les employés et leurs ages
        HashMap<String, Integer> ages = new HashMap<String, Integer>();

        ages.put("momo", 22);
        ages.put("jojo", 30);
        ages.put("maria", 35);
        ages.put("sophie", 31);
        ages.put("mamadou", 41);
        ages.put("hanriette", 29);

        System.out.println("Liste initiale des employés : " + ages);

        System.out.println("Entrez la limite d'age : ");
        int ageLimit = sc.nextInt();

        // transforme la liste des clés (name) en tableau et supp les employés trop jeunes
        String [] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);

        for (String emp : nameArr) {
            if (ages.get(emp) < ageLimit) {
                System.out.println("X " + emp + " (" + ages.get(emp) + " ans) supprimé car plus jeune que " + ageLimit);
                ages.remove(emp);
            }
        }

        System.out.println("\nListe des employés restants : " + ages);
  
    }
}
