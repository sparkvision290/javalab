class Finally {
    public static void main(String args[]) {
        try {
            int a = 4 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("will get executed");
        }
    }
}
