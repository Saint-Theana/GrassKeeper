package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AbilityMixinWindSeedSpawner {
    public static class AddSignal {
    }

    public static class RefreshSeed {
        @Tag(tag=6) public List<Vector> posList = new ArrayList<>();
    }

    public static class CatchSeed {
        @Tag(tag=8) public Integer entityId = null;
    }

    @Tag(tag=2) public AddSignal addSignal = null;
    @Tag(tag=15) public RefreshSeed refreshSeed = null;
    @Tag(tag=11) public CatchSeed catchSeed = null;
}
