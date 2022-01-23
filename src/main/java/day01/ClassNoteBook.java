package day01;

import java.util.*;

public class ClassNoteBook {
    private List<Student> students = new ArrayList<>();
    private Map<Student, List<Integer>> noteBook = new TreeMap<>();

    public void addStudent(Student student) {
        noteBook.put(student, new ArrayList<>());
    }

    public void addMark(int id, int mark) {
        for(Map.Entry<Student,List<Integer>> nb:noteBook.entrySet()){
            if(nb.getKey().getStudentID()==id){
                nb.getValue().add(mark);
            }
        }
    }

    public Map<Student, List<Integer>> getNoteBook() {
        return noteBook;
    }


}
