package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AISnapshotEntityData.*;
import org.sorapointa.proto.AISnapshotEntityData;

public class AISnapshotInfo {
    @Tag(tag=14) public List<AISnapshotEntityData> aiSnapshots = new ArrayList<>();
}
