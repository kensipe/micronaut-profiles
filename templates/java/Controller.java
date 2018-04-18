@artifact.package@;

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Controller("/${artifact.name}")
class @artifact.name@Controller {

    @Get("/")
    HttpStatus index() {
        return HttpStatus.OK
    }
}