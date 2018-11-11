package wm.gold.dream.web.exceptionResolver;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: wangmeng
 * @Date: 2018/11/4 13:06
 * @Version 1.0
 */
public class AllExceptionResolver  implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("errorPage");

        //不返回null就是能处理
        return modelAndView;
    }
}
