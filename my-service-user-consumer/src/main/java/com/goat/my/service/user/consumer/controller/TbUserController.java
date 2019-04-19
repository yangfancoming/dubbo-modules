package com.goat.my.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.goat.my.commons.domain.User;
import com.goat.my.service.user.api.TbUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "user")
public class TbUserController {

    @Reference(version = "${services.versions.user.v1}")
    private TbUserService userService;

    /**
     * 跳转到列表页
     *
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(Model model) {
        List<User> users = userService.selectAll();
        model.addAttribute("users",users);
        return "user/list";
    }

//    @ResponseBody
//    @RequestMapping(value = "test", method = RequestMethod.GET)
//    public DataTableDTO<User> page(HttpServletRequest request, User tbUser) {
//        String strDraw = request.getParameter("draw");
//        String strStart = request.getParameter("start");
//        String strLength = request.getParameter("length");
//
//        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
//        int start = strStart == null ? 0 : Integer.parseInt(strStart);
//        int length = strLength == null ? 10 : Integer.parseInt(strLength);
//
//        // 封装 Datatables 需要的结果
//        PageInfo<User> pageInfo = tbUserService.page(start, length, tbUser);
//        DataTableDTO<User> dataTableDTO = new DataTableDTO<>();
//        dataTableDTO.setData(pageInfo.getList());
//        dataTableDTO.setDraw(draw);
//        dataTableDTO.setRecordsTotal(pageInfo.getTotal());
//        dataTableDTO.setRecordsFiltered(pageInfo.getTotal());
//
//        return dataTableDTO;
//    }
}
