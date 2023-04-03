package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OtherCustomDungeonBrief.*;
import org.sorapointa.proto.OtherCustomDungeonBrief;

public class SearchCustomDungeonRsp {
    public enum SearchCustomDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6224) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public OtherCustomDungeonBrief customDungeonBrief = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
