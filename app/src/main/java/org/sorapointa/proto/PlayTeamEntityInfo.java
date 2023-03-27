package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayTeamEntityInfo {
    @Tag(tag=1) public Integer entityId = null;
    @Tag(tag=2) public Integer playerUid = null;
    @Tag(tag=3) public Integer authorityPeerId = null;
    @Tag(tag=5) public Integer gadgetConfigId = null;
    @Tag(tag=6) public AbilitySyncStateInfo abilityInfo = null;
}
