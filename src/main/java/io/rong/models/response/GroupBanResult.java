package io.rong.models.response;

import io.rong.models.Result;
import io.rong.models.group.GroupModel;
import io.rong.util.GsonUtil;

public class GroupBanResult extends Result {
    public GroupBanResult(Integer code, String errorMessage, GroupModel[] groups) {
        super(code, errorMessage);
        this.groups = groups;
    }

    private GroupModel[] groups;

    public GroupModel[] getGroups() {
        return groups;
    }

    public void setGroups(GroupModel[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return GsonUtil.toJson(this, GroupBanResult.class);
    }
}
