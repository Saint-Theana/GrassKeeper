package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AbilityMixinWindSeedSpawner {
    public static class AbilityMixinWindSeedSpawner_AddSignal {
    }

    public static class AbilityMixinWindSeedSpawner_RefreshSeed {
        @Tag(tag=1) public List<Vector> posList = new ArrayList<>();
    }

    public static class AbilityMixinWindSeedSpawner_CatchSeed {
        @Tag(tag=5) public Integer entityId = null;
    }

    @Tag(tag=13) public AbilityMixinWindSeedSpawner_AddSignal addSignal = null;
    @Tag(tag=3) public AbilityMixinWindSeedSpawner_RefreshSeed refreshSeed = null;
    @Tag(tag=4) public AbilityMixinWindSeedSpawner_CatchSeed catchSeed = null;
}
