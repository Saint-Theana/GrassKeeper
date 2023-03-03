package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityControlBlock.*;
import org.sorapointa.proto.AbilityControlBlock;
import org.sorapointa.proto.AbilitySyncStateInfo.*;
import org.sorapointa.proto.AbilitySyncStateInfo;

public class TeamEnterSceneInfo {
    @Tag(tag=7) public AbilityControlBlock abilityControlBlock = null;
    @Tag(tag=10) public AbilitySyncStateInfo teamAbilityInfo = null;
    @Tag(tag=15) public Integer teamEntityId = null;
}
