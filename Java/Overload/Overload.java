class Overload{
    public Overload(final String Line) {
        System.out.println("Heading line from the constructor: " + Line);
    }

    public int sum(final int num1, final int num2) {
        return num1 + num2;
    }

    public int sum(final char first, final char second, final char third) {
        final int total = first + second + third;
        return total;
    }

    public static void main(final String[] args) {
        final var overload = new Overload("Thaakirah Davids");
        System.out.println("The sum of the two integers supplied is: "+overload.sum(30,5));
        System.out.println("The sum of the three integers supplied is: "+overload.sum('D','c','d'));
    }
}