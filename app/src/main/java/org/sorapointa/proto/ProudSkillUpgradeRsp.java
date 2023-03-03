package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ProudSkillUpgradeRsp {
    @Tag(tag=6) public Long avatarGuid = null;
    @Tag(tag=10) public Integer proudSkillId = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
