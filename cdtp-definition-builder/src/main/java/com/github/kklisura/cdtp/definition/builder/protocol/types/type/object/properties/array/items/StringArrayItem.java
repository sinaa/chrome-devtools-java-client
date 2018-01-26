package com.github.kklisura.cdtp.definition.builder.protocol.types.type.object.properties.array.items;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.kklisura.cdtp.definition.builder.protocol.types.type.object.properties.array.ArrayItem;

/**
 * String array item type.
 *
 * @author Kenan Klisura
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
public class StringArrayItem extends ArrayItem {}
