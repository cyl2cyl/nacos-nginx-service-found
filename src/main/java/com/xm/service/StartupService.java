package com.xm.service;

import java.util.Map;

public interface StartupService {

    Map<String,String> argsToMap(String[] args);
}