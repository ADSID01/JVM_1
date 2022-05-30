public class JvmComprehension { //ClassLoader грузит класс в метаспейс

    public static void main(String[] args) { //создается фрейм в stack mamory
        int i = 1;                      // 1 в фрейме создается переменная
        Object o = new Object();        // 2 создается объект в куче и передается ссылка на него переменной о в фрейм в стеке
        Integer ii = 2;                 // 3 в фрейме создается переменная
        printAll(o, i, ii);             // 4 создается еще один фрейм в который передаются ссылки на переменные o,i,ii
        System.out.println("finished"); // 7 создается фрейм и получает ссылку на строку из кучи
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 создается переменная в фрейме метода
        System.out.println(o.toString() + i + ii);  // 6 создается фрейм, куда передается ссылка на объект стринг (o.toString()) и переменные
    }
}