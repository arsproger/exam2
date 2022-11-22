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
            System.out.println("\nГлавное меню:" +
                    "\n1) Добавление студента в группу" +
                    "\n2) Поиск по названию группы и вывод учеников этой группы" +
                    "\n3) Просмотр всех групп и их учеников" +
                    "\n0) Выход с главного меню");
            System.out.print("\nНомер меню: ");
            int number = scanner.nextInt();
            System.out.println();
            if (number == 1) {
                System.out.print("Введите название группы: ");
                String nameGroup = scanner.next();
                System.out.print("Введите имя студента: ");
                String nameStudent = scanner.next();
                Group.addStudent(nameGroup, nameStudent);
            } else if (number == 2) {
                System.out.print("Введите название группы: ");
                String nameGroup = scanner.next();
                Group.searchGroup(nameGroup);
            } else if (number == 3) {
                Group.viewAllGroup();
            }
            else if(number == 0) {
                System.out.println("Вы вышли с главного меню!");
                break;
            }
            else {
                System.out.println("Введите номер с меню!");
            }
        }
    }
}