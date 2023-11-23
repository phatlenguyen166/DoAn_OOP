//Hoàn chỉnh
package doan_oop;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HopDong{
    String idHD;
    String loaiHD;
    String tenPB;
    String ngayKy;
    int thoiHan;
    static Scanner sc= new Scanner(System.in);

    public HopDong() {
    }

    public HopDong(String idHD, String loaiHD, String tenPB, String ngayKy, int thoiHan) {
        this.idHD = idHD;
        this.loaiHD = loaiHD;
        this.tenPB = tenPB;
        this.ngayKy = ngayKy;
        this.thoiHan = thoiHan;
    }

    public String getIdHD() {
        return idHD;
    }

    public void setIdHD(String idHD) {
        for(;;){
            if(!idHD.equals("")){
              break;
            }
            System.out.println("Moi nhap lai ma hop dong");
            idHD=sc.nextLine();
        }
        this.idHD = idHD;
    }

    public String getLoaiHD() {
        return loaiHD;
    }

    public void setLoaiHD(String loaiHD) {
        for(;;){
            if(!loaiHD.equals("")){
              break;
            }
            System.out.println("Moi nhap lai loai hop dong");
            loaiHD=sc.nextLine();
        }
        this.loaiHD = loaiHD;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        for(;;){
            if(!tenPB.equals("")){
              break;
            }
            System.out.println("Moi nhap lai ma");
            tenPB=sc.nextLine();
        }
        this.tenPB = tenPB;
    }

    public String getNgayKy() {
        return ngayKy;
    }

    public void setNgayKy(String ngayKy) {
        for(;;){
            if(!ngayKy.equals("")&&ngayKy.length()==10){
              break;
            }
            System.out.println("Moi nhap lai ngay ky hop dong");
            ngayKy=sc.nextLine();
        }
        this.ngayKy = ngayKy;
    }

    public int getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(int thoiHan) {
        for(;;){
            if(thoiHan!=0){
              break;
            }
            System.out.println("Moi nhap lai ma");
            thoiHan=Integer.parseInt(sc.nextLine());
        }
        this.thoiHan = thoiHan;
    }
    
    @Override
    public String toString() {
        return  " idHD : " + idHD + " ,  loaiHD : " + loaiHD + ",   tenPB : " + tenPB + " ,   ngayKy : " + ngayKy + "    , thoiHan : " + thoiHan+ "thang " ;
    }
public void inputHopDong(){
        System.out.println("Mời nhập mã hợp đồng");
        setIdHD(idHD);
        System.out.println("Mời nhập loại hợp đồng");
        setLoaiHD(loaiHD);
        System.out.println("Mời nhập phòng ban");
        setTenPB(tenPB);
        System.out.println("Mời nhập ngay ky hợp đồng");
        setNgayKy(ngayKy);
        System.out.println("Mời nhập thòi hạn hợp đồng");
        setThoiHan(thoiHan);
    }
   public void outputHopDong(){
       System.out.println(toString());
   }
    
    
}
