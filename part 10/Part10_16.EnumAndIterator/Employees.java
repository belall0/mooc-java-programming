
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author belal
 */
public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(p -> employees.add(p));
    }

    public void print() {
        Iterator<Person> it = employees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void fire(Education education) {
        Iterator<Person> it = employees.iterator();
        while (it.hasNext()) {
            if (it.next().getEducation().equals(education)) {
                it.remove();
            }
        }

    }

    public void print(Education education) {

        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next(); // important for printing can't used iterator.next() to print obj needs to be a var

            if (nextPerson.getEducation() == education) {
                System.out.println(nextPerson);

            }
        }

    }
}
