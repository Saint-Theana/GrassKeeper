package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeChangeEditModeRsp {
    public enum HomeChangeEditModeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4767) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Boolean isEnterEditMode = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
