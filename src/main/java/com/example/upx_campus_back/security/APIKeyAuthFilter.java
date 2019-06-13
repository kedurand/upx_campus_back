package com.example.upx_campus_back.security;

import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

import javax.servlet.http.HttpServletRequest;

/**
 * The type Api key auth filter.
 */
public class APIKeyAuthFilter extends AbstractPreAuthenticatedProcessingFilter {
    private String principalRequestHeader;

    /**
     * Instantiates a new Api key auth filter.
     *
     * @param principalRequestHeader the principal request header
     */
    public APIKeyAuthFilter(String principalRequestHeader) {
        this.principalRequestHeader = principalRequestHeader;
    }

    @Override
    protected Object getPreAuthenticatedPrincipal(HttpServletRequest request) {
        return request.getHeader(principalRequestHeader);
    }

    @Override
    protected Object getPreAuthenticatedCredentials(HttpServletRequest request) {
        return "N/A";
    }

}
