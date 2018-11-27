public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (null == realImage) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
