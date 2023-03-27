package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetPlayerBirthdayRsp {
    public enum SetPlayerBirthdayRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4016) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Birthday birthday = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
