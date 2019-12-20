public class RegulationFactory implements
        DocumentFactory {
    @Override
    public Document getDocument() {
        return new Regulation();
    }
}
