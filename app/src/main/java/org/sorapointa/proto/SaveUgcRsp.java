package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class SaveUgcRsp {
    public enum SaveUgcRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6335) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Long ugcGuid = null;
    @Tag(tag=15) public Integer ugcType = null;
}
