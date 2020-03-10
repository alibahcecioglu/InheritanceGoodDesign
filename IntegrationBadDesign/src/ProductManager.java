public class ProductManager {

    public  void add(Product product,int databaseType){
        if (databaseType==1) {
            OracleProductDao oracleProductDao = new OracleProductDao("connectin oracle String");
            oracleProductDao.add(product);
        }else {
            MysqlProductDao mysqlProductDao=new MysqlProductDao("connect mysgl string");
            mysqlProductDao.add(product);
        }

        System.out.println("Ürün iş katmani işlemleri");
        System.out.println("Ürün ismi "+product.getName());
    }
}
