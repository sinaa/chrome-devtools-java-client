package com.github.kklisura.cdtp.definition.builder.protocol.types.type.object.properties;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.kklisura.cdtp.definition.builder.protocol.types.type.object.Property;

/**
 * String property.
 *
 * @author Kenan Klisura
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class StringProperty extends Property {}
