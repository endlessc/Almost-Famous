package com.liema.game.role.controller;

import com.alibaba.fastjson.JSONObject;
import com.liema.common.bean.AttrCode;
import com.liema.common.global.Action;
import com.liema.common.global.Resoult;
import com.liema.game.base.RegisterProtocol;
import com.liema.game.role.entity.Role;
import com.liema.game.role.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class RoleAttrAction extends Action {

    @Autowired
    RoleService roleService;

    @Override
    public Resoult execute(JSONObject jsonObject, HttpServletRequest request, HttpServletResponse response) {
        Integer attrId = jsonObject.getInteger("attrId");
        AttrCode a = AttrCode.parase(attrId);
        Role role = roleService.selectByRoleId(rid);

        long attrVal = 0;
        switch (a) {
            case GOLD:
                attrVal = role.getGold();
                break;
            case DIAMOND:
                attrVal = role.getDiamond();
                break;
            case SILVER:
                attrVal = role.getSilver();
                break;
        }

        Map<String, Object> data = new HashMap<>();
        data.put("attrId", attrId);
        data.put("attrVal", attrVal);
        data.put("rid", rid);
        return Resoult.ok(RegisterProtocol.ROLE_ATTR_ACTION_RESP).responseBody(data);
    }
}
