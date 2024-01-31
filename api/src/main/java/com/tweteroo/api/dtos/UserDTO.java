package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {

  @Size(min = 3, max = 100)
  @NotBlank(message = "Username is required")
  private String username;

  @NotBlank(message = "Avatar is required")
  private String avatar;
}
