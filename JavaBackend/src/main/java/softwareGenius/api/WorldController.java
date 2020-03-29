package softwareGenius.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import softwareGenius.model.Category;
import softwareGenius.model.LeaderBoardRecord;
import softwareGenius.model.World;
import softwareGenius.service.LandService;
import softwareGenius.service.LeaderboardService;
import softwareGenius.service.WorldService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("api/world")
@RestController
public class WorldController {
    private WorldService worldService;
    private LeaderboardService leaderboardService;
    private LandService landService;

    @GetMapping("/getWorldByWorldId/{worldId}")
    public World getWorldByWorldId(@PathVariable Integer worldId) {
        return worldService.getWorldByWorldId(worldId);
    }

    @GetMapping("/getWorldByUserId/{userId}")
    public List<World> getAllWorldByUser(@PathVariable Integer userId) {
        return worldService.getWorldByOwnerId(userId);
    }

    @GetMapping("/getLeaderBoard/all/{offset}/{limit}")
    public List<List<LeaderBoardRecord>> getAllLeaderBoard(@PathVariable Integer offset,@PathVariable Integer limit) {
        return leaderboardService.getAllLeaderBoard(offset,limit);
    }

    @GetMapping("/getLeaderBoard/general/{offset}/{limit}")
    public List<LeaderBoardRecord> getGeneralLeaderBoard(@PathVariable Integer offset,@PathVariable Integer limit) {
        return leaderboardService.getGeneralLeaderBoard(offset,limit);
    }

    @GetMapping("/getLeaderBoard/category/{category}/{offset}/{limit}")
    public List<LeaderBoardRecord> getLeaderBoardByWorldName(@PathVariable Category category,@PathVariable Integer offset,@PathVariable Integer limit) {
        return leaderboardService.getLeaderBoardByWorldName(category,offset,limit);
    }

    @PostMapping("/changeOwner/{landId}/{ownerId}/{difficulty}")
    public void changeOwner(@PathVariable Integer landId,@PathVariable Integer ownerId,@PathVariable Integer difficulty) {
        landService.changeOwner(landId,ownerId,difficulty);
    }

    @PostMapping("/unlock/{worldId}")
    public void unlockWorld(@PathVariable Integer worldId) {
        worldService.unlockWorld(worldId);
    }

}
