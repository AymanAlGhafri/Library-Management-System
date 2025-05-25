Java Code:
java
Copy
Edit
public class Member {
    private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayMember() {
        System.out.println("Name: " + name);
        System.out.println("Member ID: " + memberId);
    }
}
