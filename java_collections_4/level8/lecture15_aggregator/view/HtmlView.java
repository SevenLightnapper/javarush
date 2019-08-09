package javarush.java_collections_4.level8.lecture15_aggregator.view;

import javarush.java_collections_4.level8.lecture15_aggregator.Controller;
import javarush.java_collections_4.level8.lecture15_aggregator.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class HtmlView implements View {
    private final String filePath = "./src/" +
            this.getClass().getPackage().getName().replace('.', '/') + "/vacancies.html";
    private Controller controller;

    @Override
    public void update(List<Vacancy> vacancies) {
        System.out.println(filePath);
        try {
            updateFile(getUpdatedFileContent(vacancies));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void userCitySelectEmulationMethod() {
        controller.onCitySelect("Saint-Petersburg");
    }

    private String getUpdatedFileContent(List<Vacancy> vacancies) {
        String fileContent = null;

        try {
            //получаем файл
            Document document = getDocument();

            //Находим блок (элемент с упоминанием в имени класса template)
            Element templateElement = document.getElementsByClass("template").first();
            //Делаем копию этого элемента
            Element cleanElement = templateElement.clone();
            //удаляем с неe лишние аттрибуты и классы
            cleanElement.removeAttr("style");
            cleanElement.removeClass("template");
            //чистим ранее добавленные вакансии в этом файле
            document.select("tr[class=vacancy]").remove();

            //добавляем вакансии
            for (Vacancy vacancy : vacancies) {
                //делаем новую копию скопированного уже чистого элемента
                Element vacancyElement = cleanElement.clone();
                //и заполняем его данными по текущей вакансии
                vacancyElement.getElementsByClass("city").first().text(vacancy.getCity());
                vacancyElement.getElementsByClass("companyName").first().text(vacancy.getCompanyName());
                vacancyElement.getElementsByClass("salary").first().text(vacancy.getSalary());
                //создаем ссылку
                Element link = vacancyElement.getElementsByTag("a").first();
                link.text(vacancy.getTitle());
                link.attr("href", vacancy.getUrl());
                //добавляем outerHtml элемента в который мы записывали данные вакансии,
                // непосредственно перед шаблоном <tr class="vacancy template" style="display: none">
                templateElement.before(vacancyElement.outerHtml());
            }

            //возвращаем код всего документа
            fileContent = document.html();

        } catch (IOException e) {
            e.printStackTrace();
            fileContent = "Some exception occurred";
        }

        return fileContent;
    }

    private void updateFile(String content) {
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            outputStream.write(content.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected Document getDocument() throws IOException {
        return Jsoup.parse(
                new File(filePath), "UTF-8");
    }
}

