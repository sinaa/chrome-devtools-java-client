package com.github.kklisura.cdt.protocol.types.page;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2021 Kenan Klisura
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

@Experimental
public class BackForwardCacheNotRestoredExplanation {

  private BackForwardCacheNotRestoredReasonType type;

  private BackForwardCacheNotRestoredReason reason;

  /** Type of the reason */
  public BackForwardCacheNotRestoredReasonType getType() {
    return type;
  }

  /** Type of the reason */
  public void setType(BackForwardCacheNotRestoredReasonType type) {
    this.type = type;
  }

  /** Not restored reason */
  public BackForwardCacheNotRestoredReason getReason() {
    return reason;
  }

  /** Not restored reason */
  public void setReason(BackForwardCacheNotRestoredReason reason) {
    this.reason = reason;
  }
}
