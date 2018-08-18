package cn.edu.sdut.gao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试类
 * 
 * @author tx
 *
 */
@Controller
public class TestController {

		@RequestMapping("/test")
		public String test(){
			System.out.println("test URL请求收到");
			return "success";
		}
}
