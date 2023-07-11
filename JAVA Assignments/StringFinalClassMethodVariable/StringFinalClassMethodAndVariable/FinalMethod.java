package StringFinalClassMethodAndVariable;

    public class FinalMethod {
        final void getFinalMethod(){
            System.out.println("This is final method 1");
        }
    }
    public class FinalMethod2 extends StringFinalClassMethodAndVariable.FinalMethod {
        @Override
        final void getFinalMethod(){

            System.out.println("This is final method 1");
        }

        public static void main(String[] args) {
            FinalMethod2 finalMethod2 = new FinalMethod2();
            finalMethod2.getFinalMethod();
        }
    }


