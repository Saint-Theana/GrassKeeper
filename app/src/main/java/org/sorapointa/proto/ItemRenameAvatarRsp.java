package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ItemRenameAvatarRsp {
    public enum BDEOFMOFEEF {
        @Tag(tag=0) None ,
        @Tag(tag=1628) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer renameId = null;
    @Tag(tag=7) public Integer cdTime = null;
}
