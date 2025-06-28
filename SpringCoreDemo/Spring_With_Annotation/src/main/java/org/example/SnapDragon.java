package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("snapdragon")
public class SnapDragon implements MobileProcessor{
    @Override
    public void process() {
        System.out.println("World's best CPU");
    }
}
