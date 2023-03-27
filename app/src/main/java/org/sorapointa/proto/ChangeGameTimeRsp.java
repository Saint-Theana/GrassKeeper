package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeGameTimeRsp {
    public enum ChangeGameTimeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=114) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer curGameTime = null;
    @Tag(tag=5) public Integer extraDays = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
