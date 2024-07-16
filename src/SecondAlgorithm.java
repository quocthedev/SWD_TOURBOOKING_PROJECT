import java.util.Scanner;

public class SecondAlgorithm {
    Scanner scanner = new Scanner(System.in);
    public void phuongTrinhBac1() {
        System.out.println("Enter a: ");
        float a = scanner.nextFloat();

        System.out.println("Enter number b: ");
        float b = scanner.nextFloat();

        float x = -b / a;
        //ax + b = 0
        //ax = -b
        //x = -b / a
        //x = ???
        System.out.println(x);
    }

    public void phuongTrinhBac2() {
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        double denta = Math.pow(b, 2) - 4 * a * c; //b^2
        double dentaCăng = Math.sqrt(denta);
        if (denta > 0) {
            double x1 = ((-b) + dentaCăng) / (2 * a);
            double x2 = ((-b) - dentaCăng) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt (denta > 0) là: " + "denta: " + denta);
            System.out.println("x1 is: " + x1);
            System.out.println("x2 is: " + x2);
        } if (denta == 0) {
            double x1 = (-(-b)) / 2 * a;
            double x2 = x1;
            System.out.println("Phương trình có nghiệm kép vì denta == 0 là: " + "x1: " + x1 + ",x2: " + x2);
        } if (denta < 0) {
            System.out.println("Phương trình vô nghiệm vì denta < 0," + " denta = " + denta);
        }

    }

    public void thetichMatCau() {
        System.out.println("Nhập diện tích mặt cầu: ");
        double s = scanner.nextDouble();

        double pi = 3.141593;
        double r = Math.sqrt(s / (4 * pi));
        double phanSo = (4.0/3.0);
        double v = phanSo * pi * (Math.pow(r, 3));

        System.out.println("Thể tích mặt cầu là: " + v);
    }

    public void khoangCachAB() {
        System.out.println("Nhập tọa độ xA: ");
        double xA = scanner.nextDouble();

        System.out.println("Nhập tọa độ yA: ");
        double yA = scanner.nextDouble();

        System.out.println("Nhập tọa độ xB: ");
        double xB = scanner.nextDouble();

        System.out.println("Nhập tọa độ yB: ");
        double yB = scanner.nextDouble();

        double AB = Math.sqrt((Math.pow(xB - xA, 2)) + (Math.pow(yB - yA, 2)));
        System.out.println("|AB|: "+AB);
    }

    public void xacDinhDiemM() {
        System.out.println("Nhập tọa độ xC: ");
        double xC = scanner.nextDouble();

        System.out.println("Nhập tọa độ yC: ");
        double yC = scanner.nextDouble();

        System.out.println("Nhập tọa độ xM: ");
        double xM = scanner.nextDouble();

        System.out.println("Nhập tọa độ yM: ");
        double yM = scanner.nextDouble();

        System.out.println("Nhập bán kính đường tròn: ");
        double R = scanner.nextDouble();

        double d = Math.sqrt((Math.pow(xM - xC, 2) + (Math.pow(yM - yC, 2))));
        System.out.println("d là : " + d);

        if (d < R) {
            System.out.println("M nằm trong đường tròn");
        } else if (d == R) {
            System.out.println("M nằm trên đường tròn");

        } else if (d > R) {
            System.out.println("M nằm ngoài đường tròn");
        }
    }

    public void dientichTamGiac() {
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();

        double p = (a + b + c) / 2.0;
        System.out.println("nửa chu vi: " + p);

        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Diện tích tam giác là: " + S);

        if ( a == b && a == c) {
            System.out.println("Tam giác đều");
        } else if (a == b || b == c || a == c) {
            System.out.println("Tam giác cân");
        } else if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)
                || (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2))
        )       || (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2))) {
            System.out.println("Tam giác vuông");
        } else if (a != b && a !=c && b!= c) {
        System.out.println("Tam giác thường");
        }
    }

    public void tongDienTichTamGiac() {
        System.out.println("Nhập tọa độ đỉnh (A) xA: ");
        double xA = scanner.nextDouble();

        System.out.println("Nhập tọa độ yA: ");
        double yA = scanner.nextDouble();

        System.out.println("Nhập tọa độ đỉnh (B) xB: ");
        double xB = scanner.nextDouble();

        System.out.println("Nhập tọa độ yB: ");
        double yB = scanner.nextDouble();

        System.out.println("Nhập tọa độ đỉnh (C) xC: ");
        double xC = scanner.nextDouble();

        System.out.println("Nhập tọa độ yC: ");
        double yC = scanner.nextDouble();

        System.out.println("Nhập tọa độ điểm (M) xM: ");
        double xM = scanner.nextDouble();

        System.out.println("Nhập tọa độ yM: ");
        double yM = scanner.nextDouble();

        double ABC = (1.0/2.0) * Math.abs(xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB));
        System.out.println("Diện tích tam giác ABC là: " + ABC);

        double MAB = (1.0/2.0) * Math.abs(xM * (yA - yB) + xA * (yB - yM) + xC * (yM - yA));
        double MBC = (1.0/2.0) * Math.abs(xM * (yB - yC) + xB * (yC - yM) + xC * (yM - yB));
        double MCA = (1.0/2.0) * Math.abs(xM * (yC - yA) + xA * (yA - yM) + xC * (yM - yC));

        double tongTamNho = MAB + MBC + MCA;
        System.out.println(tongTamNho);

        if ( tongTamNho == ABC) {
            System.out.println("Điểm M nằm trong cạnh tam giác ABC");
        } else if ( tongTamNho > ABC ) {
            System.out.println("Điểm M nằm trên cạnh tam giác ABC");
        } else if (tongTamNho < ABC) {
            System.out.println("Điểm M nằm ngoài cạnh tam giác ABC");
        }
    }
}
