public class Regulation implements Document{
    private String signatures = "";
    @Override
    public void sign(String name) {
        if (this.signatures.length()>0)
            this.signatures += ", ";
        this.signatures += name;
    }
    @Override
    public String getSignatures() { return
            this.signatures; }
    @Override
    public void printInfo() {
        System.out.println("Regulation info: \n" +
                "Title: Regulation \n" +
                "Signed by: " +
                this.signatures);
    }
}