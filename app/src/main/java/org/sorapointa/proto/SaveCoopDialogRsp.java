package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SaveCoopDialogRsp {
    public enum SaveCoopDialogRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1962) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer dialogId = null;
    @Tag(tag=14) public Integer mainCoopId = null;
}
