class Overload{
    public Overload(String Line){
        System.out.println("Heading line from the constructor: "+Line);
    }
    public int sum(int num1,int num2){
        return num1 + num2;
    }
    public int sum(char first,char second ,char third){
        int total = first+second+third;
        return total;
    }
    public static void main(String[] args) {
        Overload overload = new Overload("Thaakirah Davids");
        System.out.println("The sum of the two integers supplied is: "+overload.sum(30,5));
        System.out.println("The sum of the three integers supplied is: "+overload.sum('D','c','d'));
    }
}