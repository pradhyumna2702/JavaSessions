package OOPConceptPart3;

public class Test extends Shape{

	public static void main(String[] args) {

		Shape s=new Test();
		s.drawing();
		s.fill();
		
	}

	@Override
	void drawing() {
		System.out.println("Drawing method");
	}

}
