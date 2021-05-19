import java.util.Scanner;
public class Controller {
    public Note[] notes = new Note[3];
    public int size = 0;
    Controller(){
        int choice = 0;
        Scanner note = new Scanner(System.in);
        while (choice != 4) {
            Menu a = new Menu();
            a.display();
            choice = note.nextInt();
            if (choice == 1) {
                if (size < 3) {
                    System.out.println("Enter the note name: ");
                    Scanner name_s = new Scanner(System.in);
                    String name = name_s.nextLine();
                    System.out.println("Type your note: ");
                    Scanner data_s = new Scanner(System.in);
                    String data = data_s.nextLine();
                    java.util.Date date = new java.util.Date();
                    Note example = new Note(name, data, date);
                    notes[size] = example;
                    size++;
                } else {
                    System.out.println("You are at capacity");
                }
            } else if (choice == 2) {
                System.out.println("Enter the note number: ");
                Scanner input_s = new Scanner(System.in);
                int input = input_s.nextInt();
                System.out.print("The note says: ");
                System.out.println(notes[input-1].data);

            } else if (choice == 3) {
                System.out.println("~~~ Note Summary ~~");
                System.out.print(notes[0].date);
                System.out.print(" :");
                System.out.println(notes[0].name);
                System.out.print(notes[1].date);
                System.out.print(" :");
                System.out.println(notes[1].name);
                System.out.print(notes[2].date);
                System.out.print(" :");
                System.out.println(notes[2].name);


            }
        }
        System.out.println("Exiting...");
    }
}
