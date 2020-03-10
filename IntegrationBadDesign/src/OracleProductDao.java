public class OracleProductDao {
    private String connectString;

    public OracleProductDao(String connectString) {
        this.connectString = connectString;
    }
    public  void add(Product product){
        System.out.println("Oracle Database "+product.getName()+" eklendi");
    }
}
