package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ProjectorOptionRsp {
    public enum ProjectorOptionRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=845) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer entityId = null;
    @Tag(tag=3) public Integer opType = null;
}
