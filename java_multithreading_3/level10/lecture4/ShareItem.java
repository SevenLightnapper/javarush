package javarush.java_multithreading_3.level10.lecture4;

//This class shows how to call other constructors using 'this'
public class ShareItem {
    public String description;
    public int itemId;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        ShareItem shareItem = (ShareItem) o;

        if (itemId != shareItem.itemId)
            return false;
        if (description != null ? !description.equals(shareItem.description) : shareItem.description != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = description != null ? description.hashCode() : 0;
        result = 31 * result + itemId;
        return result;
    }

    @Override
    public String toString() {
        return "ShareItem{" +
                "description1='" + description + '\'' +
                ", itemId=" + itemId +
                '}';
    }

    public ShareItem() {
        this("Test Item", 0);
    }

    public ShareItem(String description) {
        this(description, 0);
    }

    public ShareItem(int itemId) {
        this("Test Item", itemId);
    }

    public ShareItem(String description, int itemId) {
        this.description = description;
        this.itemId = itemId;
    }

    public String getDescription() {
        return description;
    }

    public int getItemId() {
        return itemId;
    }
}

