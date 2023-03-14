package ra.dev;

public class Product {
    public String productId;
    public String productName;
    public String title;
    public double importPrice;
    public double exportPrice;
    public int quantity;
    public String descriptions;
    public boolean productStatus;

    public Product() {

    }

    //constructor khởi tạo các thông tin sản pảaarm
    public Product(String productId, String productName,
                   String title, float importPrice, float exportPrice,
                   int quantity, String descriptions,
                   boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData(String productId, String productName, String title,
                          float importPrice, int quantity, String descriptions,
                          boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.importPrice = importPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.productStatus = productStatus;
    }

    public void displayData() {
        System.out.println("thông tin sản phẩm: ");
    }

    public void calExportPrice() {
        this.exportPrice = this.importPrice * 1.2;
    }
}
