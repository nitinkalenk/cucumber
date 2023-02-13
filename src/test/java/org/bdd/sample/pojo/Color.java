package org.bdd.sample.pojo;

import java.util.Objects;

public class Color {

  private final String color;

  public Color(String color) {
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Color color1 = (Color) o;
    return Objects.equals(color, color1.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Color{");
    sb.append("color='").append(color).append('\'');
    sb.append('}');
    return sb.toString();
  }

}
