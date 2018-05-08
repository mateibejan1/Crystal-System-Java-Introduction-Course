package ro.crystal.demo;

public class InnerClassesMain {
	private static final int VALUE = 10;

	private interface Callback {
		String sayHello();
	}

	private static class InnerClass {
		private static final int INNER_VALUE = 12;

		public int getSum() {
			return INNER_VALUE + VALUE;
		}
	}

	public static void main(String[] args) {
		final InnerClassesMain mainObject = new InnerClassesMain();
		//System.out.println(new InnerClassesMain.InnerClass().getSum());
		final Callback object = new Callback(){

			public String sayHello() {
				//System.out.println("Inside Inner interface");
				return "Hello";
			}
			
		};
		System.out.println(object.sayHello());

	}

}
