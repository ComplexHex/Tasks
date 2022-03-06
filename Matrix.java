public class Matrix {
    private int any[] = new int[10];
    private String any1[] = new String[5];
    private Object any2[] = new Object[5];

    public void print(){
        System.out.print(any[6]);
        System.out.print(any1[4]);
        System.out.print(any2[2]);

    }

    public static void main(String[] args) {

        Matrix matrix = new Matrix();
        matrix.print();
    }
}

