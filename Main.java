public class Main {
static int addition(int a, int b) {
return a + b;
}
static int soustraction(int a, int b){
return a - b; // meme si b est > a ca passe mais le result sera negatif et cest bien possible en math.
}
static int multiplication(int a, int b){
return a * b;
}
public static void main(String[] args) {
System.out.println("2 + 3 = " + addition(2, 3));
System.out.println("4 - 3 = " + soustraction(4, 3));
Syste.out.println("6 * 6 = ")+ multiplication(6,6);
}
}
