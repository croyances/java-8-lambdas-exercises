package com.example.demo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TreeTest {
//
//    private List<Res> resList = new ArrayList<>();
//
//    @Before
//    public void before() {
//        System.out.println("before");
//        Res res1 = new Res("应用1", 1);
//        Res res2 = new Res("应用2", 1);
//        List<Res> appList = new ArrayList<>();
//        appList.add(res1);
//        appList.add(res2);
//
//
//        Res res11 = new Res("一级模块1-1", 2);
//        Res res12 = new Res("一级模块1-2", 2);
//        List<Res> module1List = new ArrayList<>();
//        module1List.add(res11);
//        module1List.add(res12);
//        res1.setChildList(module1List);
//
//        Res res111 = new Res("一级模块1-1-1", 3);
//        Res res112 = new Res("一级模块1-1-2", 3);
//        List<Res> module2List = new ArrayList<>();
//        module2List.add(res111);
//        module2List.add(res112);
//        res11.setChildList(module2List);
//
//
//        Res res1111 = new Res("菜单1-1-1", 3);
//        Res res1112 = new Res("菜单1-1-2", 3);
//        List<Res> meumList = new ArrayList<>();
//        meumList.add(res1111);
//        meumList.add(res1112);
//        res111.setChildList(module2List);
//
//
//    }
//
//    private Integer remove(List<Res> resList, Integer level) {
//        if (CollectionUtils.isNotEmpty(resList)) {
//            if (level == 1) {
//                return level + 1;
//            }
//            Iterator<Res> it = resList.iterator();
//            while (it.hasNext()) {
//
//                Res res = it.next();
//                Integer aa = remove(res.getChildList(), level - 1);
//                if (aa != level) {
//                    it.remove();
//                }
//            }
//        }
//        if (CollectionUtils.isEmpty(resList)) {
//            return level;
//        }
//
//        return level + 1;
//    }
//
//
//    private boolean remove(List<Res> resList, List<String> ids) {
//        if (CollectionUtils.isNotEmpty(resList)) {
//
//            Iterator<Res> it = resList.iterator();
//            while (it.hasNext()) {
//
//                Res res = it.next();
//                boolean bool = remove(res.getChildList(), ids);
//                if (!bool && !ids.contains(res.getId())) {
//                    it.remove();
//                }
//            }
//        }
//        if (CollectionUtils.isEmpty(resList)) {
//            return false;
//        }
//
//        return true;
//    }


}
