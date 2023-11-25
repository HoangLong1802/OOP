public class Main{
    
    public static void main(String[] args) {
        meo meo = new meo( "Dau", "den", 1);
        // object đối tượng con mèo tên đậu, màu đen và 1 tuổi

        meo.gioithieu();
        meo.an();
        // meo.ngu();
        
        System.out.println();
        
        cho cho = new cho();
        cho.an();
        // tính trừu tượng chỉ cho người dùng sử dụng ăn trong dộng vật từ con chó giấu đi phương thức ăn
    }
}