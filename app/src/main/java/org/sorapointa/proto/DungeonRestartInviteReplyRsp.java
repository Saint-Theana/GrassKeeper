package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonRestartInviteReplyRsp {
    @Tag(tag=10) public Boolean isAccept = null;
    @Tag(tag=1) public Boolean isTransPoint = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
