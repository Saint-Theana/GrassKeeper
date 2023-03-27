package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetAuthkeyRsp {
    public enum GetAuthkeyRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1462) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public String gameBiz = null;
    @Tag(tag=3) public Integer signType = null;
    @Tag(tag=11) public String authAppid = null;
    @Tag(tag=7) public Integer authkeyVer = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public String authkey = null;
}
