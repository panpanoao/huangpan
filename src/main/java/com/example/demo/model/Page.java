package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 分页类
 * @param <T>
 */
public class Page<T> implements Serializable {
    /**
     * 总集合
     */
    private List<T>  list;
    /**
     * 分页的集合
     */
    private List<T> pageList;
    /**
     * 当前页
     */
    private int page;
    /**
     * 显示的行数
     */
    private int rows;
    /**
     * 底部页码
     */
    private int[] nav;
    /**
     * 集合总数
     */
    private int count;
    /**
     * 第一页
     */
    private int firstpage;
    /**
     * 最后一页
     */
    private int lastpage;

    /**
     *
     * @param list
     * @param page
     * @param rows
     */
    public   Page(List<T> list,int page,int rows){
        this.list=list;
        this.page=page;
        this.rows=rows;
        List<T> lists=new ArrayList<>();
        page=(page-1)*rows;
       for(int i=page;i<page+rows;i++){
        lists.add(list.get(page+i));
     }
        this.pageList=lists;
        this.count=list.size();
        int[] navlist=new int[getnavs()];
            int a=1;
        for (int i=0;i<=navlist.length-1;i++){
            navlist[i]=0+a;
            a++;
        }
        this.nav=navlist;
        this.firstpage=1;
        this.lastpage=getnavs();
    }


    /**
     *得到页码
     * @return
     */
    public int getnavs(){
        if(count%rows==0){
            return count/rows;
        }else{
            return count/rows+1;
        }
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public List<T> getPageList() {
        return pageList;
    }

    public void setPageList(List<T> pageList) {
        this.pageList = pageList;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int[] getNav() {
        return nav;
    }

    public void setNav(int[] nav) {
        this.nav = nav;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getFirstpage() {
        return firstpage;
    }

    public void setFirstpage(int firstpage) {
        this.firstpage = firstpage;
    }

    public int getLastpage() {
        return lastpage;
    }

    public void setLastpage(int lastpage) {
        this.lastpage = lastpage;
    }
}
