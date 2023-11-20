package doan_oop;

public class KyThuat extends PhongBan {
    private double heSoLuong = 3.2;
    private double luongCoBan = 2500000;
    public KyThuat(){

    }

    public KyThuat(String maPhongBan){
        super(maPhongBan);
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }
    
    public double getLuongCoBan() {
        return luongCoBan;
    }
    public KyThuat(String maPhongBan,String tenPhongBan){
        super(maPhongBan,tenPhongBan);
    }
    @Override 
    public double tinhLuong(){
        return getLuongCoBan() * getHeSoLuong();
    }
}

