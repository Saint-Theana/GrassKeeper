package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ProudSkillUpgradeReq {
    @Tag(tag=5) public Long avatarGuid = null;
    @Tag(tag=4) public Integer oldProudSkillLevel = null;
    @Tag(tag=14) public Integer proudSkillId = null;
}
