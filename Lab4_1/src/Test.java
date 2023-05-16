
public class Test {
	public static void main(String[] args) {
		BenhVien bv1 = new BenhVien("Da Khoa HN", "Ha Noi", "Nguyen Van A");
		BenhNhan bn1 = new BenhNhan("Pham Van B", 200, '♂',"Benh Bat Tu", "Giai doan cuoi", bv1);
		
		
		System.out.println(bn1.toString());
		
	}
}