package com.smil.service;

import com.smil.dao.Menus;

import java.util.List;
import java.util.Map;

public interface SeriesService {

    List<String> querySeries();

    Map<String, List<Menus>> queryMenuBySeries();
}
