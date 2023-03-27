package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SelectWorktopOptionRsp {
    public enum SelectWorktopOptionRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=874) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer gadgetEntityId = null;
    @Tag(tag=4) public Integer optionId = null;
}
