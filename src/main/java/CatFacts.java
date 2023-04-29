
public class CatFacts {
    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;

    public CatFacts(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvote") Integer upvote;

    {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getID() {
        return id;
    }
    public String getText() {
        return text;
    }
    public String getType(){
        return type;
    }
    public String getUser() {
        return user;
    }
    public Integer getUpvotes(){
        return upvotes;
    }
    @Override
    public String toString(){
        return "CatFacts{" +
                "\n      id=`" + id + '\'' +
                ",\n       text=`" + text + '\'' +
                ",\n       type=`" + type + '\'' +
                ",\n       user=`" + user + '\'' +
                ",\n       upvotes=`" + upvotes + '\n }';
    }
}
