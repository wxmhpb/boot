package com.bootdo.wuliao.domain;

public class WuliaobaobiaoDO {
    private Integer id;
    private  String wuliaomingcheng;
    private  Integer shengyuliang;
    private Integer xuqiuliang;
    private Integer chae;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWuliaomingcheng() {
        return wuliaomingcheng;
    }

    public void setWuliaomingcheng(String wuliaomingcheng) {
        this.wuliaomingcheng = wuliaomingcheng;
    }

    public Integer getShengyuliang() {
        return shengyuliang;
    }

    public void setShengyuliang(Integer shengyuliang) {
        this.shengyuliang = shengyuliang;
    }

    public Integer getXuqiuliang() {
        return xuqiuliang;
    }

    public void setXuqiuliang(Integer xuqiuliang) {
        this.xuqiuliang = xuqiuliang;
    }

    public Integer getChae() {
        return chae;
    }

    public void setChae(Integer chae) {
        this.chae = chae;
    }

    @Override
    public String toString() {
        return "WuliaobaobiaoDO{" +
                "id=" + id +
                ", wuliaomingcheng='" + wuliaomingcheng + '\'' +
                ", shengyuliang=" + shengyuliang +
                ", xuqiuliang=" + xuqiuliang +
                ", chae=" + chae +
                '}';
    }
}
