package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityControlBlock.*;
import org.sorapointa.proto.AbilityControlBlock;
import org.sorapointa.proto.AbilitySyncStateInfo.*;
import org.sorapointa.proto.AbilitySyncStateInfo;

public class TeamEnterSceneInfo {
    @Tag(tag=4) public Integer teamEntityId = null;
    @Tag(tag=12) public AbilityControlBlock abilityControlBlock = null;
    @Tag(tag=10) public AbilitySyncStateInfo teamAbilityInfo = null;
}
