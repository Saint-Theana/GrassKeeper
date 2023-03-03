package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpgradeRoguelikeShikigamiRsp {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer shikigamiGroupId = null;
    @Tag(tag=4) public Integer curLevel = null;
}
