
public class MethodCallingPractice {
	public static void methodA(String s) {
		System.out.printf("Method A called with %s%n", s);
		}
	public static String methodB() {
		System.out.println("Method B called");
			return "Success";
		}
	public static void methodC(int x, int y) {
		System.out.printf("Method C called with %d, %d%n", x, y);
		}
	public static int methodD(String s, double y) {
		System.out.printf("Method D called with %s, %f%n", s, y);
			return 0;
		}
	public static double methodE() {
		System.out.println("Method E called");
			return 0.0;
		}
	public static void methodF() {
		System.out.println("Method F called");
		}
	public static void methodG(int i, double x, String s) {
		System.out.printf("Method G called with %d, %f, %s%n", i, x, s);
		}
	public static void main(String[] args) {
				
			MethodCallingPractice.methodA("HI");
			MethodCallingPractice.methodB();
			MethodCallingPractice.methodC(1, 2);
			MethodCallingPractice.methodD("Hello",0);
			MethodCallingPractice.methodE();
			MethodCallingPractice.methodF();
			MethodCallingPractice.methodG(4, 4.5, "Method G");
				
				
		}
				
			
}
