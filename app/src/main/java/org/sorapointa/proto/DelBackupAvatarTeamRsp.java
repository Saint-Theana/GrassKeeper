package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DelBackupAvatarTeamRsp {
    @Tag(tag=15) public Integer backupAvatarTeamId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
