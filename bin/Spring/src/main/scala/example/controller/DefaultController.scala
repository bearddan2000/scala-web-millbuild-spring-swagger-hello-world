package example.controller

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
class DefaultController {

  @RequestMapping
  def index() = "hello world"
}
