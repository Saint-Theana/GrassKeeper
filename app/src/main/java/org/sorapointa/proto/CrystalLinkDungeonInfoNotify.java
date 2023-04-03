package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CrystalLinkDungeonAvatarInfo.*;
import org.sorapointa.proto.CrystalLinkDungeonAvatarInfo;
import org.sorapointa.proto.CrystalLinkBuffInfo.*;
import org.sorapointa.proto.CrystalLinkBuffInfo;

public class CrystalLinkDungeonInfoNotify {
    public enum CrystalLinkDungeonInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8343) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer initGalleryProgress = null;
    @Tag(tag=9) public Integer difficultyId = null;
    @Tag(tag=10) public List<CrystalLinkDungeonAvatarInfo> dungeonAvatarInfoList = new ArrayList<>();
    @Tag(tag=15) public Boolean isUpperPart = null;
    @Tag(tag=6) public Integer levelId = null;
    @Tag(tag=2) public List<CrystalLinkBuffInfo> buffInfoList = new ArrayList<>();
}
