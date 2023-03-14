package ra.dev;

import java.util.Scanner;

public class ProductManagement {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("******Menu******");
            System.out.println("1.Nhập thông tin cho n sản phẩm ");
            System.out.println("2.Tính giá bn cho tất cả sản phẩm");
            System.out.println("3.Hiển thị thông tin các sản phẩm");
            System.out.println("4.Sắp xếp sản phẩm theo giá bán tăng dần");
            System.out.println("5.Tìm kiếm theo tên sản phẩm");
            System.out.println("6.Thống k số lượng và in thông tin các sản phẩm sắp hết hàng");
            System.out.println("7.Cập nhật trạng thái sản phẩm theo tên sản phẩm");
            System.out.println("8.Thoát");

            System.out.println("Nhập lựa chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
//            Product product = new Product();


            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sản phẩm cần thêm: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 1; i <= n; i++) {
                        System.out.println("Nhập thông tin sản phấm thứ " + i + " : ");
                        System.out.println("Mã sản phẩm: ");
                        String productId = scanner.nextLine();
                        System.out.println("Tên sản phẩm: ");
                        String productName = scanner.nextLine();
                        System.out.println("Giá nhập sản phẩm: ");
                        Float importPrice = Float.parseFloat(scanner.nextLine());
                        System.out.println("Số lượng sản phẩm : ");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        System.out.println("Trạng thái sản phẩm: ");
                        String input = scanner.nextLine();
                        boolean status = Boolean.parseBoolean(input);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Thoát khỏi chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập lại: ");
                    break;
            }

        }
    }
}
