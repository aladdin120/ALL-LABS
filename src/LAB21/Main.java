package LAB21;


public class Main {

    public static void main(String[] args) {
        Exception1 main = new Exception1();
        //main.exceptionDemo(); //При вызове данного метода выбрасывается исключение, представленное в условии задачи
        main.exceptionDouble();
        Exception2 main2 = new Exception2();

        try { //блок try перехватывает исключение, которое может выбросить метод, который находится внутри него
            main2.exceptionDemo();
        } catch (ArithmeticException e) {//catch в случае возникновения исключения, обрабатывает его и выполняет действия, которые находится внутри него
            System.out.println("Infinity");
        } finally {//блок finally является необязательным элементом и выполняется в любом случае
            System.out.println("End of program");
        }
    }
}
