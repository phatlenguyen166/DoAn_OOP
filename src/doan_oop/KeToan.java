package doan_oop;

public class KeToan extends PhongBan {
    private double soGioTangCa ;
    public KeToan(){

    }
 
     public KeToan(String maPhongBan,String tenPhongBan,double heSoLuong,double luongCoBan,double soGioTangCa){
        super(maPhongBan,tenPhongBan,heSoLuong,luongCoBan); 
        this.soGioTangCa=soGioTangCa;
    } 

    public KeToan(String maPhongBan,String tenPhongBan,double heSoLuong,double luongCoBan){
        super(maPhongBan,tenPhongBan,heSoLuong,luongCoBan);  
    }    

    public double getSoGioTangCa() {
        return soGioTangCa;
    }

    public void setSoGioTangCa(double soGioTangCa) {
        this.soGioTangCa = soGioTangCa;
    }
    @Override 
    public double tinhLuong(){
        return getHeSoLuong() * getLuongCoBan() + getSoGioTangCa()*200000 ;
    }
    @Override
    public void nhap(){
        System.out.print("Nhap so gio tang ca: ");
        setSoGioTangCa(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public String toString() {
        return  super.toString()+ "|" + soGioTangCa ;
    }
    
}
