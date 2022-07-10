package upgrad;

public class HeadPhones extends Products {
    private String HeadPhoneType;
    private String Warranty;
    private String ConnectorType;
    private String WithMicrophone;
    private String Color;
    private String AdditionalFeatures;
    private String ItemWeight;

    public String getHeadPhoneType() {
        return HeadPhoneType;
    }

    public void setHeadPhoneType(String headPhoneType) {
        this.HeadPhoneType = headPhoneType;
    }

    public String getWarranty() {
        return Warranty;
    }

    public void setWarranty(String warranty) {
        Warranty = warranty;
    }

    public String getConnectorType() {
        return ConnectorType;
    }

    public void setConnectorType(String connectorType) {
        ConnectorType = connectorType;
    }

    public String getWithMicrophone() {
        return WithMicrophone;
    }

    public void setWithMicrophone(String withMicrophone) {
        WithMicrophone = withMicrophone;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getAdditionalFeatures() {
        return AdditionalFeatures;
    }

    public void setAdditionalFeatures(String additionalFeatures) {
        AdditionalFeatures = additionalFeatures;
    }

    public String getItemWeight() {
        return ItemWeight;
    }

    public void setItemWeight(String itemWeight) {
        ItemWeight = itemWeight;
    }
}