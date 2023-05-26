package com.ducdv.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSFilter implements Filter {
    private final String allowOrigin;

    public CORSFilter(
            @Value("*") String allowOrigin) {
        this.allowOrigin = allowOrigin;
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {


        HttpServletResponse response = (HttpServletResponse) res;

        response.setHeader("content-type", "application/json;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin", allowOrigin);
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Headers", "" +
                "Origin, Accept, X-Requested-With, Content-Type," +
                " Access-Control-Request-Method, Access-Control-Request-Headers, " +
                "Authorization");
        response.setHeader("Access-Control-Max-Age", "3600");

        chain.doFilter(req, res);
    }
}