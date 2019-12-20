public class ContractFactory implements
        DocumentFactory {
    @Override
    public Document getDocument() {
        return new Contract();
    }
}
