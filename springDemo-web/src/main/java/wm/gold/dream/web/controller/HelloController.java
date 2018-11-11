package wm.gold.dream.web.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wm.gold.dream.web.Validator.AccountValidator;
import wm.gold.dream.web.beans.Account;

import javax.validation.Valid;

/**
 * Created by sang on 16-12-15.
 */
@Controller
public class HelloController {

//    http请求headers的Content-Type指定请求数据的格式，Accept指定返回数据的格式，如果服务器做不到就返回HttpMediaTypeNotSupportedException

    @RequestMapping(value = "/hello")
    @ResponseBody
    public Object hello(@Valid @RequestBody Account account) {
            return account;
    }

    @RequestMapping(value = "/hello",produces = MediaType.TEXT_HTML_VALUE)
    public Object hello2(@Valid @RequestBody Account account) {
        return "index";
    }



//    加上 @ResponseBody 后返回结果不会被解析为跳转路径，而是直接写入 HTTP response body 中

//    @RequestBody是作用在形参列表上，用于将前台发送过来固定格式的数据【xml 格式或者 json等】封装为对应的 JavaBean 对象，封装时使用到的一个对象是系统默认配置的 HttpMessageConverter进行解析，然后封装到形参上。


    //自定义效验器
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new AccountValidator());
    }
}
