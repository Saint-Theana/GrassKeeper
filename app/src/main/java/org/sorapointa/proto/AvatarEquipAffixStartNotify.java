package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarEquipAffixInfo.*;
import org.sorapointa.proto.AvatarEquipAffixInfo;

public class AvatarEquipAffixStartNotify {
    @Tag(tag=4) public Long avatarGuid = null;
    @Tag(tag=12) public AvatarEquipAffixInfo equipAffixInfo = null;
}
