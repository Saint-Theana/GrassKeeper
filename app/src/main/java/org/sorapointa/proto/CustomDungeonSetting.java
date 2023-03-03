package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CustomDungeonSetting {
    @Tag(tag=1) public List<Integer> openRoomList = new ArrayList<>();
    @Tag(tag=14) public Boolean isArriveFinish = null;
    @Tag(tag=6) public Integer lifeNum = null;
    @Tag(tag=4) public Integer startRoomId = null;
    @Tag(tag=3) public Boolean isForbidSkill = null;
    @Tag(tag=10) public Integer coinLimit = null;
    @Tag(tag=9) public Integer timeLimit = null;
}
