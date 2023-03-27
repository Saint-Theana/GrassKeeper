package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeSearchBlueprintReq {
    public enum OLPKDIPAOHO {
        @Tag(tag=0) None ,
        @Tag(tag=4713) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public String shareCode = null;
}
