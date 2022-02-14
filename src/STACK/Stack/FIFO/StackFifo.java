package STACK.Stack.FIFO;

import java.util.Arrays;

public class StackFifo {

    static int i = 0;
    Object[] objArray = new Object[3];
    boolean ArrayIsEmpty = true;

    void push() {
        Object newObject = new Object();
        if (i < objArray.length) {
            objArray[i] = newObject;
            System.out.println("Object Added to Array, number of Objects in Array: " + (i + 1));
        } else {
            Object[] objNewArray = new Object[objArray.length + 1];
            for (int a = 0; a < objArray.length; a++) {
                objNewArray[a] = objArray[a];
            }
            objNewArray[i] = newObject;
            objArray = objNewArray;
            System.out.println("Array is Full, Object added, number of Objects in Array " + (i + 1));
        }

        {
            i++;
            ArrayIsEmpty = false;
        }
    }

    void pop() {
        if (!ArrayIsEmpty && i > 1) {
            for (int a = 1; a < objArray.length; a++) {
                objArray[a - 1] = objArray[a];
            }
            i--;
            objArray[i] = null;
            System.out.println("Object Deleted from Array, Array has elements: " + (i));

        } else if (!ArrayIsEmpty) {
            objArray[0] = null;
            System.out.println("Object deleted, Array is empty now");
            ArrayIsEmpty = true;
            i = 0;

        } else {
            ArrayIsEmpty = true;
            System.out.println("Array empty");
        }
    }

    boolean isArrayIsEmpty() {
        if (ArrayIsEmpty) {
            System.out.println("method isEmpty: Array empty");
            return true;
        } else
            System.out.println("method isEmpty: Array not empty");
        return false;
    }

    @Override
    public String toString() {
        return "Stack {" +
                "Objects in Array: " + Arrays.toString(objArray) +
                ", Array is empty: " + ArrayIsEmpty +
                '}';
    }
}

    class Object {
        static int id;
        int myId;

        public Object() {
            this.myId = id;
            id++;
        }

        @Override
        public String toString() {
            return "id: " + myId;
        }
    }