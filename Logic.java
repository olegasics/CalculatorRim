public class Logic {

    public Logic(String[] array) throws Exception {

        switch (array[1]) {
            case "+" :
                Plus plus = new Plus();
                System.out.println(plus.Operation(Integer.parseInt(array[0]), Integer.parseInt(array[2])));
                break;

            case "-" :
                Minus minus = new Minus();
                System.out.printf("Результат : " + "%d", minus.Operation(Integer.parseInt(array[0]), Integer.parseInt(array[2])));
                break;


            case "*" :
                Multi multi = new Multi();
                System.out.printf("Результат : " + "%d", multi.Operation(Integer.parseInt(array[0]), Integer.parseInt(array[2])));
                break;

            case "/" :
                Description description = new Description();
                System.out.printf("Результат : " + "%d", description.Operation(Integer.parseInt(array[0]), Integer.parseInt(array[2])));
                break;

            default: throw new Exception("Введен неверный арифметический оператор");

        }
    }
}
