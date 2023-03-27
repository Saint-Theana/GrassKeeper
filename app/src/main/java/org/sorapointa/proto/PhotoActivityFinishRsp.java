package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PhotoActivityFinishRsp {
    public enum PhotoActivityFinishRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8044) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer posId = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
