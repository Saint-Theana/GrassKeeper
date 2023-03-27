package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CustomDungeonSetting {
    @Tag(tag=13) public List<Integer> openRoomList = new ArrayList<>();
    @Tag(tag=9) public Integer lifeNum = null;
    @Tag(tag=4) public Integer coinLimit = null;
    @Tag(tag=10) public Integer startRoomId = null;
    @Tag(tag=11) public Boolean isForbidSkill = null;
    @Tag(tag=2) public Integer timeLimit = null;
    @Tag(tag=14) public Boolean isArriveFinish = null;
}
