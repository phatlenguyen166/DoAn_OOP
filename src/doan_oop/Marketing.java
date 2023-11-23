package doan_oop;

public class Marketing extends PhongBan {
    private double soLanChotDeal ;
    public Marketing(){

    }

    public Marketing(String maPhongBan){
        super(maPhongBan);
    }

    public Marketing(String maPhongBan,String tenPhongBan,double heSoLuong,double luongCoBan){
        super(maPhongBan,tenPhongBan,heSoLuong,luongCoBan);
    }

    public double getSoLanChotDeal() {
        return soLanChotDeal;
    }

    public void setSoLanChotDeal(double soLanChotDeal) {
        this.soLanChotDeal = soLanChotDeal;
    }

    @Override 
    public double tinhLuong(){
        return getLuongCoBan() * getHeSoLuong() + getSoLanChotDeal()*100000;
    }
    @Override
    public void nhap(){
        System.out.print("Nhap so lan chot deal: ");
        setSoLanChotDeal(Double.parseDouble(sc.nextLine()));
    }
}
