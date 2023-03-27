package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SpiceActivityFinishMakeSpiceRsp {
    public enum SpiceActivityFinishMakeSpiceRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8964) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Boolean isSuccess = null;
    @Tag(tag=1) public Integer stageId = null;
}
