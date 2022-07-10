package upgrad;

public class Cameras extends Products {
    private String EffectivePixels;
    private String Zoom;
    private String VideoResolution;
    private String ShutterSpeed;
    private String Dimension;
    private String Weight;

    public String getEffectivePixels() {
        return EffectivePixels;
    }

    public void setEffectivePixels(String effectivePixels) {
        EffectivePixels = effectivePixels;
    }

    public String getZoom() {
        return Zoom;
    }

    public void setZoom(String zoom) {
        Zoom = zoom;
    }

    public String getVideoResolution() {
        return VideoResolution;
    }

    public void setVideoResolution(String videoResolution) {
        VideoResolution = videoResolution;
    }

    public String getShutterSpeed() {
        return ShutterSpeed;
    }

    public void setShutterSpeed(String shutterSpeed) {
        ShutterSpeed = shutterSpeed;
    }

    public String getDimension() {
        return Dimension;
    }

    public void setDimension(String dimension) {
        Dimension = dimension;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }
}
