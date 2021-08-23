package Calculate;

public class Actions {

    public double whatToDo(double chislo1, String whatis, double chislo2) throws Exception{
//        switch (whatis){
//            case ("делить") :
//                return chislo1 / chislo2;
//                break;
//            case ("умножить") :
//                return chislo1 * chislo2;
//                break;
//            case ("плюс") :
//                return chislo1 + chislo2;
//                break;
//            case ("минус") :
//                return chislo1 - chislo2;
//                break;
//            default:throw new RuntimeException("Непонятно что нужно сделать ... попробуй еще раз ввести: делить,умножить,плюс,минус");
//        }
        if (Double.isNaN(chislo1)||Double.isNaN(chislo2)) {
            throw new RuntimeException("NAN-в ячейку памяти попало не удовлетворяющее условиям число");
        } else if (Double.isInfinite(chislo1)||Double.isInfinite(chislo2)) {
            throw new RuntimeException("INFINITE-возможные проблемы:деление на ноль,либо слишком большое число, у нас калькулятор маленький, он не умеет столько считать");
        }
        else {
            if (whatis.equals("делить")) {
                if (chislo2!=0)
                return chislo1 / chislo2;
                else
                    throw new RuntimeException("Хулиган! на 0 делить нельзя!");
            } else if (whatis.equals("умножить")) {
                return chislo1 * chislo2;
            } else if (whatis.equals("плюс")) {
                return chislo1 + chislo2;
            } else if (whatis.equals("минус")) {
                return chislo1 - chislo2;
            } else {
                throw new RuntimeException("Непонятно что нужно сделать ... попробуй еще раз ввести: делить,умножить,плюс,минус");
            }
        }
    }
}
