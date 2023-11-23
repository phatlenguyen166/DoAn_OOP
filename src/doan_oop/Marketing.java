package doan_oop;

public class Marketing extends PhongBan {
    private double heSoLuong = 2.8;
    private double luongCoBan = 2200000;
    private double soLanChotDeal ;
    public Marketing(){

    }

    public Marketing(String maPhongBan){
        super(maPhongBan);
    }

    public Marketing(String maPhongBan,String tenPhongBan){
        super(maPhongBan,tenPhongBan);
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }
    public double getSoLanChotDeal() {
        return soLanChotDeal;
    }
    @Override 
    public double tinhLuong(){
        return getLuongCoBan() * getHeSoLuong() + getSoLanChotDeal()*100000;
    }
}
