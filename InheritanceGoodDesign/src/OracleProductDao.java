public class OracleProductDao extends BaseDao {
    public OracleProductDao(String connectString) {
        super(connectString);
    }

    @Override
    public void add(Product product) {
        System.out.println("Oracle Database"+product.getName()+" eklendi.");

    }
}
