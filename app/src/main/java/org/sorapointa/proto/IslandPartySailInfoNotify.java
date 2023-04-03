package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IslandPartySailStage.*;
import org.sorapointa.proto.IslandPartySailStage;

public class IslandPartySailInfoNotify {
    public enum IslandPartySailInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5525) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer progress = null;
    @Tag(tag=1) public Integer coin = null;
    @Tag(tag=9) public Integer killMonsterCount = null;
    @Tag(tag=2) public Integer stage = null;
}
