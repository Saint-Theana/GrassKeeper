package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueDiaryRoomInfo.*;
import org.sorapointa.proto.RogueDiaryRoomInfo;

public class RogueDiaryDungeonInfoNotify {
    @Tag(tag=12) public Integer stageId = null;
    @Tag(tag=15) public List<Integer> roundMonsterList = new ArrayList<>();
    @Tag(tag=4) public Integer time = null;
    @Tag(tag=5) public Integer curRoom = null;
    @Tag(tag=6) public Integer curRound = null;
    @Tag(tag=11) public Integer coin = null;
    @Tag(tag=8) public Integer difficulty = null;
    @Tag(tag=14) public Integer dungeonId = null;
    @Tag(tag=7) public List<RogueDiaryRoomInfo> roomList = new ArrayList<>();
    @Tag(tag=10) public List<Integer> roundCardList = new ArrayList<>();
}
