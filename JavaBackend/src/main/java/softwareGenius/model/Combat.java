package softwareGenius.model;

import java.time.LocalDateTime;

public class Combat {

    private Integer combatId;

    private Integer difficultyLevel;

    /** The mode the of the combat: battle or duel. */
    private String mode;

    private Integer playerId;

    private Integer npcId;

    /** The status includes pending, failed, succeeded. */
    private String status;

    /** The time when the combat begins. */
    private LocalDateTime combatTime;

    public Combat(Integer combatId, Integer difficultyLevel, String mode, Integer playerId, Integer npcId, String status) {
        this.combatId = combatId;
        this.difficultyLevel = difficultyLevel;
        this.mode = mode;
        this.playerId = playerId;
        this.npcId = npcId;
        this.status = status;
    }

    public Integer getCombatId() {
        return combatId;
    }

    public void setCombatId(Integer combatId) {
        this.combatId = combatId;
    }

    public Integer getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(Integer difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getNpcId() {
        return npcId;
    }

    public void setNpcId(Integer npcId) {
        this.npcId = npcId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCombatTime() {
        return combatTime;
    }

    public void setCombatTime(LocalDateTime combatTime) {
        this.combatTime = combatTime;
    }
}
