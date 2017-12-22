package com.example.demo.handler;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :小虎
 * @date :2017/12/22
 */

@ControllerAdvice
public class GlobalDefaultExceptionHandler {


    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {}

    /**
     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
     * @param model
     */
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("author", "Magical Sam");
    }

    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception ex) {
         /*
        *返回json数据或者String数据：
        *那么需要在方法上加上注解：@ResponseBody
        *添加return即可。
        */

       /*
        *返回视图：
        *定义一个ModelAndView即可，
        *然后return;
        *定义视图文件(比如：error.html,error.ftl,error.jsp);
        *
        */
        Map map = new HashMap();
        map.put("code", 200);
        map.put("msg", ex.getMessage());
        return map;
    }

    /**
     * 拦截捕捉自定义异常 MyException.class
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public Map myErrorHandler(MyException ex) {
        Map map = new HashMap();
        map.put("code", ex.getCode());
        map.put("msg", ex.getMsg());
        return map;
    }
}
