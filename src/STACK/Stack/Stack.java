package STACK.Stack;


// Написать структуру данных "стек". Стек(stack) -
// способ хранения объектов по правилу LIFO (last in first out),
// то есть кто последний зашел, тот первый вышел. Это как стопка бумаг на столе :)
//В нашем случае, мы в стеке будем хранить объекты - экземпляры класса Object.
//Для реализации стека, создай класс Stack. В основе стека будет массив данных -
// именно там мы будем хранить элементы. Также для стека характерен его размер -
// сколько эл-тов сейчас есть в стеке.
//Что касается функциональности - у нас должна быть возможность достать эл-т из стека (pop),
// положить объект в стек (push) и проверить не пустой ли стек (isEmpty).
// Ну и конечно для создания стека должен быть конструктор
// Плюс, нам нужно переопределить toString(), чтобы он в понятном для нас виде выводил инфу о стеке.


import java.util.Arrays;

public class Stack {
    static int i = 0;
    Object[] objArray = new Object[3];
    boolean empty = true;

//    public Stack (){
//        Object[] objArray = ;
//    }

    void push () {
        Object newObject = new Object();
        System.out.println("1создали newObject");
        if (i < objArray.length) {
            System.out.println("2проверили условие i < array.lenhgt");
            objArray[i] = newObject;
            System.out.println("Object Added to Array, number of Objects in Array: " + (i+1));
        } else {
            Object[] objNewArray = new Object[objArray.length + 1];
            for (int a = 0; a < objArray.length; a++) {
                objNewArray[a] = objArray[a];
            }
            objNewArray[i] = newObject;
            objArray = objNewArray;
            System.out.println("Array is Full, Object added, number of Objects in Array " + (i+1));
        }

        {   i++;
            empty = false;
        }
    }

    void pop () {
        if (!empty && i>1) {
            objArray[i - 1] = null;
            i--;
            System.out.println("Object Deleted from Array, Array has elements: " + (i));
        } else if (!empty) {
            objArray[0] = null;
            System.out.println("Object deleted, Array is empty now");
            empty = true;
        } else {
            empty = true;
            System.out.println("Array empty");
        }
    }

    boolean isEmpty () {
        if (empty) {
            System.out.println("method isEmpty: Array empty");
            return true;}
    else
        System.out.println("method isEmpty: Array not empty");
        return false;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "objArray=" + Arrays.toString(objArray) +
                ", empty=" + empty +
                '}';
    }

    public static void main(String[] args) {
        Stack st1 = new Stack();
        System.out.println( st1.toString());
        st1.isEmpty();
        st1.push();
        st1.push();
        st1.push();
        st1.push();
        st1.push();
        st1.isEmpty();
        System.out.println( st1.toString());


        st1.pop();
        st1.pop();
        st1.pop();
        st1.pop();
        st1.pop();
        st1.pop();
        st1.pop();
        System.out.println( st1.toString());

        st1.isEmpty();
//        st1.isEmpty();

    }

//    public void toString () {
//
//    }

}

