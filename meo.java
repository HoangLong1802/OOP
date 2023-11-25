public class meo {
    // extend là tính kế thừa( meo kế thừa các thuộc tính và phương thức từ động vật)

    public String name;
    public String mau;
    public int tuoi;
    // tạo thuộc tính cho đối tượng 
    // tính đóng gói là public và private có thể thay đổi với một số thuộc tính hoặc phương thức cần bảo mật

    public meo(String name, String mau, int tuoi) {
        this.name = name;
        this.mau = mau;
        this.tuoi=tuoi;
    }

    public int getTuoi() {
        return tuoi;
    }
    public String getName() {
        return name;
    }public String getMau() {
        return mau;
    }
    public void keu() {
        System.out.println("keu meow meow meow meow meow");
    }
    public void gioithieu(){
        System.out.println("tao la "+name+" \ntao mau "+mau+" \ntao "+tuoi+" tuoi ");
    }

    // khả năng ghi đè của tính kế thừa
    public void an(){
        System.out.println("tao khong an com tao an pate");
    }
}
