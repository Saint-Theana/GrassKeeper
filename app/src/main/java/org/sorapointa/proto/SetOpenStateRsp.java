package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetOpenStateRsp {
    public enum SetOpenStateRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=125) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Integer value = null;
    @Tag(tag=10) public Integer key = null;
}
