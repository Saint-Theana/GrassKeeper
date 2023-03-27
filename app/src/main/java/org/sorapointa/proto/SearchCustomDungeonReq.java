package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SearchCustomDungeonReq {
    public enum SearchCustomDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6222) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public String dungeonCode = null;
}
