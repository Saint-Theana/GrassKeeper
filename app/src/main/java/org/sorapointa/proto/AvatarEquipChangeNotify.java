package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SceneReliquaryInfo.*;
import org.sorapointa.proto.SceneReliquaryInfo;
import org.sorapointa.proto.SceneWeaponInfo.*;
import org.sorapointa.proto.SceneWeaponInfo;

public class AvatarEquipChangeNotify {
    @Tag(tag=10) public Long avatarGuid = null;
    @Tag(tag=13) public Long equipGuid = null;
    @Tag(tag=1) public SceneReliquaryInfo reliquary = null;
    @Tag(tag=15) public SceneWeaponInfo weapon = null;
    @Tag(tag=14) public Integer itemId = null;
    @Tag(tag=8) public Integer equipType = null;
}
