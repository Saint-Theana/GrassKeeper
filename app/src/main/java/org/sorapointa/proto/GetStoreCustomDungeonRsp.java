package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OtherCustomDungeonBrief.*;
import org.sorapointa.proto.OtherCustomDungeonBrief;

public class GetStoreCustomDungeonRsp {
    public enum GetStoreCustomDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6212) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public List<OtherCustomDungeonBrief> customDungeonList = new ArrayList<>();
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
