package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueDiaryDungeonSettleNotify {
    public enum RogueDiaryDungeonSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8224) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Boolean isFinish = null;
    @Tag(tag=3) public Integer exploreTime = null;
    @Tag(tag=12) public Integer curRound = null;
}
