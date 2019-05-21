package com.michael.abstractdocument;

import com.michael.abstractdocument.domain.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 抽象实体设计模式包含了可增加的，非静态的属性。
 * 此设计模式使用特征的概念来保证了类型安全以及把
 * 具体的属性分配到了不同的接口中。
 *
 * @author Michael Chu
 * @date 2019-05-21 16:17
 */
@Slf4j
public class App {

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public static void main(String[] args) {
        log.info("Constructing parts and car");

        Map<String, Object> carProperties = new HashMap<>(3);
        carProperties.put(HasModel.PROPERTY, "300SL");
        carProperties.put(HasPrice.PROPERTY, 10000L);

        Map<String, Object> wheelProperties = new HashMap<>(3);
        wheelProperties.put(HasType.PROPERTY, "wheel");
        wheelProperties.put(HasModel.PROPERTY, "15C");
        wheelProperties.put(HasPrice.PROPERTY, 100L);

        Map<String, Object> doorProperties = new HashMap<>(3);
        doorProperties.put(HasType.PROPERTY, "door");
        doorProperties.put(HasModel.PROPERTY, "Lambo");
        doorProperties.put(HasPrice.PROPERTY, 300L);

        carProperties.put(HasParts.PROPERTY, Arrays.asList(wheelProperties, doorProperties));

        Car car = new Car(carProperties);

        log.info("Here is our car:");
        log.info("-> model: {}", car.getModel().get());
        log.info("-> price: {}", car.getPrice().get());
        log.info("-> parts: ");
        car.getParts().forEach(p -> log.info("\t{}/{}/{}", p.getType().get(), p.getModel().get(), p.getPrice().get()));
    }
}
