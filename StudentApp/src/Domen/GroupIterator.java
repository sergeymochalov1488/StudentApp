package Domen;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<StudentGroup>{

        private int counter;
        private final List<StudentGroup> studentGroup;

        public GroupIterator (List<StudentGroup> studentGroup) {
            this.studentGroup = studentGroup;
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return counter<studentGroup.size();
        }
        @Override

        public StudentGroup next() {
            if(!hasNext())
            {
                return null;
            }
            //counter++;
            return studentGroup.get(counter++);
        }

    }















