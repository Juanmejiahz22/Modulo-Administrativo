@RestController
public class PingController {

    @GetMapping("/")
    public String ping() {
        return "Servidor desplegado correctamente.";
    }
}

