package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
        Student s1 = new Student("John", 23, 500);
        Student s2 = new Student("Bob", 26, 545);
        Student s3 = new Student("William", 15, 400);
        Student s4 = new Student("Kevin", 29, 489);
        Student s5 = new Student("Johnson", 30, 578);
        Student s6 = new Student("Catherine", 25, 490);

        //create HashSet object and add all the students object inside it
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);
        studentSet.add(s6);

        //return the HashSet object


        return studentSet;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet) {
        //Create a TreeSet object
        Set<String> studentTreeSet = new TreeSet<>();

        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext()) {
            Student element = iterator.next();
            String name = element.getName();
            studentTreeSet.add(name);
        }

        //get all the name and add it inside the TreeSet object

        //return the TreeSet object;
        return studentTreeSet;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet) {
        //create a HashMap object of type <String,Integer>
        Map<String, Integer> studentHashMap = new HashMap<>();

        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();

        //retrieve the Student object from the iterator
        while (iterator.hasNext()) {
            Student element = iterator.next();
            studentHashMap.put(element.getName(), element.getTotalMarks() / studentSet.size());
        }

        //Use getter method to get TotalMarks of each student. calculate the average

        //add the student name and average marks in the HashMap object created in the
        //first line and return the map

        return studentHashMap;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}
