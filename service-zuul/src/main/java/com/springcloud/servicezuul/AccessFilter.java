package com.springcloud.servicezuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import java.io.InputStream;

@Component
public class AccessFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.set("startTime",System.currentTimeMillis());
        InputStream inputStream =RequestContext.getCurrentContext().getResponseDataStream();
//        InputStream newInputStream= copy(inputStream);
//        transerferTolog(inputStream);
        ctx.setResponseDataStream(inputStream);
        return null;
    }
}