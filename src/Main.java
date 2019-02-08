import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Variables
        int userAge = 27;
        long currentTimeInMillisecond = 7832476234234L;
        float studentAverage = 17.92F;
        double anotherStudentAverage = 16.983654D;
        boolean flag = false;

//        JavaComments();

//        studentAverage = JavaOperators(userAge, studentAverage, flag);

//        JavaOutputs(studentAverage);

//        JavaConditions(studentAverage, anotherStudentAverage, flag);

//        JavaLoops();

//        JavaMethods();

//        JavaScanner();

//        JavaTypeCast();

//        JavaSwitch();

//        JavaString();

//        JavaStringBuilder();

//        JavaRegex()

//        JavaArray();

//        JavaCallByRefOrVal();
    }


    private static void JavaCallByRefOrVal() {
        int a = 20;
        method(a);
        System.out.println(a);

        int[] array = {1,1,1};
        method(array);
        System.out.println(array[0]);
    }

    private static void method(int a) {
        a = 10;
    }

    private static void method(int[] array){
        array[0] = 2;
    }

    private static void JavaArray() {
        int[] array = new int[10];
        array[0] = 10;
        array[9] = 20;

        int[] array2 = {0, 1, 2, 9, 76, 200, -10};
        System.out.println(array2[3]);

        int[][] multiArray = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(multiArray[0][1]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void JavaStringBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append("aaaa");
        builder.append(123);
        builder.append(true);
        builder.append("\t");
        builder.reverse();
        String string = builder.toString();
        System.out.println(string);

        System.out.println(new StringBuilder().append("aaaa")
                .append(123)
                .append(true)
                .append("\t")
                .reverse().toString());
    }

    private static void JavaString() {
        String bigText = "Android-iOS-Web-Desktop";
        String[] array = bigText.split("-");
        System.out.println(array[0]);
        System.out.println(array[3]);

        String text = "Android-Workshop";
        String aText = text.replace("Android", "iOS");
        System.out.println(aText);

        System.out.println("\tMa\\hdi\nHasan\"zadeh\n\nSalam");
        System.out.println("سلام");

        String str = null;
        System.out.println(str.length());

    }

    private static void JavaSwitch() {
        int weekDay = 6;

        switch (weekDay) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("T...");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Jome...");
                break;
            default:
                System.out.println("Dadash Eshteb mizani...");

        }
    }

    private static void JavaTypeCast() {
        float f = 4.67F;
        int a = (int) f;
        System.out.println("A = " + a);
    }

    private static void JavaScanner() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input * 2);
    }

    private static void JavaMethods() {
        //Methods
        double result = sum(10.5F, 20.0F);
        System.out.println(result);

        int max = max(10, 20, 30, 50, 67, 3, 0, -1);
        System.out.println(max);

        log();
        log("مهدی حسن زاده");
    }

    private static void JavaLoops() {
        //Loops
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("n = " + i * 2);
        }

        int j = 10;
        while (j > 20) {
            System.out.println("Oooo...");
            j--;
        }

        do {
            System.out.println("Ffff...");
        } while (j > 10);

        for (int i = 0; i < 20; i++) {
            System.out.println("w = " + i);
            if (i == 3) continue;
            System.out.println("To khubi..");
        }

        zahra:
        for (int i = 0; i < 10; i++) {
            mostafa:
            for (int k = 0; k < 10; k++) {
                if (i * k > 6) continue mostafa;
                System.out.print("(" + i + "," + k + ") ");
            }
            System.out.println();
        }
    }

    private static void JavaConditions(float studentAverage, double anotherStudentAverage, boolean flag) {
        //Conditions
        if (studentAverage >= 12) {
            System.out.println("Ahsant...");
        } else {
            System.out.println(":(((");
        }

        if (anotherStudentAverage < 10) {
            System.out.println("Fail");
        } else if (anotherStudentAverage >= 10 && anotherStudentAverage < 14) {
            System.out.println("Come On...");
        } else if (anotherStudentAverage >= 14 && anotherStudentAverage < 18) {
            System.out.println("Offf...");
        } else {
            System.out.println("Offfffffffffffffff....");
        }

        System.out.println(flag ? "Salam" : "Bye");
    }

    private static void JavaOutputs(float studentAverage) {
        //Outputs
        System.out.print("Mahdi\n");
        System.out.println("HS");

        boolean b = studentAverage > 100;
        System.out.println(b);
    }

    private static float JavaOperators(int userAge, float studentAverage, boolean flag) {
        //Operators
        System.out.println(userAge % 3); // Mathematical
        System.out.println((flag && true) || true); //Precedence
        System.out.println(!(!flag)); //Logical
        studentAverage %= 2; //Combinatorial
        studentAverage = studentAverage + 2;
        return studentAverage;
    }

    private static void JavaComments() {
        // Comments
        // Mahdi Hasanzadeh

        /*
            Soroush Messenger
            Android Workshop
         */
    }

    public static void log() {
        System.out.println("salam");
    }

    public static void log(String text) {
        System.out.println(text);
    }

    public static int max(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) max = number;
        }
        return max;
    }

    public static double sum(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }
}
