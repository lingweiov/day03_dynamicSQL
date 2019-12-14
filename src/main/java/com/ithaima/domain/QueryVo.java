package com.ithaima.domain;/*
@outhor shkstart
@date 2019/12/12-16:22
*/

import java.util.List;

public class QueryVo {
    private User user;
    private List<Integer> ids;

    public User getUser() {
        return user;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
