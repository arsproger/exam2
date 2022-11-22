import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Group group1 = new Group(1, "Java", 5);
        Group group2 = new Group(2,"Python", 3);
        Group group3 = new Group(3, "C#", 7);
//        Student student1 = new Student("Max");
//        Student student2 = new Student("Diana");
//        Student student3 = new Student("Sasha");
//        Student student4 = new Student("Milana");
//        Student student5 = new Student("Dasha");
//        Student student6 = new Student("Alex");

        while (true) {
            System.out.println("\n������� ����:" +
                    "\n1) ���������� �������� � ������" +
                    "\n2) ����� �� �������� ������ � ����� �������� ���� ������" +
                    "\n3) �������� ���� ����� � �� ��������" +
                    "\n0) ����� � �������� ����");
            System.out.print("\n����� ����: ");
            int number = scanner.nextInt();
            System.out.println();
            if (number == 1) {
                System.out.print("������� �������� ������: ");
                String nameGroup = scanner.next();
                System.out.print("������� ��� ��������: ");
                String nameStudent = scanner.next();
                Group.addStudent(nameGroup, nameStudent);
            } else if (number == 2) {
                System.out.print("������� �������� ������: ");
                String nameGroup = scanner.next();
                Group.searchGroup(nameGroup);
            } else if (number == 3) {
                Group.viewAllGroup();
            }
            else if(number == 0) {
                System.out.println("�� ����� � �������� ����!");
                break;
            }
            else {
                System.out.println("������� ����� � ����!");
            }
        }
    }
}