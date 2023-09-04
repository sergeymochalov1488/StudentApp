import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;

public class App {
    public static <studentGroupList> void main(String[] args) throws Exception {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 24);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 28);
        Student s6 = new Student("Лена", 30);
        Student s61 = new Student("БУЛАТ", 32);


        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        listStud.add(s61);

        // создали группу 1
        StudentGroup group1 = new StudentGroup(listStud, 1);
        System.out.println(group1);

        // создаем новую группу , создаем объекты класса Student
        Student s7 = new Student("Алсу", 25);
        Student s8 = new Student("Ильсия", 23);
        Student s9 = new Student("Юля", 24);
        Student s10 = new Student("Ринат", 23);
        Student s11 = new Student("Артем", 28);
        //Student s12 = new Student("Илон", 51);
        // создаем новый список из студентов
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        //listStud2.add(s12);
        // создали группу 2 передав список студенов и id группы в конструктор
        StudentGroup group2 = new StudentGroup(listStud2, 2);

        // создаем новую группу , создаем объекты класса Student
        Student s13 = new Student("Тимур ", 25);
        Student s14 = new Student("Марсель ", 28);
        Student s15 = new Student("Саша", 30);
        Student s16 = new Student("Слава", 51);
        Student s17 = new Student("Рубин", 25);
        Student s18 = new Student("Иван", 26);
        // создаем новый список из студентов
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s13);
        listStud3.add(s14);
        listStud3.add(s15);
        listStud3.add(s16);
        listStud3.add(s17);
        listStud3.add(s18);
        // создали группу 2 передав список студенов и id группы в конструктор
        StudentGroup group3 = new StudentGroup(listStud3, 3);

        List<StudentGroup> studentGroupList = new ArrayList<StudentGroup>(); // создали список из объектов группа

        studentGroupList.add(group1);
        studentGroupList.add(group2);
        studentGroupList.add(group3);


        StudentSteam steam1 = new StudentSteam(studentGroupList, 1); // создали объект поток студентов steam1

        steam1.print(steam1);
        Collections.sort(steam1.getListGoup());
        System.out.println("---------------------------------------------СОРТИРОВКА-----------------------------------------------");
        steam1.print(steam1);
        System.out.println(steam1);// вывод потока в консоль (переопределеный метод toString)

    }
}






