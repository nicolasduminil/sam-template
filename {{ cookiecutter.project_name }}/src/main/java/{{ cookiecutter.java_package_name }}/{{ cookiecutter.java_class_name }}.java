package {{ cookiecutter.java_package_name }};

import java.util.Map;
import java.util.stream.Collectors;
import java.util.logging.Logger;

public class {{ cookiecutter.java_class_name }} 
{
   private static Logger log = Logger.getLogger({{ cookiecutter.java_class_name }}.class.getName());

  public String {{ cookiecutter.java_handler_method_name }} (Map<String, String> event) 
  {
    log.info("*** AwsLambdaSimple.handleRequest: Have received: " + event);
    return event.entrySet().stream().map(e -> e.getKey() + " " + e.getValue()).collect(Collectors.joining());
  }
}
