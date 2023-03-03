package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilitySyncStateInfo.*;
import org.sorapointa.proto.AbilitySyncStateInfo;

public class TeamEntityInfo {
    @Tag(tag=10) public Integer authorityPeerId = null;
    @Tag(tag=9) public AbilitySyncStateInfo teamAbilityInfo = null;
    @Tag(tag=8) public Integer teamEntityId = null;
}
