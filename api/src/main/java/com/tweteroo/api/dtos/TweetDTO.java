package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TweetDTO {
  @NotNull(message = "userId is required")
  private Long userId;

  @Size(max = 280)
  @NotBlank(message = "Field text is required")
  private String text;
}
