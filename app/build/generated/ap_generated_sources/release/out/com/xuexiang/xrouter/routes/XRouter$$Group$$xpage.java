package com.xuexiang.xrouter.routes;

import cn.dreamn.qianji_auto.core.XPageTransferActivity;
import com.xuexiang.xrouter.enums.RouteType;
import com.xuexiang.xrouter.facade.template.IRouteGroup;
import com.xuexiang.xrouter.model.RouteInfo;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY XROUTER. */
public class XRouter$$Group$$xpage implements IRouteGroup {
  @Override
  public void loadInto(Map<String, RouteInfo> routeInfos) {
    routeInfos.put("/xpage/transfer", RouteInfo.build(RouteType.ACTIVITY, XPageTransferActivity.class, "/xpage/transfer", "xpage", new java.util.HashMap<String, Integer>(){{put("pageName", 8); }}, -1, -2147483648));
  }
}
