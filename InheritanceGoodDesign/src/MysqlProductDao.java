public class MysqlProductDao extends BaseDao {

    public MysqlProductDao(String connectString) {
        super(connectString);
    }

    @Override
    public void add(Product product) {
        System.out.println("Mysql databese "+product.getName()+ " eklendi." );
    }
}
