package objectOrientedProgramming;

	class A {
		public A() {
			System.out.println("A'nin yapicisi");
		}
	}

	
	class B extends A{
		public B() {
			super();
			System.out.println("B'nin yapicisidir");
		}

	public static void main(String[] args) {
		
		B nesne = new B();
		
	}

}
