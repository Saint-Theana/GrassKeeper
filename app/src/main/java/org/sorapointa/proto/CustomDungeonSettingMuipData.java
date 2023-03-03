package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CustomDungeonSettingMuipData {
    @Tag(tag=1) public Boolean isArriveFinish = null;
    @Tag(tag=2) public Integer coinLimit = null;
    @Tag(tag=3) public Integer timeLimit = null;
    @Tag(tag=4) public Boolean isForbidSkill = null;
    @Tag(tag=5) public Integer lifeNum = null;
}
