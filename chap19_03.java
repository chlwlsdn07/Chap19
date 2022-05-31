// 람다식 예제 MyValue
public class chap19_03 {
    private String name;
    private String uniqueId;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getUniqueId(){
        return uniqueId;
    }
    public void setUniqueId(String uniqueId){
        this.uniqueId = uniqueId;
    }
    @Override
    public String toString(){
        return "MyValue [name="+name +", uniqueid=" +uniqueId+"]";
    }
}
