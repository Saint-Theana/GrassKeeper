package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DelBackupAvatarTeamRsp {
    public enum HMFPBAACAFA {
        @Tag(tag=0) None ,
        @Tag(tag=1756) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer backupAvatarTeamId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
