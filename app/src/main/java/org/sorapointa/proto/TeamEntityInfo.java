package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilitySyncStateInfo.*;
import org.sorapointa.proto.AbilitySyncStateInfo;

public class TeamEntityInfo {
    @Tag(tag=8) public AbilitySyncStateInfo teamAbilityInfo = null;
    @Tag(tag=2) public Integer teamEntityId = null;
    @Tag(tag=12) public Integer authorityPeerId = null;
}
