package com.excella.reactor.domain.entities;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

/** Address domain object */
@Data
@Embeddable
public class Address {
  private String line1;
  private String line2;
  private String city;

  @NotNull
  @Size(min = 2, max = 2)
  private String stateCode;

  private String zipCode;
}
