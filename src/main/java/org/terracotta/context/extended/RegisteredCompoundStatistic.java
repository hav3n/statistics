/*
 * Copyright Terracotta, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terracotta.context.extended;

import org.terracotta.statistics.extended.CompoundOperation;
import org.terracotta.statistics.extended.Result;

import java.util.EnumSet;

/**
 * @author Ludovic Orban
 */
public class RegisteredCompoundStatistic<T extends Enum<T>> extends RegisteredCompoundOperationStatistic<T> {
  private final EnumSet<T> compound;

  public RegisteredCompoundStatistic(CompoundOperation<T> compoundOperation, EnumSet<T> compound) {
    super(compoundOperation);
    this.compound = compound;
  }

  @Override
  public RegistrationType getType() {
    return RegistrationType.COMPOUND;
  }

  public EnumSet<T> getCompound() {
    return compound;
  }

  public Result getResult() {
    return getCompoundOperation().compound(getCompound());
  }
}
