package day01;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ClassNoteBookTest {
    @Test
    void testAddStudent(){
        ClassNoteBook classNoteBook=new ClassNoteBook();
        Student s= new Student("Márk",1);
        classNoteBook.addStudent(s);

        assertTrue(classNoteBook.getNoteBook().keySet().contains(s));
        assertEquals(0,classNoteBook.getNoteBook().get(s).size());
    }
    @Test
    void testAddStudentInOrder() {
        ClassNoteBook classNoteBook = new ClassNoteBook();
        Student s = new Student("Márk", 1);
        Student s2 = new Student("Zsolt", 3);
        Student s3 = new Student("Abigél", 2);
        classNoteBook.addStudent(s);
        classNoteBook.addStudent(s2);
        classNoteBook.addStudent(s3);

        int i = 1;
        for (Map.Entry<Student, List<Integer>> nb : classNoteBook.getNoteBook().entrySet()) {
            if (nb.getKey().getStudentID() == i) {
                assertEquals(i, nb.getKey().getStudentID());
                i++;
            }
        }
    }
    void testAddMark(){
        ClassNoteBook classNoteBook=new ClassNoteBook();
        Student s= new Student("Márk",1);
        Student s2= new Student("Zsolt",3);
        Student s3= new Student("Abigél",2);
        classNoteBook.addStudent(s);
        classNoteBook.addStudent(s2);
        classNoteBook.addStudent(s3);

        classNoteBook.addMark(2,5);
        assertEquals(5,classNoteBook.getNoteBook().get(s3));
        
    }
}