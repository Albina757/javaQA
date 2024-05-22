package de.telran.lesson_11;
import java.util.Stack;
public class WarehouseStack {


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        // Вы работаете на складе, который продает один вид продукции, не имеющий сроков хранения, например кирпич.
        //У вас всего одни двери на складе, через которые вы загружаете новый товар и отгружаете заказчикам тоже через эту же дверь.
        //Как бы вы построили рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
        //Напишите программу, которая бы имитировала работу.

        stack.push(6000);
        stack.push(16);
        stack.push(8900);
        stack.push(500);
        stack.push(3000);//dobavili kirpichi

        System.out.println("Первый на выход = "+stack.peek());
        System.out.println(stack);

        System.out.println("Добавляем add - "+stack.add(1200));
        System.out.println(stack);

        System.out.println("Первый на выход = "+stack.peek());
        System.out.println(stack);



    }
}
