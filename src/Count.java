public class Count {
    private double a;
    private double b;//两个运算数
    private String operator;

    public Count(double a, String operator){
        this.a = a;
        this.operator = operator;
    }
    public Count(double a, double b, String operator){
        this.a = a;
        this.b = b;
        this.operator = operator;
    }
    public double calculater(){
        switch (operator){
            case "+":
                return a + b;
               // break;
            case "-":
                return a - b;
               // break;
            case "*":
                return a * b;
               // break;
            case "/":
                return  b != 0 ? a / b : -1;
               // break;
            case "%":
                return a % b;
              //  break;
            case "sq":
                return a != 0 ? Math.sqrt(a) : -1;
              //  break;
            case "1/x":
                return a != 0 ? 1 / a : -1;
              //  break;
            default:
                return -1;
              //  break;

        }
    }
}
