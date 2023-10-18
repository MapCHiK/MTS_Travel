import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class YandexMapsLocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sca2 = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите название объекта: ");
        String location = scanner.nextLine();
        scanner.close();
        String locationReplaced = location.replaceAll(" ", "%20");
        String query = "https://maps.yandex.ru/?text=" + locationReplaced;
        String nearby = "https://maps.yandex.ru/?text=достопримечательности%20и%20отели%20рядом%20с%20" + locationReplaced;

        try {
            Desktop.getDesktop().browse(new URI(query));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        try {
            Desktop.getDesktop().browse(new URI(nearby));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
} }