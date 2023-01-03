package {{ cookiecutter.java_package_name }};

public class {{ cookiecutter.java_class_name }} 
{
  private static String message = System.getenv("message");

  public {{ cookiecutter.java_class_name }}() 
  {
    System.out.printf("*** {{ cookiecutter.java_class_name }}: Have initialized with configuration: %s", message);
  }

  public String {{ cookiecutter.java_handler_method_name }} (Map<String, String> event) 
  {
    System.out.println("*** {{ cookiecutter.java_class_name }}.{{ cookiecutter.java_handler_method_name }}: Have received: " + event);
    return event.entrySet().stream().map(e -> e.getKey() + "->" + e.getValue()).collect(Collectors.joining(","));
  }
}
