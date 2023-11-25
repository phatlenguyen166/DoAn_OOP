package doan_oop;

public class KyThuat extends PhongBan {
    private double soLanSuaChua ;
    
    public KyThuat(){
    }

    public KyThuat(String maPhongBan,String tenPhongBan,double heSoLuong,double luongCoBan){
        super(maPhongBan,tenPhongBan,heSoLuong,luongCoBan);
    }
    
    public KyThuat(String maPhongBan,String tenPhongBan,double heSoLuong,double luongCoBan,double soLanSuaChua){
        super(maPhongBan,tenPhongBan,heSoLuong,luongCoBan);
        this.soLanSuaChua=soLanSuaChua;
    }

    public double getSoLanSuaChua() {
        return soLanSuaChua;
    }
    public void setSoLanSuaChua(double soLanSuaChua) {
        this.soLanSuaChua = soLanSuaChua;
    }
    @Override 
    public double tinhLuong(){
        return getLuongCoBan() * getHeSoLuong() + getSoLanSuaChua() * 50000;
    }
    @Override
    public void nhap(){
        System.out.print("Nhap so lan sua chua thanh cong: ");
        setSoLanSuaChua(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public String toString() {
        return super.toString()+ "|" + soLanSuaChua;
    }
    
}

