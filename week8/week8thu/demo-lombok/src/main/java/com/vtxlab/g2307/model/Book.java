package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @AllArgsConstructor
// @NoArgsConstructor
// @Builder
// @Getter
// @Setter
// @ToString
// @EqualsAndHashCode
@Data // getter, setter, tostring, equals, hashcode, requiredargsconstractor
@AllArgsConstructor
@Builder
public class Book {
  private String author;
  private double weight;
}
