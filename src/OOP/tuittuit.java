package OOP;

import java.util.ArrayList;

public class tuittuit {
    private String userid;
    private String userName;
    private String fullName;
    private ArrayList<String> userProject;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<String> getUserProject() {
        return userProject;
    }

    public void setUserProject(ArrayList<String> userProject) {
        this.userProject = userProject;
    }

    public tuittuit(){//contractor

    }
    public tuittuit(String id, String usr, String name, ArrayList<String> poost){
        this.userid=id;
        this.userName=usr;
        this.fullName=name;
        this.userProject=poost;
    }

    public static void main(String[] args) {
        tuittuit user1 = new tuittuit();
        user1.setUserid("arab");
        user1.setUserName("gila");
        user1.setFullName("arabgila");

        ArrayList<String> massage = new ArrayList<>();
        massage.add("hello");
        massage.add("ok");
        massage.add("blokkk");

        user1.setUserProject(massage);
    }
}
