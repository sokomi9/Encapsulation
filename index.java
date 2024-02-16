class Music
{
    private String genre;
    private String name;
    
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    }

public class index
{
    public static void main(String[] args) {
        Music obj1 = new Music();
        obj1.setGenre("Hiphop");
        obj1.setName("High Definition");
        System.out.println(obj1.getGenre());
        System.out.println(obj1.getName());
    }
}