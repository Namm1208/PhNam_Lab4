
public class Test {
	public static void main(String[] args) {
		
		HocVienDH hvdh1 = new HocVienDH(null, null, null, 0, 0, 0);
		System.out.println("---------------------");
		System.out.println("  Hoc Vien Do Hoa ");
		hvdh1.Nhap();
		System.out.println("---------------------");
		System.out.println("     Ket Qua         ");
		hvdh1.In();
		
		HocVienLT hvlt1 = new HocVienLT(null, null, null, 0, 0, 0);
		System.out.println("---------------------");
		System.out.println(" Hoc Vien Lap Trinh ");
		hvlt1.Nhap();
		System.out.println("---------------------");
		System.out.println("      Ket Qua        ");
		hvlt1.In();
		
		System.out.println();
		System.out.println("-------- OUT ----------");
	}
}