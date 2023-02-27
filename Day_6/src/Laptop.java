
public class Laptop {
    int productId;
    String manufacturer;
    String modelName;
    Double screenSize;
    String matrixType;
    int ramVolume;
    int hdVolume;
    String operSystem;
    String color;
    int price;

    public Laptop(int productId, String manufacturer, String modelName, Double screenSize, String matrixType,
                  int ramVolume, int hdVolume, String operSystem, String color, int price) {
        this.productId = productId;
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.screenSize = screenSize;
        this.matrixType = matrixType;
        this.ramVolume = ramVolume;
        this.hdVolume = hdVolume;
        this.operSystem = operSystem;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return String.format("""
                        Производитель: %s, название модели: %s
                        размер экрана: %s", тип матрицы: %s, объём оперативной памяти: %dГБ, объём жёсткого диска: %dГБ,
                        оперативная система: %s, цвет: %s, цена: %d""",
                              this.manufacturer, this.modelName, this.screenSize, this.matrixType,
                              this.ramVolume, this.hdVolume, this.operSystem, this.color, this.price);
    }
}
