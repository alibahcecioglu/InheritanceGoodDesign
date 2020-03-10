public class BaseDao {

    private String connectString;

    public BaseDao(String connectString) {
        this.connectString = connectString;
    }

    public String getConnectString() {
        return connectString;
    }

    public void setConnectString(String connectString) {
        this.connectString = connectString;
    }
    public void add(Product product){
        System.out.println("Default Database "+product.getName()+" eklendi.");

    }
}
