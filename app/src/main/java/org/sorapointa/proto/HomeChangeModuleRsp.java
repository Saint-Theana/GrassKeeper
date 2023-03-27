package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeChangeModuleRsp {
    public enum HomeChangeModuleRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4833) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer targetModuleId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
