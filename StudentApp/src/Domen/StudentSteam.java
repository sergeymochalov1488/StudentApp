package Domen;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class StudentSteam implements Iterable <StudentGroup> {
    /*
    класс описывающий поток студентов
    с полем номер потока, содержащий в себе список учебных групп
    объектов класса StudentGroup

     в классе реализован интерфейс Iterable
     и вывести через for несколько групп со списком студентов на кансоль
      */

    private List<StudentGroup> listGoup; // список учебных групп
    private Integer idSteam;

    public StudentSteam(List<StudentGroup> listGroup, Integer idSteam) { // конструктор принимает список групп и id потока
        this.listGoup = listGroup;
        this.idSteam = idSteam;
    }
    /*
    Переопределение метода ToString классова StudentSteam
    (выводить номер потока, количество групп и список студентов с указанием идентификатора группы)
     */
    public String toString (){
        return "Номер потока: " + idSteam + " Количество групп:" + listGoup.size() + listGoup;

    }
    public List<StudentGroup> getListGoup() {
        return listGoup;
    }

    /*
    метод выводит на экран каждую группу входящую в поток студенотов StudentStream
     */
public void print (StudentSteam steam){

    for (StudentGroup group : steam.getListGoup()) {
        System.out.println();
        System.out.println("Группа номер " + group.getIdGroup() +  " Количество студентов в группе " + group.getLength());
        for (int i= 0; i < group.getGroup().size(); i++)
        {
            System.out.println(group.getStudent(i)  ); // выводится согласно методу toString у класса Student
        }
    }
}

    // ниже имплиментированные из интерфейса методы
    @Override
    public Iterator<StudentGroup> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super StudentGroup> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<StudentGroup> spliterator() {
        return Iterable.super.spliterator();
    }
}



