package com.dhasset.api_gateway_service.api.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Bruno Ramirez
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TokenRequest {

    private String token;
}
