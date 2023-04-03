package ru.netology.servlet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.servlet.http.HttpServlet;
public class MainServlet extends HttpServlet {


  private final static String METHOD_GET = "GET";
  private final static String METHOD_POST = "POST";
  private final static String METHOD_DELETE = "DELETE";

  final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.netology");


  final AnnotationConfigApplicationContext controller = (AnnotationConfigApplicationContext) context.getBean("postController");

    final AnnotationConfigApplicationContext service = context.getBean(AnnotationConfigApplicationContext.class);

   final boolean isSame = service == context.getBean("postService");


}

