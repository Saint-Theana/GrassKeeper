package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingScanRsp {
    public enum BlessingScanRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2122) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer curDayScanNum = null;
    @Tag(tag=9) public Integer scanPicId = null;
}
