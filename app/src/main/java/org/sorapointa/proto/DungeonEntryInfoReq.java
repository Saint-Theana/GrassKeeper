package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Uint32Pair.*;
import org.sorapointa.proto.Uint32Pair;

public class DungeonEntryInfoReq {
    public enum DungeonEntryInfoReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=905) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Integer pointId = null;
    @Tag(tag=12) public List<Uint32Pair> scenePointIdList = new ArrayList<>();
    @Tag(tag=3) public Integer sceneId = null;
}
