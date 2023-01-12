package date_0929;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("총 생성된 객체의 수: "+Product.count);
		System.out.println("p1은 "+p1.serial+"번째 생성됨");
		System.out.println("p1은 "+p2.serial+"번째 생성됨");
		System.out.println("p1은 "+p3.serial+"번째 생성됨");
	}

}

