package v1;

public class Director {

    private Builder builder;

    Director(String builderMode){
        builder = new ConcreteBuilder();
        System.out.println(builderMode);
    }

    Product constract(String sourceName){
        builder.buildPart1(1);
        builder.buildPart2(sourceName);
        return builder.getProduct();
    }
}
