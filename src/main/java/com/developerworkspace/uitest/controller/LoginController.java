package com.developerworkspace.uitest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/data/config.json")
    @ResponseBody
    public String configPage() {
        return "{\n" +
                "success: true,\n" +
                "config: [{\n" +
                "\t\tname: 'BRS Prod URL', value: 'http://10.214.160.35:8185/tipinterface-b35'\n" +
                "\t},{\n" +
                "\t\tname: 'BRS Dev URL', value: 'http://10.214.160.35:8185/tipinterface-b35'\n" +
                "\t}]\n" +
                "}";
    }

    @RequestMapping("data/automatic.json")
    @ResponseBody
    public String automaticconfig() {
        return "{\n" +
                "success: true,\n" +
                "dataview: [{\n" +
                "\t\tname: 'Analysis', url: 'http://www.freeiconspng.com/uploads/seo-analysis-icon-16.png', size: '123', lastmod : 'sdd'\n" +
                "\t},{\n" +
                "\t\tname: 'A | B Test', url: 'https://cdn2.iconfinder.com/data/icons/usability-test-02/100/jan_yulck-53-512.png', size: '123', lastmod : 'sdd'\n" +
                "\t},{\n" +
                "\t\tname: 'Reports', url: 'http://www.freeiconspng.com/uploads/call-report-icon-3.png', size: '123', lastmod : 'sdd'\n" +
                "\t}]\n" +
                "}";
    }

    @RequestMapping("data/manual.json")
    @ResponseBody
    public String manualconfig() {
        return "{\n" +
                "success: true,\n" +
                "dataview: [{\n" +
                "\t\tname: 'New Testing', url: 'https://openclipart.org/image/2400px/svg_to_png/245288/test-tube-1-2016032922.png', component: 'ESMG.view.components.TestPanel', lastmod : 'sdd'\n" +
                "\t},{\n" +
                "\t\tname: 'Analysis', url: 'https://cdn3.iconfinder.com/data/icons/digital-marketing/512/search_magnifier_lens_loupe_flat_icon-512.png', component: 'ESMG.view.department.List', lastmod : 'sdd'\n" +
                "\t},{\n" +
                "\t\tname: 'A | B Test', url: 'https://cdn2.iconfinder.com/data/icons/usability-test-02/100/jan_yulck-53-512.png', component: 'ESMG.view.department.List', lastmod : 'sdd'\n" +
                "\t},{\n" +
                "\t\tname: 'Reports', url: 'http://www.freeiconspng.com/uploads/call-report-icon-3.png', component: 'ESMG.view.department.List', lastmod : 'sdd'\n" +
                "\t}]\n" +
                "}";
    }

}
