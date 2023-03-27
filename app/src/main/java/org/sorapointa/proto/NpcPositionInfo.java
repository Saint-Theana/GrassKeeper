package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class NpcPositionInfo {
    @Tag(tag=1) public Integer npcId = null;
    @Tag(tag=2) public Vector pos = null;
}
