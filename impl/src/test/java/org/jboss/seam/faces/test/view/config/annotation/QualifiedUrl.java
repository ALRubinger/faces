package org.jboss.seam.faces.test.view.config.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@TestQualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface QualifiedUrl {
    public String value();
}
