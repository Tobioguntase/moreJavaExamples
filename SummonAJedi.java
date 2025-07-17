import java.util.Scanner;

public class SummonAJedi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        String name; 
        int action;

        System.out.println("Which Jedi would you like to summon?"); 
        System.out.println("Choose from the followng: ");
        System.out.println("Luke");
        System.out.println("Rey");
        System.out.println("Anikan");
        name = s.nextLine(); 
        Jedi jedi = JediSummoner.summonJedi(name); 

        System.out.println("" + name + " has arrived!" );
        System.out.println("press 1 to greet or 2 to ask for help: ");
        action = s.nextInt(); 

        switch (action) {
            case 1:
                jedi.greeting();
            
            case 2: 
                jedi.protectSummoner(); 
                
            default:
                break;
        }
        s.close();
    }
}

