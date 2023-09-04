package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {

    private List<Student> group;
    private Integer idGroup;
    private String NameStudentGroup;
    private int razmer;

    private static int count = 1;

    /*
    Конструктор
    group список студентов
    idGroup  идентификатор группы
    NameStudentGroup  - генерируется наименование группы
    razmer - количество студентов в группе
     */
    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
        this.NameStudentGroup = "Группа номер " + count;
        this.razmer = group.size();
        count++;
    }
public List<Student> getStudentGroup(){
        return group;
}


    /*
    Метод получения количества студентов в группе (длинну списка)
     */
    public int getLength() {
        return group.size();
    }

    /*
    Метод вычленения объекта Student из группы
     */
    public Student getStudent(int idStudent) { // метод достает из группы одельного студента
        return group.get(idStudent);
    }
    /*
    Метод получения группы студентов
     */
    public List<Student> getGroup() {
        return group;
    }
    /*
    сеттер для группы
     */
    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }


    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    /*
    Переопределение метода ToString класса StudentGroup
    (выводить идентификатор группы, количество студентов и список студентов)
     */
    @Override
    public String toString() {
        return "id Группы =  " + idGroup + " Количество студентов = " + this.razmer + " Состав группы :  " + group;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    @Override
    public int compareTo(StudentGroup g) {
        if (this.razmer == g.razmer) {
            return 0;
        } else if (this.razmer < g.razmer) {
            return -1;
        } else {
            return 1;
        }
    }
}
