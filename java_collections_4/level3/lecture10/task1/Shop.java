package javarush.java_collections_4.level3.lecture10.task1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(name = "shop")
@XmlRootElement
public class Shop {

    public Goods goods;
    public int count;
    public double profit;
    public String[] secretData;

    @XmlType(name = "goods")
    public static class Goods{
        @XmlElement
        public List<String> names = new ArrayList<>();
    }
}

