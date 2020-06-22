public class Multiple {

    public static void main(String[] args) {

        Multiple multiple = new Multiple();
        int result = multiple.set(1000);
        System.out.println(result);
    }

    public int set(int limit) {

        int sum = 0;

        for(int i = 1; i < limit; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
