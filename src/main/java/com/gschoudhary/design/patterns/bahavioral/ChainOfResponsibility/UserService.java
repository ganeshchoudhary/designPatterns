package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility;

import com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.classLevel.BaseHandler;
import com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.classLevel.IPCheckHandler;
import com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.classLevel.TokenCheckHandler;

public class UserService {


    public void execute(Request request){

//        we can also use Autowired with List<handlers> {composite object + list of handlers
//        Request.filter(f1).filter(f2).filter(f3).hanldle();
//        void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)


//        LinkedList of handlers
        request= new Request();
        request.ip="124a";
        request.token="qwedhj";
        BasicHandler basicHandler = new BasicHandler();
        basicHandler.a=20;
        basicHandler.add(new IPHandler());
        basicHandler.add(new TokenHandler());

        basicHandler.handle(request);

        System.out.println("start second");
        request.token= null;
        BaseHandler baseHandler = new BaseHandler(new TokenCheckHandler(new IPCheckHandler(null)));
        baseHandler.handle(request);
        System.out.println("done " + request);
    }
}
