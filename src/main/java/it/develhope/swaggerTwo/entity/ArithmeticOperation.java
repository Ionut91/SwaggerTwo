package it.develhope.swaggerTwo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticOperation {

    private String name;
    private int minNumberOfOperands;
    private String description;
    private String [] properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinNumberOfOperands() {
        return minNumberOfOperands;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setMinNumberOfOperands(int minNumberOfOperands) {
        this.minNumberOfOperands = minNumberOfOperands;
    }

    public String[] getProperties() {
        return properties;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }
}
