package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusRenameRsp {
    public enum NJFOKBFCGEJ {
        @Tag(tag=0) None ,
        @Tag(tag=23858) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer fungusId = null;
    @Tag(tag=7) public Integer nameId = null;
}
