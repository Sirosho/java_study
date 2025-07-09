package chap2_7.lambda.fruit;

@FunctionalInterface
public interface AppleFunction<Y> {

   Y apply(Apple apple);
}
