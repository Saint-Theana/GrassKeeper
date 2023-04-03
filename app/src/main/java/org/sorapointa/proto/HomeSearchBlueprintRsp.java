package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeBlueprintSearchInfo.*;
import org.sorapointa.proto.HomeBlueprintSearchInfo;

public class HomeSearchBlueprintRsp {
    public enum IFDAAOOKFDC {
        @Tag(tag=0) None ,
        @Tag(tag=4611) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public HomeBlueprintSearchInfo searchInfo = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
