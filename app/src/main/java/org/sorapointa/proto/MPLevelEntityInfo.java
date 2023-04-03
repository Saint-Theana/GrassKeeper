package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilitySyncStateInfo.*;
import org.sorapointa.proto.AbilitySyncStateInfo;

public class MPLevelEntityInfo {
    @Tag(tag=2) public AbilitySyncStateInfo abilityInfo = null;
    @Tag(tag=11) public Integer entityId = null;
    @Tag(tag=9) public Integer authorityPeerId = null;
}
