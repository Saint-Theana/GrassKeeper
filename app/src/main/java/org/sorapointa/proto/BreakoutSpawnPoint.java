package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BreakoutSpawnPoint {
    @Tag(tag=1) public Integer id = null;
    @Tag(tag=2) public Integer brickSuiteId = null;
    @Tag(tag=3) public List<BreakoutPhysicalObject> spawnedBrickList = new ArrayList<>();
}
