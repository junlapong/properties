package ru.qatools.properties.testdata;

import ru.qatools.properties.Property;
import ru.qatools.properties.Use;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/13/13, 8:14 PM
 */
public class PropertiesWithCustomConverter {

    @Property("field")
    public String field;

    @Use(UpperCaseStringConverter.class)
    @Property("field.with.use.annotation")
    public String fieldWithUseAnnotation;
}