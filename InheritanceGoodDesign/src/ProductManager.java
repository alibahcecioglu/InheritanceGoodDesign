public class ProductManager {
    private BaseDao baseDao;

    public ProductManager(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

    public void add(Product product){
        baseDao.add(product);
       System.out.println("ürün ismi "+product.getName()+" eklendi.");

   }

}
