public class FactoryProducer {
    public static AbastractFactory getFactory(String factoryType) {
        if (null == factoryType) {
            return null;
        }
        if (factoryType.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factoryType.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
