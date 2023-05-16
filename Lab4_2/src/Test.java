
public class Test {
	public static void main(String[] args) {
		
		Truong t1 = new Truong("Xuan Đỉnh", "Hà Nội", "Nguyễn Văn A");
		SinhVien sv1 = new SinhVien("Nguyễn Văn B ", 20, '♂', "DCCTCT66L1", "CNTT", t1);
		
		System.out.println(sv1.toString());
	}
}