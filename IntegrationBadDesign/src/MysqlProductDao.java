public class MysqlProductDao {
    private String connectingString;

    public MysqlProductDao(String connectingString) {
        this.connectingString = connectingString;
    }
    public void add(Product product){
        System.out.println("Mysql Database "+product.getName()+" eklendi");
    }
}
