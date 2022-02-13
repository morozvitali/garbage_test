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


public class Stack {
    static int i = 0;
    static Object[] objArray;

    public Stack (int stackObjectNumber){
        Object[] objArray = new Object[stackObjectNumber];
    }

    static void push (Object obj) {
        if (i < objArray.length) {
            objArray[i] = obj;
            System.out.println("Object Added to Array, number in Array: " + i);
        } else {
            Object[] objNewArray = new Object[objArray.length + 1];
            for (int a = 0; a < objArray.length; a++) {
                objNewArray[a] = objArray[a];
            }
            objNewArray[i] = obj;
            objArray = objNewArray;
            System.out.println("Array is Full, Object added, number in Array " + i);
        }
        i++;
    }

    static void pop () {
        if (i > 0) {
            objArray[i - 1] = null;
            i--;
            System.out.println("Object Deleted from Array, Array has elements: " + i);
        } else if (i == 0) {
            objArray[0] = null;
            System.out.println("Object deleted from Array, Array is empty");
        } else {
            System.out.println("Array is empty, cannot delete Object");
        }
    }

    static boolean isEmpty () {
        if (i<0) {
            System.out.println("method isEmpty: Array empty");
            return true;}
    else
        System.out.println("method isEmpty: Array not empty");
        return false;
    }
}


class Test {
    public static void main(String[] args) {

    }
}