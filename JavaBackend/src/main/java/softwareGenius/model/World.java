package softwareGenius.model;

public class World {
    private final Integer worldId;
    private final Integer ownerId;
    private final String category;

    public World(Integer worldId, Integer ownerId, String category) {
        this.worldId = worldId;
        this.ownerId = ownerId;
        this.category = category;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getCategory() {
        return category;
    }

    public Integer getWorldId() {
        return worldId;
    }
}