import java.util.ArrayList;

public class Group {
    private int idGroup;
    private String name;
    private String[] students;
    private static ArrayList<Group> groups = new ArrayList<>();

    public Group(int idGroup, String name, int amountStudent) {
        this.idGroup = idGroup;
        this.name = name;
        this.students = new String[amountStudent];
        groups.add(this);
    }

    public static void addStudent(String nameGroup, String nameStudent) {
        boolean isGroup = false;
        boolean isSeats = false;
        for(Group group : groups) {
            if(group.name.equals(nameGroup)) {
                isGroup = true;
                for (int i = 0; i < group.students.length; i++) {
                    if(group.students[i] != null && group.students[i].equals(nameStudent)) {
                        System.out.println("Студент уже состоит в группе!");
                        return;
                    }
                    else if(group.students[i] == null) {
                        group.students[i] = nameStudent;
                        isSeats = true;
                        break;
                    }
                }
            }
        }
        if(!isGroup) {
            System.out.println("Нет такой группы в списке созданных групп!");
        }
        else if(!isSeats) {
            System.out.println("В группе не осталось мест!");
        }
        else {
            System.out.println("Студент успешно добавлен в группу!");
        }
    }


    public static void searchGroup(String nameGroup) {
        boolean isGroup = false;
        boolean isStudents = false;
        for(Group group : groups) {
            if(group.name.equals(nameGroup)) {
                isGroup = true;
                System.out.print("\nГруппа: " + group.name +
                        "\nСтуденты: ");
                for (int i = 0; i < group.students.length; i++) {
                    if(group.students[i] != null) {
                        isStudents = true;
                        System.out.print(group.students[i] + " | ");
                    }
                }
                System.out.println();
            }
        }
        if(!isGroup) System.out.println("Нет такой группы в списке созданных групп!");
        else if(!isStudents) System.out.println("В группе еще нет студентов, плиз добавьте их!");
    }

    public static void viewAllGroup() {
        for(Group group : groups) {
            System.out.print("\nГруппа: " + group.name +
                    "\nСтуденты: ");
            for (int i = 0; i < group.students.length; i++) {
                if(group.students[i] != null)
                    System.out.print(group.students[i] + " | ");
            }
            System.out.println();
        }
    }


    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
