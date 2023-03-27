package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSDeckSaveRsp {
    public enum KMBJACGLCPJ {
        @Tag(tag=0) None ,
        @Tag(tag=7791) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer createTime = null;
    @Tag(tag=1) public Integer deckId = null;
    @Tag(tag=11) public Boolean isValid = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
