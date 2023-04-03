package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class CheckUgcUpdateRsp {
    public enum CheckUgcUpdateRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6340) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer ugcType = null;
    @Tag(tag=2) public List<Long> updateUgcGuidList = new ArrayList<>();
}
