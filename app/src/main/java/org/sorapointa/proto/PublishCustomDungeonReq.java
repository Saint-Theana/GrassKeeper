package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PublishCustomDungeonReq {
    public enum PublishCustomDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6214) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Long dungeonGuid = null;
    @Tag(tag=1) public List<Integer> tagList = new ArrayList<>();
}
