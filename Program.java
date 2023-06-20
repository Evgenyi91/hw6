package hw6;

import java.io.File;

public class Program {
    /**
     * TODO: Çàäà÷à 1. Äîìàøíÿÿ ðàáîòà. Îïòèìèçèðîâàòü ðàáîòó êëàññà Order â  ðàìêàõ ïðèíöèïà SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order("Bruce Wayne", "Porche", 5,500000);
        Saver saver = new Saver();
        Loader loader = new Loader();
        //loader.inputFromConsole(order);
        saver.saveToJson(order);
        saver.saveToXML(order);
        saver.saveToTxt(order);
        Order order1 = new Order();
        loader.loadFromJson(new File("src/hw6/order111.json"), order1);
        System.out.println(order1);
    }
}