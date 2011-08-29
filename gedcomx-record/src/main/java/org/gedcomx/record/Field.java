/**
 * Copyright 2011 Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.record;

import org.gedcomx.common.GenealogicalResource;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * A field on a record.
 */
@XmlType ( name = "Field", propOrder = { "original", "interpreted", "normalized" } )
public abstract class Field extends GenealogicalResource {

  private String label;
  private String original;
  private String interpreted;
  private String normalized;

  /**
   * A label for the field. The label can be used to associate fields that were taken from the same section of
   * the source, such as identified by an indexing template.
   *
   * @return The field label.
   */
  @XmlAttribute
  public String getLabel() {
    return label;
  }

  /**
   * A label for the field. The label can be used to associate fields that were taken from the same section of
   * the source, such as identified by an indexing template.
   *
   * @param label The field label.
   */
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * The original value of the field, meant to record exactly what is displayed.
   *
   * @return The original value of the field, meant to record exactly what is displayed.
   */
  public String getOriginal() {
    return original;
  }

  /**
   * The original value of the field, meant to record exactly what is displayed.
   *
   * @param original The original value of the field, meant to record exactly what is displayed.
   */
  public void setOriginal(String original) {
    this.original = original;
  }

  /**
   * The value of the field as interpreted by the user. For example, if the original value were 'MN', the user-interpreted value could be "Minnesota".
   *
   * @return the interpreted The value of the field as interpreted by the user. For example, if the original value were 'MN', the user-interpreted value could be "Minnesota".
   */
  public String getInterpreted() {
    return interpreted;
  }

  /**
   * The value of the field as interpreted by the user. For example, if the original value were 'MN', the user-interpreted value could be "Minnesota".
   * 
   * @param interpreted The value of the field as interpreted by the user. For example, if the original value were 'MN', the user-interpreted value could be "Minnesota".
   */
  public void setInterpreted(String interpreted) {
    this.interpreted = interpreted;
  }

  /**
   * The normalized value of the field as interpreted by an automated process.
   * 
   * @return The normalized value of the field as interpreted by an automated process.
   */
  public String getNormalized() {
    return normalized;
  }

  /**
   * The normalized value of the field as interpreted by an automated process.
   * 
   * @param normalized The normalized value of the field as interpreted by an automated process.
   */
  public void setNormalized(String normalized) {
    this.normalized = normalized;
  }

}
