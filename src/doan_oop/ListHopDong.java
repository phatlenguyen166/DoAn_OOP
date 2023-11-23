//hoàn chỉnh
package doan_oop;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ListHopDong implements ThaoTac{

    public  HopDong[] listHopDong ;   
    private int numberOfContracts;
    static Scanner sc = new Scanner(System.in);

    public int getNumberOfContracts(){
        return numberOfContracts;
    }

    public ListHopDong() {
        listHopDong = new HopDong[15];        
        numberOfContracts = 0;
    }
     
    public void xuat() {
        for (int i = 0; i < numberOfContracts; i++) {
            System.out.println(listHopDong[i]);
        }
    }
    
    public void them() {
        if (numberOfContracts < listHopDong.length) {
            HopDong x=new HopDong();
            x.inputHopDong();
            listHopDong[numberOfContracts++]=x;
        } else {
            System.out.println("Danh sách hop dong đã đầy, không thể thêm mới.");
        }
    }
    
    public void xoa() {
        System.out.println("Nhap id hop dong can xoa:");
        String id= sc.nextLine();
        boolean found =false;
        for (int i = 0; i < numberOfContracts; i++) {
            if (listHopDong[i].getIdHD().equalsIgnoreCase(id)) {
                found=true;
                 System.out.println("Bạn có chắc chắn muốn xóa hợp đồng này? (yes/no)");
                 String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                    for (int j = i; j < numberOfContracts - 1; j++) {
                    listHopDong[j] = listHopDong[j + 1];
                    }
                     listHopDong[numberOfContracts - 1] = null;
                     numberOfContracts--;
                     System.out.println("Đã xóa hợp đồng có ID " + id);
                }else {
                     System.out.println("Hủy bỏ việc xóa hợp đồng.");
                }
                break;
            }
        }
        System.out.println("Không tìm thấy hop dong có ID " + id);
    }
    
    public void timKiem() {
        System.out.println("Nhap id hop dong can tim:");
        String id= sc.nextLine();
        for (int i = 0; i < numberOfContracts; i++) {
            if (listHopDong[i].getIdHD().equalsIgnoreCase(id)) {
                System.out.println("Đã tìm thấy hợp đồng:");
                System.out.println(listHopDong[i]);
                return;
            }
        }
        System.out.println("Không tìm thấy hợp đồng có ID " + id);
    }
    
    public void sua() {
    System.out.println("Nhập mã hợp đồng cần sửa:");
    String id = sc.nextLine();
    boolean found = false;
    for (int i = 0; i < numberOfContracts; i++) {
        if (listHopDong[i].getIdHD().equalsIgnoreCase(id)) {
            found = true;
            System.out.println("Nhập thông tin mới cho hợp đồng:");
            listHopDong[i].setIdHD(id);
            listHopDong[i].setLoaiHD(id);
            listHopDong[i].setNgayKy(id);
            listHopDong[i].setTenPB(id);
            listHopDong[i].getThoiHan();
            System.out.println("Thông tin hợp đồng sau khi sửa:");
            System.out.println(listHopDong[i]);
            break;
        }
    }
    System.out.println("Không tìm thấy hợp đồng có ID " + id);
}

    
    public void ghiFile() {
        try {
            FileWriter filew =new FileWriter("hopDong.txt");
            BufferedWriter writer= new BufferedWriter(filew);
            for(int i=0; i<numberOfContracts;i++){
                writer.write(listHopDong[i].getIdHD() + "," + listHopDong[i].getLoaiHD() + "," + listHopDong[i].getTenPB() + ","
                        + listHopDong[i].getNgayKy() + "," + listHopDong[i].getThoiHan() + "\n");
            }
            System.out.println("Đã ghi danh sách hợp đồng vào file " + filew);
        } catch (IOException e) {
        }
    }
    
    public void docFile() {
        try {
            FileReader filer=new FileReader("hopDong.txt");
            BufferedReader reader = new BufferedReader(filer);
            String line;
            while ((line = reader.readLine()) != null) {
                String str[] = line.split(",");
                HopDong hopDong = new HopDong(str[0], str[1], str[2], str[3], Integer.parseInt(str[4]));
                them();
            }
            System.out.println("Đã đọc danh sách hợp đồng từ file " + filer);
        } catch (IOException e) {
        }
    }
    public void menu(){
        
    }
}
