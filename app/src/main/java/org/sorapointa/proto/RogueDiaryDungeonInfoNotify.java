package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueDiaryRoomInfo.*;
import org.sorapointa.proto.RogueDiaryRoomInfo;

public class RogueDiaryDungeonInfoNotify {
    public enum RogueDiaryDungeonInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8695) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Integer stageId = null;
    @Tag(tag=13) public List<Integer> roundCardList = new ArrayList<>();
    @Tag(tag=7) public Integer time = null;
    @Tag(tag=12) public Integer curRound = null;
    @Tag(tag=14) public Integer coin = null;
    @Tag(tag=11) public List<Integer> roundMonsterList = new ArrayList<>();
    @Tag(tag=4) public Integer difficulty = null;
    @Tag(tag=5) public List<RogueDiaryRoomInfo> roomList = new ArrayList<>();
    @Tag(tag=15) public Integer dungeonId = null;
    @Tag(tag=1) public Integer curRoom = null;
}
