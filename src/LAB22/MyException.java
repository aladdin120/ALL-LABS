package LAB22;

public class MyException extends Throwable{

    private String text;
    MyException() {
        text = "Such student doesn't exist";
    }

    public String getText() {
        return text;
    }
}
