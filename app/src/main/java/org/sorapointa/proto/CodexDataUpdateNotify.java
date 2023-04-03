package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CodexType.*;
import org.sorapointa.proto.CodexType;

public class CodexDataUpdateNotify {
    public enum CodexDataUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4202) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer type = null;
    @Tag(tag=6) public Integer id = null;
    @Tag(tag=1) public Integer weaponMaxPromoteLevel = null;
}
