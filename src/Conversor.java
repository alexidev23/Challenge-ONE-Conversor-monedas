import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public static void mostrarMenu() {
        System.out.println("""
                ******************************************************************************  
                Sea bienvenido/a al Conversor de Moneda

                1) Dólar → Peso argentino
                2) Peso argentino → Dólar
                3) Dólar → Real brasileño
                4) Real brasileño → Dólar
                5) Dólar → Peso colombiano
                6) Peso colombiano → Dólar
                7) Salir  
                ******************************************************************************  
                """);
    }

    public MonedasConversor obtenerConversion(String moneda1, String moneda2, double monto) {
        String url = "https://v6.exchangerate-api.com/v6/aa94845f955ce683a10bb1ca/pair/"
                + moneda1 + "/" + moneda2 + "/" + monto;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), MonedasConversor.class);

        } catch (Exception e) {
            throw new RuntimeException("No se pudo realizar la conversión de moneda.", e);
        }
    }
}
