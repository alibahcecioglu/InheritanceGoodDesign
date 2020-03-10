public class Main {
    public static void main(String[] args) {
        ProductManager productManager=new ProductManager(new OracleProductDao("Oracle string"));
        productManager.add(new Product(1,"süt" ,4));

        ProductManager productManager1=new ProductManager(new MysqlProductDao("mysql string"));
        productManager1.add(new Product(1,"kahve",10));
    }
}
