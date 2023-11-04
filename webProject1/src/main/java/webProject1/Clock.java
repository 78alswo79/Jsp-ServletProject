package webProject1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
	public String now() {
		SimpleDateFormat format = new SimpleDateFormat("HH시 mm분 ss초");
		return format.format(new Date());
	}
	
	
	
	/*
	 * context root : 웹 어플리케이션의 실제 컨텍스트 경로.
	 * 형식은 http:서버:포트/[context root]가 되겠다.
	 * 
	 * content directory : JSP, HTML, 이미지, WEB-INF 폴더가 위치할 폴더.
	 * 톰캣은 이 폴더 안에서 보여줄 JSP를 보여준다.
	 * */
}
