import java.util.ArrayList;
import java.util.Scanner;


public class banco {

String nom, tel, dom;
int balance = 10000;
int age;

static Scanner scan = new Scanner(System.in);

static ArrayList<banco> user = new ArrayList<>();

public banco (String nom, int age, String tel, String dom, int balance) {

    this.nom = nom;
    this.age = age;
    this.tel = tel;
    this.dom = dom;
    this.balance = balance; 

}       //fin constructor


public void adduser() {

    System.out.println ("\nNombre del usurario:\n");
    nom = scan.nextLine();

    System.out.println("\nEdad:\n");
    age = scan.nextInt();
    scan.nextLine();

    System.out.println("\nTelefono:\n");
    tel = scan.nextLine();

    System.out.println("\nDomicilio:\n");
    dom = scan.nextLine();

    balance = 10000;

    banco bank = new banco (nom, age, tel, dom, balance);

    user.add(bank);

}       // fin metodo


public void showuser() {

    System.out.println ("\nUsuarios registrados:\n");
    int count=1;
    for (banco i: user){

        System.out.printf("\n--- Usuario numero #%d ---\nNombre: %s\nEdad: %d\nTelefono: %s\nDomicilio: %s\nBalance: %d\n" ,count++ ,i.nom, i.age, i.tel, i.dom, i.balance);
       
    }       // fin for
    
}       // fin metodo


public void modus() {

    System.out.println("\n¿Que usuario quieres modificar?\n");
    int x = scan.nextInt();
    scan.nextLine();

    banco nuevous = user.get(x-1);

    System.out.println("\nNuevo nombre:\n");
    nuevous.nom = scan.nextLine();

    System.out.println("\nNueva edad:\n");
    nuevous.age = scan.nextInt();
    scan.nextLine();

    System.out.println("\nNuevo telefono:\n");
    nuevous.tel = scan.nextLine();

    System.out.println("\nNuevo domicilio;\n");
    nuevous.dom = scan.nextLine();

}       // fin metodo


public void withdraw () {

    System.out.println("\n¿Que usuario quiere retirar dinero?:\n");
    int x = scan.nextInt();
    scan.nextLine();

    banco retiro = user.get(x-1);

    System.out.println("\n¿Cuanto quieres retirar?\n");
    int money = scan.nextInt();
    scan.nextLine();

    retiro.balance = retiro.balance-money;

    System.out.println("\nNuevo balance: " +retiro.balance + "\n");

}       // fin metodo


public void add() {

    System.out.println("\n¿Que usuario quiere agregar dinero?:\n");
    int x = scan.nextInt();
    scan.nextLine();

    banco agregar = user.get(x-1);

    System.out.println("\n¿Cuanto quieres agregar?\n");
    int money = scan.nextInt();
    scan.nextLine();

    agregar.balance = agregar.balance + money;

    System.out.println("\nNuevo balance: " +agregar.balance + "\n");

}       // fin metodo


public static void main(String[] args) {

    banco app = new banco("", 0, "", "", 0);
    int op;

    do {

        System.out.println("\n1: Agregar usuario \n2: Mostrar usuarios \n3- Modificar usuario \n4-Retirar dinero \n5- Agregar dinero \n6- Salir");

        op = scan.nextInt();
        scan.nextLine();

        switch (op) {

            case 1 -> app.adduser(); 

            case 2 -> app.showuser();

            case 3 -> app.modus(); 

            case 4 -> app.withdraw();

            case 5 -> app.add();

        }       // fin switch

    } while ( op!=6 );    // fin do

}       // fin main

}       // fin clase
