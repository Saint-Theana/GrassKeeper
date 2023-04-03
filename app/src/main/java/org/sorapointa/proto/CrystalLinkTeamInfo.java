package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CrystalLinkAvatarInfo.*;
import org.sorapointa.proto.CrystalLinkAvatarInfo;
import org.sorapointa.proto.CrystalLinkBuffInfo.*;
import org.sorapointa.proto.CrystalLinkBuffInfo;

public class CrystalLinkTeamInfo {
    @Tag(tag=13) public List<CrystalLinkAvatarInfo> avatarInfoList = new ArrayList<>();
    @Tag(tag=10) public List<CrystalLinkBuffInfo> buffInfoList = new ArrayList<>();
}
