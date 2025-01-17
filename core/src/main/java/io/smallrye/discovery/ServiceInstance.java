package io.smallrye.discovery;

public final class ServiceInstance {

    private final String id;

    private final String value;

    public ServiceInstance(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
