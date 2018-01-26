package com.github.kklisura.cdtp.protocol.types.console;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Message severity. */
public enum Level {
  @JsonProperty("log")
  LOG,
  @JsonProperty("warning")
  WARNING,
  @JsonProperty("error")
  ERROR,
  @JsonProperty("debug")
  DEBUG,
  @JsonProperty("info")
  INFO
}
