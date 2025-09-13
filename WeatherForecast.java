
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WeatherForecast {
    public static void main(String[] args) {
        // Coordonnées La Présentation (QC)
        double latitude = 45.6654;
        double longitude = -73.0509;

        String url = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude
                + "&longitude=" + longitude
                + "&hourly=temperature_2m,precipitation,precipitation_probability,"
                + "pressure_msl,surface_pressure,vapour_pressure_deficit,"
                + "et0_fao_evapotranspiration,wind_speed_10m,shortwave_radiation"
                + "&windspeed_unit=kmh"
                + "&timezone=America%2FToronto";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            // Extraire le bloc "hourly"
            String hourly = json.substring(json.indexOf("\"hourly\":{"));

            // Tableaux horaires
            String times                 = extractArray(hourly, "\"time\":");
            String temperatures          = extractArray(hourly, "\"temperature_2m\":");
            String precipitations        = extractArray(hourly, "\"precipitation\":");
            String precipProbabilities   = extractArray(hourly, "\"precipitation_probability\":");
            String pressureMsl           = extractArray(hourly, "\"pressure_msl\":");
            String surfacePressure       = extractArray(hourly, "\"surface_pressure\":");
            String vpd                   = extractArray(hourly, "\"vapour_pressure_deficit\":");
            String et0                   = extractArray(hourly, "\"et0_fao_evapotranspiration\":");
            String windKmh               = extractArray(hourly, "\"wind_speed_10m\":");
            String shortwaveRadiation    = extractArray(hourly, "\"shortwave_radiation\":");

            // Préparer les tableaux
            String[] timeArray   = times.split(",");
            String[] tempArray   = temperatures.split(",");
            String[] precipArray = precipitations.split(",");
            String[] pprobArray  = precipProbabilities.split(",");
            String[] pmslArray   = pressureMsl.split(",");
            String[] psfcArray   = surfacePressure.split(",");
            String[] vpdArray    = vpd.split(",");
            String[] et0Array    = et0.split(",");
            String[] windArray   = windKmh.split(",");
            String[] swrArray    = shortwaveRadiation.split(",");

            DateTimeFormatter inFmt  = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
            DateTimeFormatter outFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            LocalDateTime now = LocalDateTime.now();

            System.out.println("Prévisions météo pour La Présentation — prochaines 12 heures :");

            int printed = 0;
            for (int i = 0; i < timeArray.length && printed < 48; i++) {
                String time = cleanStr(timeArray[i]);
                LocalDateTime t = LocalDateTime.parse(time, inFmt);
                if (t.isAfter(now)) {
                    double temp      = parseD(tempArray[i]);
                    double precip    = parseD(precipArray[i]);
                    Integer pprob    = parseIOrNull(pprobArray[i]); // peut être null selon les modèles
                    double pMsl      = parseD(pmslArray[i]);        // hPa
                    double pSfc      = parseD(psfcArray[i]);        // hPa
                    double vpdVal    = parseD(vpdArray[i]);         // kPa
                    double et0Val    = parseD(et0Array[i]);         // mm/h
                    double windVal   = parseD(windArray[i]);        // km/h
                    double swrVal    = parseD(swrArray[i]);         // W/m²

                    System.out.printf(
                        "%s : %.1f°C | Pluie: %.1f mm | P(pluie): %s | Pmsl: %.0f hPa | Psol: %.0f hPa | VPD: %.2f kPa | ET0: %.2f mm/h | Vent: %.1f km/h | Rad: %.0f W/m²%n",
                        t.format(outFmt),
                        temp,
                        precip,
                        (pprob == null ? "—" : (pprob + "%")),
                        pMsl, pSfc, vpdVal, et0Val, windVal, swrVal
                    );
                    printed++;
                }
            }
        } catch (Exception e) {
            System.err.println("Erreur lors de la récupération des données : " + e.getMessage());
        }
    }

    // --- Helpers ---

    // Extrait la première occurrence d'un tableau JSON après la clé donnée (très simpliste)
    private static String extractArray(String json, String key) {
        int start = json.indexOf(key);
        if (start < 0) return "[]";
        start += key.length();
        int end = json.indexOf("]", start);
        if (end < 0) return "[]";
        return json.substring(start, end + 1);
    }

    private static String cleanStr(String s) {
        // pour les dates: enlever [ ] et "
        return s.replace("[", "").replace("]", "").replace("\"", "");
    }

    private static double parseD(String s) {
        // pour les nombres: enlever [ ] puis parser
        String x = s.replace("[", "").replace("]", "").trim();
        if (x.equals("null") || x.isEmpty()) return Double.NaN;
        return Double.parseDouble(x);
    }

    private static Integer parseIOrNull(String s) {
        String x = s.replace("[", "").replace("]", "").trim();
        if (x.equals("null") || x.isEmpty()) return null;
        return Integer.parseInt(x);
    }
}

