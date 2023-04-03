package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SceneReliquaryInfo.*;
import org.sorapointa.proto.SceneReliquaryInfo;
import org.sorapointa.proto.SceneWeaponInfo.*;
import org.sorapointa.proto.SceneWeaponInfo;

public class AvatarEquipChangeNotify {
    public enum AvatarEquipChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=639) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer itemId = null;
    @Tag(tag=11) public Long equipGuid = null;
    @Tag(tag=12) public Integer equipType = null;
    @Tag(tag=13) public SceneReliquaryInfo reliquary = null;
    @Tag(tag=15) public Long avatarGuid = null;
    @Tag(tag=10) public SceneWeaponInfo weapon = null;
}
