
public class Main {

    public static void main(String[] args) {
      /*  var box = 7;
         System.out.println(box + 1);
         box += 3;
         System.out.println(box);
         box -= 4;
         System.out.println(box);
         box /= 2;
         System.out.println(box);
         box *= 5;
         System.out.println(box); * */

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println(capacityLeft + " kg of space will remain");

        var applesWeight = 3;
        var orangeWeight = 5;
        var fruitWeight = applesWeight + orangeWeight;
        System.out.println("Total fruits weight: " + fruitWeight + " kg");

        int tomatoesWeight = 1, potatoesWeight = 2, cucumberWeight = 3, zucchiniWeight = 4;
        int vegetablesWeight = tomatoesWeight + potatoesWeight + cucumberWeight + zucchiniWeight;
        System.out.println("Total vegetables weight: " + vegetablesWeight + " kg");

        int productsWeight = fruitWeight + vegetablesWeight;
        System.out.println("Total products weight: " + vegetablesWeight + fruitWeight + " kg");

        // вычисляем сколько места останется под продукты
        int leftWeight = capacityLeft - productsWeight;
        System.out.println("After loading the products, there will be place for: " + leftWeight + " kg of products");

        // присоединение гостей увеличило кол-во продуктов в 2 раза
        productsWeight *= 2;
        System.out.println("Total products weight after adding guests " + productsWeight);

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Left space for: " + leftWeight + " kg");

        // используем остаток от деления
        int overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("The overload is: " + overload + " kg");

        // разделим кол-во товара на 2 машины
        int productsInOneCar = productsWeight / 2;
        System.out.println(productsInOneCar + " kg products per one car");

        // primitive data type

        byte banana = 100;
        System.out.println("Bananas: " + banana + " kg");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("One portion of sugar is: " + onePortion + " g");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);

        float g = a + 1f;
        System.out.println(g);
    }
}
