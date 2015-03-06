package org.jboss.windup.rules.apps.java.scan.ast.annotations;

import com.tinkerpop.frames.Property;
import com.tinkerpop.frames.modules.typedgraph.TypeValue;

@TypeValue(JavaAnnotationLiteralTypeValueModel.TYPE)
public interface JavaAnnotationLiteralTypeValueModel extends JavaAnnotationTypeValueModel
{
    public static final String TYPE = "JavaAnnotationLiteralTypeValueModel";
    public static final String LITERAL_TYPE = "literalType";
    public static final String LITERAL_VALUE = "literalValue";

    @Property(LITERAL_TYPE)
    void setLiteralType(String type);

    @Property(LITERAL_TYPE)
    String getLiteralType();

    @Property(LITERAL_VALUE)
    void setLiteralValue(String value);

    @Property(LITERAL_VALUE)
    String getLiteralValue();
}
