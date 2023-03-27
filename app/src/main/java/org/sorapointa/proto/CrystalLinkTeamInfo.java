package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CrystalLinkTeamInfo {
    @Tag(tag=13) public List<CrystalLinkAvatarInfo> avatarInfoList = new ArrayList<>();
    @Tag(tag=10) public List<CrystalLinkBuffInfo> buffInfoList = new ArrayList<>();
}
