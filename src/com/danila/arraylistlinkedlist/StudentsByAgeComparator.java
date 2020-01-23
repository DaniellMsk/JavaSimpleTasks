package com.danila.arraylistlinkedlist;

import java.util.Comparator;

public class StudentsByAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getAverageMark(), student2.getAverageMark());
    }
}
