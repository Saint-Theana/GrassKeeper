package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CrystalLinkBuffInfo.*;
import org.sorapointa.proto.CrystalLinkBuffInfo;
import org.sorapointa.proto.CrystalLinkDungeonAvatarInfo.*;
import org.sorapointa.proto.CrystalLinkDungeonAvatarInfo;

public class CrystalLinkDungeonInfoNotify {
    @Tag(tag=8) public List<CrystalLinkBuffInfo> buffInfoList = new ArrayList<>();
    @Tag(tag=1) public Integer levelId = null;
    @Tag(tag=15) public Boolean isUpperPart = null;
    @Tag(tag=11) public Integer difficultyId = null;
    @Tag(tag=3) public List<CrystalLinkDungeonAvatarInfo> dungeonAvatarInfoList = new ArrayList<>();
    @Tag(tag=7) public Integer initGalleryProgress = null;
}
